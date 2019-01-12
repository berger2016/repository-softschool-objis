package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a une Notion.
 * @version 1.0
 */
public class Notions {
	
	private int idNotions;
	private String libelle;
	private int idModules;

	/**
	 * @param idNotions
	 * @param libelle
	 * @param idModules
	 */
	public Notions(int idNotions, String libelle, int idModules) {
		super();
		this.idNotions = idNotions;
		this.libelle = libelle;
		this.idModules = idModules;
	}

	public Notions(String libelle, int idModules) {
		super();
		this.libelle = libelle;
		this.idModules = idModules;
	}

	public Notions() {
	}

	/**
	 * @return the idNotions
	 */
	public int getIdNotions() {
		return idNotions;
	}

	/**
	 * @param idNotions the idNotions to set
	 */
	public void setIdNotions(int idNotions) {
		this.idNotions = idNotions;
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
	 * @return the idModules
	 */
	public int getIdModules() {
		return idModules;
	}

	/**
	 * @param idModules the idModules to set
	 */
	public void setIdModules(int idModules) {
		this.idModules = idModules;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Notions [idNotions=" + idNotions + ", libelle=" + libelle + ", idModules=" + idModules + "]";
	}

}
