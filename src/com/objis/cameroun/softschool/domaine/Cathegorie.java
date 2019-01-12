package com.objis.cameroun.softschool.domaine;

/**
 * @author Banga Erick
 * @since 26/11/2018
 * @see Description: Cette classe permet de definir les propretes et methodes specifique a une Cathegorie.
 * @version 1.0
 */
public class Cathegorie {
	
	private String libelle;
	private int idCathegorie;

	/**
	 * @param libelle
	 * @param idCathegorie
	 */
	public Cathegorie(String libelle, int idCathegorie) {
		super();
		this.libelle = libelle;
		this.idCathegorie = idCathegorie;
	}

	public Cathegorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Cathegorie() {
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
		return "Cathegorie [libelle=" + libelle + ", idCathegorie=" + idCathegorie + "]";
	}

}
