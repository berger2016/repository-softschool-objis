package com.objis.cameroun.softschool.domaine;

/**
 * @author NGAUSS Banga Erick
 * @eince  20/09/2018
 * @see Description: Cette classe permet de transporter les donnees d'un contenue
 * @version 1.0
 */
public class Contenue <T>{
		
	private String nom;
	private String type;
	private String url;
	private T description;
	private String auteur;
	
	/**
	 * @param nom
	 * @param type
	 * @param url
	 * @param description
	 * @param auteur
	 * Constructeur de l'objet contenue
	 */
	public Contenue(String nom, String type, String url, T description, String auteur) {
		super();
		this.nom = nom;
		this.type = type;
		this.url = url;
		this.description = description;
		this.auteur = auteur;
	}

		
	/**
	 * @return
	 * Retourne le nom du comtenue
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom
	 * mise-a-jour de la valeure du nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return
	 * retourne le type du contenue
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type
	 * mise-a-jour de la valeure de type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return
	 * retourne l'url du contenu
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url
	 * mise a jour de la valeure de l'url du document
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return
	 * retourne une description du contenu du document
	 */
	public T getDescription() {
		return description;
	}
	/**
	 * @param description
	 * mise-a-jour de la description du contenu du document 
	 */
	public void setDescription(T description) {
		this.description = description;
	}
	/**
	 * @return
	 * retourne l'auteur du document
	 */
	public String getAuteur() {
		return auteur;
	}
	/**
	 * @param auteur
	 * Mise-a-jour de l'auteur du document
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
		
		/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Cette methode permet d'afficher l'etat de l'objet contenu
	 */
	@Override
	public String toString() {
		return "Contenue [nom=" + nom +", \n"
				+ "\t \t type=" + type + ", \n"
				+ "\t \t url=" + url + ", \n"
				+ "\t \t description="+ description + ", \n"
				+ "\t \t auteur=" + auteur + "]";
	}
	
	

}
