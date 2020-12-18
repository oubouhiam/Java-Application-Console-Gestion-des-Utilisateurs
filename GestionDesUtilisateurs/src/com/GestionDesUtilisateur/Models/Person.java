package com.GestionDesUtilisateur.Models;

public class Person {

	private String matricule;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private int salaire;

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Person(String matricule, String nom, String prenom, String email, String telephone, int salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}
	public Person() {
	}
	
	public double calculerSalaire() {
		return this.salaire;
	}

	public void afficher() {
		// TODO Auto-generated method stub	
		System.out.print(this.matricule + "| "  + this.nom + " " + this.prenom + "|   ");

	}

}
