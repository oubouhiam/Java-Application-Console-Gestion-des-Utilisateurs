package com.GestionDesUtilisateur.Models;

public class Utilisateur extends Person {

	private String login;
	private String password;
	private String service;
	private Profil profil;

	public Utilisateur(String matricule, String nom, String prenom, String email, String telephone, int salaire,
			String login, String password, Profil profil) {
		super(matricule, nom, prenom, email, telephone, salaire);
		this.login = login;
		this.password = password;
		this.profil= profil;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
	public Profil getProfil() {
		return profil;
	}

	public  void setProfil(Profil profil) {
		this.profil = profil;
	}
	
	public double calculerSalaire() {
		if (this.getProfil().getCode().equals("MN")) {
			return getSalaire() * 1.08;
		} else if (this.getProfil().getCode().equals("DG")) {
			return getSalaire() * 1.15;
		}
		return super.calculerSalaire();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("   " + this.getProfil().getLibelle() + "    | le salaire de base et :" +this.getSalaire() + "    | le salaire Net est: " + this.calculerSalaire());
	}


}
