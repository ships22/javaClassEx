package com.impotFoncier.classes;

public class HabitationIndividuelle extends Habitation{

    private int nombrePieces;
    private boolean piscine;

    public HabitationIndividuelle(String proprietaire, String adresse, double surface, String type, int nombrePieces, boolean piscine) {
        super(proprietaire, adresse, surface, type);
        this.nombrePieces = nombrePieces;
        this.piscine = piscine;
    }

    @Override
    public double calculImpot() {
        int piscinePrice = 0;
        if (piscine) piscinePrice = 500;
        double impot = (100 * nombrePieces) + (5 * super.getSurface()) + piscinePrice;
        System.out.println("Impot : " + impot);
        return impot;
    }

    @Override
    public void affiche() {
        super.affiche();
    }
}
