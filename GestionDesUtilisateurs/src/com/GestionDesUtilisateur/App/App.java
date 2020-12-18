package com.GestionDesUtilisateur.App;

import com.GestionDesUtilisateur.Models.Profil;
import com.GestionDesUtilisateur.Models.Utilisateur;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profil profil[] = new Profil[5];

		profil[0] = new Profil("CP", "Chef de projet");
		profil[1] = new Profil("MN", "Manager");
		profil[2] = new Profil("DP", "Directeur de projet");
		profil[3] = new Profil("DRH", "Directeur des ressources humaines");
		profil[4] = new Profil("DG", "Directeur général");

		Utilisateur utilisateurs[] = new Utilisateur[6];

		utilisateurs[0] = new Utilisateur("SA1111", "Oubouhia", "Mohamed", "oubouhia@gmail.com", "0678677R56", 4000,
				"oubouhia", "oubouhiam1234", profil[0]);
		utilisateurs[1] = new Utilisateur("SA1222", "Ahmed", "ahmed", "ahmed@gmail.com", "45645645", 4000,
				"oubouhia", "oubouhiam1234", profil[1]);
		utilisateurs[2] = new Utilisateur("SA1333", "yassin", "yassin", "yassin@gmail.com", "54645645", 4000,
				"oubouhia", "oubouhiam1234", profil[2]);
		utilisateurs[3] = new Utilisateur("SA1444", "ayoub", "ayoub", "ayoub@gmail.com", "546456", 4000,
				"oubouhia", "oubouhiam1234", profil[1]);
		utilisateurs[4] = new Utilisateur("SA1555", "salah", "salah", "salah@gmail.com", "54645645", 4000,
				"oubouhia", "oubouhiam1234", profil[4]);
		utilisateurs[5] = new Utilisateur("SA1666", "taoufiq", "taoufiq", "taoufiq@gmail.com", "546456546", 4000,
				"oubouhia", "oubouhiam1234", profil[2]);


		
		System.out.println("Les utilisateurs: ");
		for (Utilisateur user : utilisateurs) {
			user.afficher();
		}

		System.out.println("");

		System.out.println("Les managers: ");
		for (Utilisateur user : utilisateurs) {
			if (user.getProfil().getCode().equals("MN")) {
				user.afficher();
			}
		}

	}

}
