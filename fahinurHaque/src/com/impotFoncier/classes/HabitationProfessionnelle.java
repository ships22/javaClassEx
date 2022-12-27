package com.impotFoncier.classes;

public class HabitationProfessionnelle extends Habitation{

    private int nombreEmployes;

    public HabitationProfessionnelle(String proprietaire, String adresse, double surface, String type, int nombreEmployes) {
        super(proprietaire, adresse, surface, type);
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public double calculImpot() {
        double impot = (10 * super.getSurface()) + (300 * Math.ceil(nombreEmployes));
        System.out.println("Impot : " + impot);
        return impot;
    }

    @Override
    public void affiche() {
        super.affiche();
    }
}
