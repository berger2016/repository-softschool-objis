package com.objis.cameroun.softschool.presentation;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.softschool.domaine.Apprenant;
import com.objis.cameroun.softschool.domaine.ApprenantDansClasse;
import com.objis.cameroun.softschool.domaine.Cathegorie;
import com.objis.cameroun.softschool.domaine.Classe;
import com.objis.cameroun.softschool.domaine.Contenue;
import com.objis.cameroun.softschool.domaine.Enseignant;
import com.objis.cameroun.softschool.domaine.Expert;
import com.objis.cameroun.softschool.domaine.FournisseurContenu;
import com.objis.cameroun.softschool.services.IServices;
import com.objis.cameroun.softschool.services.ServiceImpl;

public class SoftSchoolGUI {

	public static void main(String[] args) {

		char choix = 'O';
		IServices gestiondoc = new ServiceImpl();
		Scanner nomsc = new Scanner(System.in);
		Scanner prenomsc = new Scanner(System.in);
		Scanner codesc = new Scanner(System.in);
		Scanner telephonesc = new Scanner(System.in);
		Scanner emailsc = new Scanner(System.in);
		Scanner niveausc = new Scanner(System.in);
		Scanner languesc = new Scanner(System.in);
		Scanner gradesc = new Scanner(System.in);
		Scanner specialitesc = new Scanner(System.in);
		Scanner nomContenusc = new Scanner(System.in);
		Scanner typeContenusc = new Scanner(System.in);
		Scanner urlsc = new Scanner(System.in);
		Scanner descriptionsc = new Scanner(System.in);
		Scanner auteursc = new Scanner(System.in);
		Scanner loginsc = new Scanner(System.in);
		Scanner passwdsc = new Scanner(System.in);
	    Scanner idClassesc = new Scanner(System.in);
	    Scanner idCathegoriesc = new Scanner(System.in);
	    Scanner experiencesc = new Scanner(System.in);
	    int idCathegorie;
		String login;
		String experience;
		String passwd;
		String nomContenu;
		String typeContenu;
		String url;
		String description;
		String auteur;
		String nom;
		String prenom;
		String code;
		String telephone;
		String email;
		String niveau;
		String langue;
		String grade;
		String specialite;
		int idClasse;
		List<Classe> mesclasses;
		List<Cathegorie> mescathegories;
		List<ApprenantDansClasse> listeApprenantsDansClasse;
		char reponse;

		// Menu de notre Application
		System.out.println("																					");
		System.out.println("																					");
		System.out.println("			########################################################################");
		System.out.println("			###   MENU DE NOTRE APPLICATION DE GESTION DE CONTENU: SOFTSCHOOL    ###");
		System.out.println("			########################################################################");
		System.out.println("			###   1- Vous pouvez Enregistrer Un Apprenant dans notre Systeme     ###");
		System.out.println("			###   2- Vous pouvez Enregistrer Un Enseignant dans notre Systeme    ###");
		System.out.println("			###   3- Vous pouvez Enregistrer Un Contenu dans notre Systeme       ###");
		System.out.println("			###   4- Vous pouvez Afficher les details d'un Apprenant             ###");
		System.out.println("			###   5- Vous pouvez Afficher les details d'un Contenu               ###");
		System.out.println("			###   6- Vous pouvez Afficher les details d'un Enseignant            ###");
		System.out.println("			########################################################################");
		System.out.println("			###      Pour quitter appuyer sur q                                  ###");
		System.out.println("			########################################################################");
		System.out.println("");
		while (choix == 'O') {
			System.out.print(">>>>Faites votre choix en saisissant le numero de la fonctionnalite:  ");
			System.out.println("");
			Scanner sc = new Scanner(System.in);
			reponse = sc.nextLine().charAt(0);
			switch (reponse) {

			case '1':
				// Preparation des parametres du constructeur
				System.out.println(">>>>Saisisser les informations concernant l'apprenant");
				System.out.print(">>>>Nom de l'Apprenant:  ");
				nom = nomsc.nextLine();
				System.out.print(">>>>Prenom de l'Apprenant: ");
				prenom = prenomsc.nextLine();
				System.out.print(">>>>Code de l'Apprenant: ");
				code = codesc.nextLine();
				System.out.print(">>>>Telephone de l'Apprenant: ");
				telephone = telephonesc.nextLine();
				System.out.print(">>>>Email de l'Apprenant: ");
				email = emailsc.nextLine();
				System.out.print(">>>>Niveau de l'Apprenant: ");
				niveau = niveausc.nextLine();
				System.out.print(">>>>Langue de l'Apprenant: ");
				langue = languesc.nextLine();
				System.out.print(">>>>login de l'Apprenant: ");
				login = loginsc.nextLine();
				System.out.print(">>>>Mot de passe de l'Apprenant: ");
				passwd = passwdsc.nextLine();

				System.out.println("");
				//String "";
				// Appel de constructeur
				Apprenant apprenant = new Apprenant(nom, prenom, code, telephone, email,login,passwd,"APPR", niveau, langue);
				// Appel du service Enregistrer Apprenant
//				gestiondoc.enregistrerApprenant(apprenant);
				System.out.println(">>>>Choisir le numero idclasse correspondant a votre classe: ");
				System.out.println(">>>>");
				mesclasses = gestiondoc.afficheListeClasse(1);
				for(Classe classe:mesclasses) {
					
					System.out.println(classe);
				}
				System.out.println(">>>>");
				System.out.println(">>>>");
				System.out.print(">>>> ");
				idClasse = idClassesc.nextInt();
				gestiondoc.enregistrerApprenant(apprenant,idClasse);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;

			case '2':
				// Preparation des parametres du constructeur
				System.out.println(">>>>Saisisser les informations concernant l'Enseignant");
				System.out.print(">>>>Nom de l'Enseignant:  ");
				nom = nomsc.nextLine();
				System.out.print(">>>>Prenom de l'Enseignant: ");
				prenom = prenomsc.nextLine();
				System.out.print(">>>>Code de l'Enseignant: ");
				code = codesc.nextLine();
				System.out.print(">>>>Telephone de l'Enseignant: ");
				telephone = telephonesc.nextLine();
				System.out.print(">>>>Email de l'Enseignant: ");
				email = emailsc.nextLine();
				System.out.print(">>>>Grade de l'Enseignant: ");
				grade = gradesc.nextLine();
				System.out.print(">>>>Specialite de l'Enseignant: ");
				specialite = specialitesc.nextLine();
				System.out.print(">>>>Langue de l'Enseignant: ");
				langue = languesc.nextLine();
				System.out.print(">>>>login de l'Enseignant: ");
				login = loginsc.nextLine();
				System.out.print(">>>>Mot de passe de l'Enseignant: ");
				passwd = passwdsc.nextLine();
				System.out.println("");
				// Appel de constructeur
				Enseignant enseignant = new Enseignant(nom, prenom, code, telephone, email,login,passwd,"ENS", grade, specialite, langue);
				// Appel du service Enregistrer Enseignantnant
				System.out.println(">>>>Choisir le numero idcathegorie correspondant a votre cathegorie: ");
				System.out.println(">>>>");
				mescathegories = gestiondoc.afficheListeCathegorie();
				for(Cathegorie cathegorie:mescathegories) {
					
					System.out.println(cathegorie);
				}
				System.out.println(">>>>");
				System.out.println(">>>>");
				System.out.print(">>>> ");
				idCathegorie = idCathegoriesc.nextInt();
				
				System.out.println(">>>>Choisir le numero idclasse correspondant a votre classe: ");
				System.out.println(">>>>");
				mesclasses = gestiondoc.afficheListeClasse(1);
				for(Classe classe:mesclasses) {
					
					System.out.println(classe);
				}
				System.out.println(">>>>");
				System.out.println(">>>>");
				System.out.print(">>>> ");
				idClasse = idClassesc.nextInt();
				
				gestiondoc.enregistrerEnseignant(enseignant, idCathegorie, idClasse);
				//gestiondoc.enregistrerContenu(enseignant);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;

			case '3':
				// Preparation des parametres du constructeur
				System.out.println(">>>>Saisisser les details du Contenu");
				System.out.print(">>>>Nom du contenu:  ");
				nomContenu = nomContenusc.nextLine();
				System.out.print(">>>>Type du Contenu: ");
				typeContenu = typeContenusc.nextLine();
				System.out.print(">>>>Url du Contenu: ");
				url = urlsc.nextLine();
				System.out.print(">>>>Description du Contenu: ");
				description = descriptionsc.nextLine();
				System.out.print(">>>>Auteur du Contenu: ");
				auteur = auteursc.nextLine();
				System.out.println("");
				// Appel de constructeur
				Contenue<String> contenu = new Contenue<String>(nomContenu, typeContenu, url, description, auteur);
				// Appel du service Enregistrer Enseignantnant
				gestiondoc.enregistrerContenu(contenu);
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;
				
			case '7':
				// Preparation des parametres du constructeur
				System.out.println(">>>>Saisisser les informations concernant le fournisseur de contenue");
				System.out.print(">>>>Nom fournisseur de contenue:  ");
				nom = nomsc.nextLine();
				System.out.print(">>>>Prenom fournisseur de contenue: ");
				prenom = prenomsc.nextLine();
				System.out.print(">>>>Code  fournisseur de contenue: ");
				code = codesc.nextLine();
				System.out.print(">>>>Telephone fournisseur de contenue: ");
				telephone = telephonesc.nextLine();
				System.out.print(">>>>Email fournisseur de contenue: ");
				email = emailsc.nextLine();
				//System.out.print(">>>>Grade fournisseur de contenue: ");
				//grade = gradesc.nextLine();
				System.out.print(">>>>Specialite fournisseur de contenue: ");
				specialite = specialitesc.nextLine();
				//System.out.print(">>>>Langue fournisseur de contenue: ");
				//langue = languesc.nextLine();
				System.out.print(">>>>experience fournisseur de contenue: ");
				experience = experiencesc.nextLine();
				System.out.print(">>>>login fournisseur de contenue: ");
				login = loginsc.nextLine();
				System.out.print(">>>>Mot de passe fournisseur de contenue: ");
				passwd = passwdsc.nextLine();
				System.out.println("");
				// Appel de constructeur
				FournisseurContenu fcontenu = new FournisseurContenu(nom, prenom, code, telephone, email,login,passwd,"FCONTENU", specialite, experience);
								
				gestiondoc.enregistrerFournisseurContenue(fcontenu);
				//gestiondoc.enregistrerContenu(enseignant);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;
				
			case '8':
				// Preparation des parametres du constructeur
				System.out.println(">>>>Saisisser les informations concernant l'Expert");
				System.out.print(">>>>Nom de l'Expert:  ");
				nom = nomsc.nextLine();
				System.out.print(">>>>Prenom de l'Expert: ");
				prenom = prenomsc.nextLine();
				System.out.print(">>>>Code de l'Expert: ");
				code = codesc.nextLine();
				System.out.print(">>>>Telephone de l'Expert: ");
				telephone = telephonesc.nextLine();
				System.out.print(">>>>Email de l'Expert: ");
				email = emailsc.nextLine();
				System.out.print(">>>>Grade de l'Expert: ");
				grade = gradesc.nextLine();
				System.out.print(">>>>Specialite de l'Expert: ");
				specialite = specialitesc.nextLine();
				//System.out.print(">>>>Langue de l'Expert: ");
				//langue = languesc.nextLine();
				System.out.print(">>>>experience de l'Expert: ");
				experience = experiencesc.nextLine();
				System.out.print(">>>>login de l'Expert: ");
				login = loginsc.nextLine();
				System.out.print(">>>>Mot de passe de l'Expert: ");
				passwd = passwdsc.nextLine();
				System.out.println("");
				// Appel de constructeur
				Expert expert = new Expert(nom, prenom, code, telephone, email,login,passwd,"EXP", specialite,"NULL",experience,grade);
				// Appel du service Enregistrer Enseignantnant
				System.out.println(">>>>Choisir le numero idcathegorie correspondant a votre cathegorie: ");
				System.out.println(">>>>");
				mescathegories = gestiondoc.afficheListeCathegorie();
				for(Cathegorie cathegorie:mescathegories) {
					
					System.out.println(cathegorie);
				}
				System.out.println(">>>>");
				System.out.println(">>>>");
				System.out.print(">>>> ");
				idCathegorie = idCathegoriesc.nextInt();
				
				gestiondoc.enregistrerExpert(expert, idCathegorie);
				//gestiondoc.enregistrerContenu(enseignant);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;


			case '4':
				System.out.println(">>>>Vous avez choisi d'afficher les details d'un apprenant");
				System.out.println("");
				listeApprenantsDansClasse = gestiondoc.afficheDetailsApprenant();
				for(ApprenantDansClasse apprenantdansclasse:listeApprenantsDansClasse) {
					
					System.out.println(apprenantdansclasse);
				}
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;

			case '5':
				System.out.println(">>>>Vous avez choisi d'afficher les details d'un Enseignant");
				System.out.println("");
				gestiondoc.afficheDetailsEnseignant();
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;

			case '6':
				System.out.println(">>>>Vous avez choisi d'afficher les details d'un Contenu");
				System.out.println("");
				gestiondoc.afficheDetailsContenu();
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
				break;

			case 'q':
				System.out.println(">>>>###############################Merci d'avoir choisi notre Application########################");
				choix = 'N';
				break;
				
			default :
				System.out.println(">>>>Cette fonctionnalite n'existe pas dans ce systeme, lisez attentivement le Menu");
				System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				System.out.println("");
			}

		}

	}

}
