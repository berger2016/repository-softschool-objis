package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 *
 */
public class ApprenantDansClasse {
	
	private String niveau;
	private String langue;
	private String libelle;
	private String nom;
	private String prenom;
	private String code;
	private String telephone;
	private String email;
	
	
	public ApprenantDansClasse(String niveau, String langue, String libelle, String nom, String prenom, String code,
			String telephone, String email) {
		super();
		this.niveau = niveau;
		this.langue = langue;
		this.libelle = libelle;
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
		this.telephone = telephone;
		this.email = email;
	}


	public ApprenantDansClasse() {
		super();
	}


	/**
	 * @return the niveau
	 */
	public String getNiveau() {
		return niveau;
	}


	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}


	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}


	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApprenantDansClasse [niveau=" + niveau + ", langue=" + langue + ", libelle=" + libelle + ", nom=" + nom
				+ ", prenom=" + prenom + ", code=" + code + ", telephone=" + telephone + ", email=" + email + "]";
	}
 
	


}
