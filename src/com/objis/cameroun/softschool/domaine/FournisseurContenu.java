package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les proprietes et methodes specifique a un Fournisseur de contenu.
 * 
 * @version 2.0
 *
 */
public class FournisseurContenu extends Utilisateur{
	
	private String specialite;
	private String experience;
		

	/**
	 * @param idUtilisateur
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param role
	 * @param specialite
	 * @param experience
	 */
		public FournisseurContenu(String nom, String prenom, String code, String telephone, String email, String login,
			String password, String role, String specialite, String experience) {
		super(nom, prenom, code, telephone, email, login, password, role);
		this.specialite = specialite;
		this.experience = experience;
	}

	public FournisseurContenu(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,
			String login, String password, String role, String specialite, String experience) {
		super(idUtilisateur, nom, prenom, code, telephone, email, login, password, role);
		this.specialite = specialite;
		this.experience = experience;
	}

	public FournisseurContenu() {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FournisseurContenu [specialite=" + specialite + ", experience=" + experience + ", nom=" + nom
				+ ", prenom=" + prenom + ", code=" + code + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
}
