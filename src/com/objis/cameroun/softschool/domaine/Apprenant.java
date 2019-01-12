/**
 * 
 */
package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a un Apprenant.
 * @version 1.0 
 */
public class Apprenant extends Utilisateur{

	private String niveau;
	private String langue;
	
	
	/**
	 * @param idUtilisateur
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param role
	 * @param niveau
	 * @param langue
	 */
	public Apprenant(String nom, String prenom, String code, String telephone, String email, String login,
			String password, String role, String niveau, String langue) {
		super(nom, prenom, code, telephone, email, login, password, role);
		this.niveau = niveau;
		this.langue = langue;
	}
	
	public Apprenant(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,
			String login, String password, String role, String niveau, String langue) {
		super(idUtilisateur, nom, prenom, code, telephone, email, login, password, role);
		this.niveau = niveau;
		this.langue = langue;
	}

	/**
	 * @return la valeure de la propriete niveau
	 */
	public String getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau c'est la valeure de la propriete niveau a modifier
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	/**
	 * @return la valeure de la propriete langue
	 */
	public String getLangue() {
		return langue;
	}
	/**
	 * @param langue c'est la valeure de la propriete langue a modifier
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}
	
}
