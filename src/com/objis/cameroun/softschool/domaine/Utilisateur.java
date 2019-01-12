/**
 * 
 */
package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 23/09/2018
 * @see Description: Cette classe permet de factoriser les proprietes et methodes communes aux classes 'Apprenant' et 'Enseignant'
 * @version 1.0 
 */
public class Utilisateur {
	
	protected int idUtilisateur;
	protected String nom;
	protected String prenom;
	protected String code;
	protected String telephone;
	protected String email;
	protected String role;
	protected String login;
	protected String password;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param code
	 * @param telephone
	 * @param email
	 * @param idUtilisateur
	 * @param role
	 */
	
	public Utilisateur(String nom, String prenom, String code, String telephone, String email, String login, String password,String role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
		this.telephone = telephone;
		this.email = email;
		this.role = role;
		this.login = login;
		this.password = password;
	}
	public Utilisateur(int idUtilisateur, String nom, String prenom, String code, String telephone, String email,String login, String password, String role) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
		this.telephone = telephone;
		this.email = email;
		this.role = role;
		this.login = login;
		this.password = password;
	}
	
	public Utilisateur() {
		super();
	}
	/**
	 * @return the idUtilisateur
	 */
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom + ", code=" + code
				+ ", telephone=" + telephone + ", email=" + email + ", role=" + role + ", login=" + login
				+ ", password=" + password + "]";
	}
	
}
