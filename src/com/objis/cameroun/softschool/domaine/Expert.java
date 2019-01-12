package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a un Utilisateur.
 * @version 2.0
 */
public class Expert extends Utilisateur {
	
	private String specialite;
	private String diplome;
	private String experience;
	private String grade;
	

	/**
	 * @param idUtilisateur
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param role
	 * @param specialite
	 * @param diplome
	 * @param experience
	 */
	
	public Expert(String nom, String prenom, String code, String telephone, String email, String login, String password,
			String role, String specialite, String diplome, String experience,String grade) {
		super(nom, prenom, code, telephone, email, login, password, role);
		this.specialite = specialite;
		this.diplome = diplome;
		this.experience = experience;
		this.grade = grade;
	}

	public Expert(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,
			String login, String password, String role, String specialite, String diplome, String experience,
			String grade) {
		super(idUtilisateur, nom, prenom, code, telephone, email, login, password, role);
		this.specialite = specialite;
		this.diplome = diplome;
		this.experience = experience;
		this.grade = grade;
	}




	public Expert() {
		super();
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	/**
	 * @return the diplome
	 */
	public String getDiplome() {
		return diplome;
	}
	/**
	 * @param diplome the diplome to set
	 */
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	/**
	 * @return the experience
	 */
	public String getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
		
}

