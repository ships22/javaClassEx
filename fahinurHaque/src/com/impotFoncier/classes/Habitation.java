package com.impotFoncier.classes;

public abstract class Habitation {
    private String proprietaire;
    private String adresse;
    private double surface;
    private String type;
    protected double impotFoncier;

    public Habitation(String proprietaire, String adresse, double surface, String type) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
        this.type = type;
    }

    public abstract double calculImpot();

    public void affiche(){
        System.out.println(
                "Propriétaire :" + proprietaire +
                        "\n" + "Adresse :" + adresse +
                        "\n" + "Surface :" + surface +
                        "\n" + "Type :" + type);
    }

    public double getSurface() {
        return surface;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public String getAdresse() {
        return adresse;
    }
}
