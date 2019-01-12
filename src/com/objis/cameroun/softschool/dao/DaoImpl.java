package com.objis.cameroun.softschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.ApprenantDansClasse;
import com.objis.cameroun.softschool.domaine.Cathegorie;
import com.objis.cameroun.softschool.domaine.Classe;
import com.objis.cameroun.softschool.domaine.Enseignant;
import com.objis.cameroun.softschool.domaine.Expert;
import com.objis.cameroun.softschool.domaine.FournisseurContenu;

public class DaoImpl implements IDao {

	public DaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contenue
	 *            Description: ce savoir-faire permet d'enregistrer le contenue
	 *            passe en parametre. Pour le moment il ne fait que reourner l'etat
	 *            de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 *            que l'on avancera dans les modules.
	 */
	public <T> void enregistrerContenuDao(T contenue) {

		System.out.println(">>>>" + contenue.toString() + " enregistre avec success");

	}

	/**
	 * @param apprenant
	 *            Description: ce savoir-faire permet d'enregistrer l'apprenant
	 *            passe en parametre. Pour le moment il ne fait que reourner l'etat
	 *            de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 *            que l'on avancera dans les modules.
	 * 
	 */
	public void enregistrerApprenantDao(Apprenant apprenant, int idclasse) {

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation des la requetes

			String sql = "insert into `utilisateur`(`nom`,`prenom`,`telephone`,`email`,`role`,`login`,`password`,`profile`,`grade`,`specialite`,`langue`,`diplome`,`experience`)"
					+ "values (?,?,?,?,?,?,?,NULL,NULL,NULL,?,NULL,NULL)";

			String sql2 = "select `idUtilisateur` from `utilisateur` where  `login` =? AND `password` =?";

			String sql3 = "insert into `classeapprenant`(`idclasse`,`idutilisateur`)values (?,?)";

			PreparedStatement ps3 = cn.prepareStatement(sql3);
			PreparedStatement ps2 = cn.prepareStatement(sql2);
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, apprenant.getNom());
			ps.setString(2, apprenant.getPrenom());
			ps.setString(3, apprenant.getTelephone());
			ps.setString(4, apprenant.getEmail());
			ps.setString(5, apprenant.getRole());
			ps.setString(6, apprenant.getLogin());
			ps.setString(7, apprenant.getPassword());
			ps.setString(8, apprenant.getLangue());

			ps2.setString(1, apprenant.getLogin());
			ps2.setString(2, apprenant.getPassword());

			// Etape 3 : exécution requête ces deux instructions devraient etre dans des
			// transactions
			ps.executeUpdate();
			ResultSet rs2 = ps2.executeQuery();
			rs2.next();

			ps3.setInt(1, idclasse);
			ps3.setInt(2, rs2.getInt("idUtilisateur"));

			ps3.executeUpdate();

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

		System.out.println(">>>>" + apprenant.toString() + "enregistre avec success");
	}

	/**
	 * @param enseignant
	 *            Description: ce savoir-faire permet d'enregistrer l'enseignant
	 *            passe en parametre. Pour le moment il ne fait que reourner l'etat
	 *            de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 *            que l'on avancera dans les modules.
	 */
	public void enregistrerEnseignantDao(Enseignant enseignant, int idcathegorie, int idclasse) {

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation de la requete

			String sql = "insert into `utilisateur`(`nom`,`prenom`,`telephone`,`email`,`role`,`login`,`password`,`profile`,`grade`,`specialite`,`langue`,`diplome`,`experience`)"
					+ "values (?,?,?,?,?,?,?,NULL,?,?,?,NULL,NULL)";

			String sql1 = "select `idUtilisateur` from `utilisateur` where  `login` =? AND `password` =?";

			String sql2 = "insert into `enseignantparclasse`(`idutilisateur`,`idclasse`)values (?,?)";

			String sql3 = "insert into `enseignantparcathegorie`(`idenseignant`,`idcathegorie`,`experience`)values (?,?,NULL)";

			PreparedStatement ps = cn.prepareStatement(sql);
			PreparedStatement ps1 = cn.prepareStatement(sql1);
			PreparedStatement ps2 = cn.prepareStatement(sql2);
			PreparedStatement ps3 = cn.prepareStatement(sql3);
			ps.setString(1, enseignant.getNom());
			ps.setString(2, enseignant.getPrenom());
			ps.setString(3, enseignant.getTelephone());
			ps.setString(4, enseignant.getEmail());
			ps.setString(5, enseignant.getRole());
			ps.setString(6, enseignant.getLogin());
			ps.setString(7, enseignant.getPassword());
			ps.setString(8, enseignant.getGrade());
			ps.setString(9, enseignant.getSpecialite());
			ps.setString(10, enseignant.getLangue());

			ps1.setString(1, enseignant.getLogin());
			ps1.setString(2, enseignant.getPassword());

			// Etape 3 : exécution requête
			ps.executeUpdate();

			ResultSet rs2 = ps1.executeQuery();
			rs2.next();

			ps2.setInt(2, idclasse);
			ps2.setInt(1, rs2.getInt("idUtilisateur"));

			ps3.setInt(2, idcathegorie);
			ps3.setInt(1, rs2.getInt("idUtilisateur"));

			ps2.executeUpdate();
			ps3.executeUpdate();
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

		System.out.println(">>>>" + enseignant.toString() + " enregistre avec success");

	}

	/**
	 * @param expert
	 *            Description: ce savoir-faire permet d'enregistrer l'expert passe
	 *            en parametre.
	 */
	public void enregistrerExpertDao(Expert expert, int idcathegorie) {

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation des la requetes

			String sql = "insert into `utilisateur`(`nom`,`prenom`,`telephone`,`email`,`role`,`login`,`password`,`profile`,`grade`,`specialite`,`langue`,`diplome`,`experience`)"
					+ "values (?,?,?,?,?,?,?,NULL,?,?,NULL,NULL,?)";

			String sql2 = "select `idUtilisateur` from `utilisateur` where  `login` =? AND `password` =?";

			String sql3 = "insert into `expertparcathegorie`(`idexpert`,`idcathegorie`)values (?,?)";

			PreparedStatement ps3 = cn.prepareStatement(sql3);
			PreparedStatement ps2 = cn.prepareStatement(sql2);
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, expert.getNom());
			ps.setString(2, expert.getPrenom());
			ps.setString(3, expert.getTelephone());
			ps.setString(4, expert.getEmail());
			ps.setString(5, expert.getRole());
			ps.setString(6, expert.getLogin());
			ps.setString(7, expert.getPassword());
			ps.setString(8, expert.getGrade());
			ps.setString(9, expert.getSpecialite());
			ps.setString(10, expert.getExperience());

			ps2.setString(1, expert.getLogin());
			ps2.setString(2, expert.getPassword());

			// Etape 3 : exécution requête ces deux instructions devraient etre dans des
			// transactions
			ps.executeUpdate();
			ResultSet rs2 = ps2.executeQuery();
			rs2.next();

			ps3.setInt(2, idcathegorie);
			ps3.setInt(1, rs2.getInt("idUtilisateur"));

			ps3.executeUpdate();

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	/**
	 * @param fcontenu
	 *            Description: ce savoir-faire permet d'enregistrer le fournisseur
	 *            de contenu passe en parametre.
	 */
	public void enregistrerFournisseurContenueDao(FournisseurContenu fcontenu) {

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation de la requete

			String sql = "insert into `utilisateur`(`nom`,`prenom`,`telephone`,`email`,`role`,`login`,`password`,`profile`,`grade`,`specialite`,`langue`,`diplome`,`experience`)"
					+ "values (?,?,?,?,?,?,?,NULL,NULL,?,NULL,NULL,NULL)";

			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, fcontenu.getNom());
			ps.setString(2, fcontenu.getPrenom());
			ps.setString(3, fcontenu.getTelephone());
			ps.setString(4, fcontenu.getEmail());
			ps.setString(5, fcontenu.getRole());
			ps.setString(6, fcontenu.getLogin());
			ps.setString(7, fcontenu.getPassword());
			// ps.setString(8, enseignant.getGrade());
			ps.setString(8, fcontenu.getSpecialite());
			// ps.setString(10, fcontenu.getLangue());

			// Etape 3 : exécution requête
			ps.executeUpdate();

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit
	 * message,mais on l'ameliorera au fur et a mesure que l'on avancera dans les
	 * modules.
	 * 
	 */
	public void afficheDetailsEnseignantDao() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un enseignant");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit
	 * message,mais on l'ameliorera au fur et a mesure que l'on avancera dans les
	 * modules.
	 */
	public void afficheDetailsContenuDao() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un Contenu");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit
	 * message,mais on l'ameliorera au fur et a mesure que l'on avancera dans les
	 * modules.
	 */
	public List<ApprenantDansClasse> afficheDetailsApprenantDao() {
		
		List<ApprenantDansClasse> listeapprenants = new ArrayList<ApprenantDansClasse>();

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation des la requetes

			String sql = "SELECT * FROM `utilisateur` u INNER JOIN `classeapprenant` c "
					+ "ON u.`idUtilisateur` = c.`idutilisateur` INNER JOIN `classe` cl "
					+ "ON c.`idclasse` = cl.`idclasse`" + 
					  "WHERE `role` = ?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, "APPR");
			// Etape 3 : exécution requête ces deux instructions devraient etre dans des
			// transactions
			ResultSet rs = ps.executeQuery();
			// Etape 4 :parcours Resultset (optionnel)
						while (rs.next()) {
							// recuperation des valeurs d'une ligne de la table Apprenant, pour initialiser
							// dans un objet Apprenant
							ApprenantDansClasse apprenantdantclasse = new ApprenantDansClasse();
							apprenantdantclasse.setNom(rs.getString("nom"));
							apprenantdantclasse.setPrenom(rs.getString("prenom"));
							apprenantdantclasse.setTelephone(rs.getString("telephone"));
							apprenantdantclasse.setEmail(rs.getString("email"));
							apprenantdantclasse.setLibelle(rs.getString("libelle"));
							apprenantdantclasse.setLangue(rs.getString("langue"));
							//apprenantdantclasse.setProfile(rs.getString("profile"));
							listeapprenants.add(apprenantdantclasse);

						}
			//rs.next();

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return listeapprenants;
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit
	 * message,mais on l'ameliorera au fur et a mesure que l'on avancera dans les
	 * modules.
	 */
	public List<Classe> afficheListeClasseDao(int idEtablissement) {

		List<Classe> classes = new ArrayList<Classe>();

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation de la requete

			String sql = "select * from `classe` where `idsoussysteme` = ?";

			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setInt(1, idEtablissement);

			// Etape 3 : exécution requête
			ResultSet rs = ps.executeQuery();

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				// recuperation des valeurs d'une ligne de la table classe, pour initialiser
				// dans un objet classes
				Classe classe = new Classe();
				classe.setIdClasse(rs.getInt("idClasse"));
				classe.setLibelle(rs.getString("libelle"));
				classe.setIdEtablissement(rs.getInt("idsoussysteme"));
				classes.add(classe);

			}

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

		// System.out.println(">>>>Ce savoir-faire retourne les details d'un
		// Apprenant");
		return classes;
	}

	public List<Cathegorie> afficheListeCathegorieDao() {

		List<Cathegorie> cathegories = new ArrayList<Cathegorie>();

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Création d'un objet statement et preparation de la requete

			String sql = "select * from `cathegorie`";

			PreparedStatement ps = cn.prepareStatement(sql);
			// ps.setInt(1, idEtablissement);

			// Etape 3 : exécution requête
			ResultSet rs = ps.executeQuery();

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				// recuperation des valeurs d'une ligne de la table classe, pour initialiser
				// dans un objet classes
				Cathegorie cathegorie = new Cathegorie();
				cathegorie.setIdCathegorie(rs.getInt("idcathegorie"));
				cathegorie.setLibelle(rs.getString("libelle"));
				cathegories.add(cathegorie);

			}

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();

		}

		// System.out.println(">>>>Ce savoir-faire retourne les details d'un
		// Apprenant");
		return cathegories;
	}

}
