package com.impotFoncier.classes;

public class Percepteur {

    private String login;
    private String motdepasse;
    private ImpotFoncierDuSecteur leSecteur;

    public Percepteur(String login, String motdepasse) {
        this.login = login;
        this.motdepasse = motdepasse;
    }

    public String getLogin() {
        return login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setLeSecteur(ImpotFoncierDuSecteur leSecteur) {
        this.leSecteur = leSecteur;
    }

    public boolean ajouterHabitation(String proprietaire, String adresse, double surface, String type, int nombrePieces, boolean piscine) {
        Habitation habitation = new HabitationIndividuelle(proprietaire, adresse, surface, type, nombrePieces, piscine);
        return leSecteur.ajouterHabitation(habitation);
    }

    public boolean ajouterHabitation(String proprietaire, String adresse, double surface, String type, int nombreEmployes) {
        Habitation habitation = new HabitationProfessionnelle(proprietaire, adresse, surface, type, nombreEmployes);
        return leSecteur.ajouterHabitation(habitation);
    }

    public boolean estLePercepteur(Percepteur p) {
        if (p.login.equals(this.login) && p.motdepasse.equals(this.motdepasse)) return true;
        return false;
    }
    public double calculerLesImpotDuSecteur(){
        System.out.println("\nImpot secteur : ");
        return leSecteur.calculerImpot();
    }
}
