package com.objis.cameroun.softschool.services;


import java.util.List;

import com.objis.cameroun.softschool.dao.DaoImpl;
import com.objis.cameroun.softschool.dao.IDao;
import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.ApprenantDansClasse;
import com.objis.cameroun.softschool.domaine.Cathegorie;
import com.objis.cameroun.softschool.domaine.Classe;
import com.objis.cameroun.softschool.domaine.Contenue;
import com.objis.cameroun.softschool.domaine.Enseignant;
//import com.objis.cameroun.softschool.dao.*;//Le dao doit etre importe, meme-si nous ne l'utilisons pas encore.
import com.objis.cameroun.softschool.domaine.Expert;
import com.objis.cameroun.softschool.domaine.FournisseurContenu;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de definir les services offerts par notre application. Les implementations de ces
 * services iront en s'ameliorant a mesure que l'on avancera dans la decouverte des modules.
 * Pour le momment, nous ne faisont qu'afficher des messages a l'ecran.
 * On  ntera egalement que la liste des services n'est pas exhaustive. 
 * @version 1.0 
 */
public class ServiceImpl implements IServices{

	private IDao dao;
	
	public ServiceImpl() {
		dao = new DaoImpl();
	}

	/**
	 * @param contenue
	 * Description: ce savoir-faire permet d'enregistrer le contenue passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public <T> void enregistrerContenu(T contenue) {

		System.out.println(">>>>" + contenue.toString() + " enregistre avec success");

	}

	/**
	 * @param apprenant
	 * Description: ce savoir-faire permet d'enregistrer l'apprenant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public  void enregistrerApprenant(Apprenant apprenant, int idclasse) {

		dao.enregistrerApprenantDao(apprenant,idclasse);
	}

	/**
	 * @param enseignant
	 * Description: ce savoir-faire permet d'enregistrer l'enseignant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public	 void enregistrerEnseignant(Enseignant enseignant, int idcathegorie, int idclasse) {
		
		dao.enregistrerEnseignantDao(enseignant,idcathegorie,idclasse);
		System.out.println(">>>>" + enseignant.toString() + " enregistre avec success");
	}
	
	/**
	 * @param expert
	 * Description: ce savoir-faire permet d'enregistrer l'expert passe en parametre.
	 */
	public  void enregistrerExpert(Expert expert, int idcathegorie) {
		
		dao.enregistrerExpertDao(expert,idcathegorie);
		System.out.println(">>>>" + expert.toString() + " enregistre avec success");

	}
	/**
	 * @param fcontenu
	 * Description: ce savoir-faire permet d'enregistrer le fournisseur de contenu passe en parametre.
	 */
	public  void enregistrerFournisseurContenue(FournisseurContenu fcontenu) {
		
		dao.enregistrerFournisseurContenueDao(fcontenu);
		System.out.println(">>>>" + fcontenu.toString() + " enregistre avec success");

	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public void afficheDetailsEnseignant() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un enseignant");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void afficheDetailsContenu() {

		System.out.println(">>>>Ce savoir-faire retourne les ddetails d'un Contenu");
	}

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public List<ApprenantDansClasse> afficheDetailsApprenant() {

		return dao.afficheDetailsApprenantDao();
	}
	
	@Override
	public List<Classe> afficheListeClasse(int idEtablissement){
		
		return dao.afficheListeClasseDao(idEtablissement);
	 
	}
	@Override
	public List<Cathegorie> afficheListeCathegorie(){
		
		return dao.afficheListeCathegorieDao();
	 
	}
}
