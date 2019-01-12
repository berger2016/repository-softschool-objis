package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les proprietes et methodes specifique a une Classe de cours.
 * @version 2.0
 */
public class Classe {
	
	private int idClasse;
	private String libelle;
	private int idEtablissement;
	

	/**
	 * @param idClasse
	 * @param libelle
	 * @param idEtablissement
	 */
	
	public Classe(int idClasse, String libelle, int idEtablissement) {
		super();
		this.idClasse = idClasse;
		this.libelle = libelle;
		this.idEtablissement = idEtablissement;
	}

	public Classe(String libelle, int idEtablissement) {
		super();
		this.libelle = libelle;
		this.idEtablissement = idEtablissement;
	}

	public Classe() {
	}

	/**
	 * @return the idClasse
	 */
	public int getIdClasse() {
		return idClasse;
	}

	/**
	 * @param idClasse the idClasse to set
	 */
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
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
	 * @return the idEtablissement
	 */
	public int getIdEtablissement() {
		return idEtablissement;
	}

	/**
	 * @param idEtablissement the idEtablissement to set
	 */
	public void setIdEtablissement(int idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", libelle=" + libelle + ", idEtablissement=" + idEtablissement + "]";
	}
	
	

}
