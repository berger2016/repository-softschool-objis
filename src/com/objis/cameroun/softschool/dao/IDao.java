package com.objis.cameroun.softschool.dao;

import java.util.List;

import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.ApprenantDansClasse;
import com.objis.cameroun.softschool.domaine.Cathegorie;
import com.objis.cameroun.softschool.domaine.Classe;
import com.objis.cameroun.softschool.domaine.Enseignant;
import com.objis.cameroun.softschool.domaine.Expert;
import com.objis.cameroun.softschool.domaine.FournisseurContenu;

public interface IDao {
	
	/**
	 * @param contenue
	 * Description: ce savoir-faire permet d'enregistrer le contenue passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public <T> void enregistrerContenuDao(T contenue); 


	/**
	 * @param apprenant
	 * Description: ce savoir-faire permet d'enregistrer l'apprenant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public  void enregistrerApprenantDao(Apprenant apprenant, int idclasse);


	/**
	 * @param enseignant
	 * Description: ce savoir-faire permet d'enregistrer l'enseignant passe en parametre.
	 * Pour le moment il ne fait que reourner l'etat de l'objet a enregistrer,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public  void enregistrerEnseignantDao(Enseignant enseignant, int idcathegorie, int idclasse);
	
	/**
	 * @param expert
	 * Description: ce savoir-faire permet d'enregistrer l'expert passe en parametre.
	 */
	public  void enregistrerExpertDao(Expert expert, int idcathegorie);

	/**
	 * @param fcontenu
	 * Description: ce savoir-faire permet d'enregistrer le fournisseur de contenu passe en parametre.
	 */
	public  void enregistrerFournisseurContenueDao(FournisseurContenu fcontenu);


	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 * 
	 */
	public void afficheDetailsEnseignantDao();


	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public void afficheDetailsContenuDao();


	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher juste un petit message,mais on l'ameliorera au fur et a mesure
	 * que l'on avancera dans les modules.
	 */
	public List<ApprenantDansClasse> afficheDetailsApprenantDao();

	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher la liste des classe d'un sous-systeme educatif
	 */
	public List<Classe> afficheListeClasseDao(int idEtablissement);
	/**
	 * Description: ce savoir-faire permet Pour le moment, d'afficher la liste des cathegories
	 */
	public List<Cathegorie> afficheListeCathegorieDao();



}
