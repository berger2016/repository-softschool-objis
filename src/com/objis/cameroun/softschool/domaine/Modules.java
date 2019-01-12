package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a un Module.
 * @version 1.0
 */
public class Modules {

	
	private int idModules;
	private String libelle;
	private int idCathegorie;
	
		
	/**
	 * @param idModules
	 * @param libelle
	 * @param idCathegorie
	 */
	public Modules(int idModules, String libelle, int idCathegorie) {
		super();
		this.idModules = idModules;
		this.libelle = libelle;
		this.idCathegorie = idCathegorie;
	}


	public Modules(String libelle, int idCathegorie) {
		super();
		this.libelle = libelle;
		this.idCathegorie = idCathegorie;
	}

	public Modules() {
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
	 * @return the idCathegorie
	 */
	public int getIdCathegorie() {
		return idCathegorie;
	}


	/**
	 * @param idCathegorie the idCathegorie to set
	 */
	public void setIdCathegorie(int idCathegorie) {
		this.idCathegorie = idCathegorie;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Modules [idModules=" + idModules + ", libelle=" + libelle + ", idCathegorie=" + idCathegorie + "]";
	}

}
