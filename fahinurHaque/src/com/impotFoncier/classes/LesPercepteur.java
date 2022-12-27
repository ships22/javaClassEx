package com.impotFoncier.classes;

import java.util.HashMap;

public class LesPercepteur {

    private HashMap<String, Percepteur> listepercepteurs = new HashMap<>();
    private HashMap<String, ImpotFoncierDuSecteur> lessecteurs = new HashMap<>();

    public LesPercepteur() {
        listepercepteurs.put("picsou", new Percepteur("picsou", "radin"));
        listepercepteurs.put("donald", new Percepteur("donald", "coincoin"));
        listepercepteurs.put("pluto,", new Percepteur("pluto", "comptemesos"));
        listepercepteurs.put("mickey", new Percepteur("mickey", "lemalin"));
        listepercepteurs.put("daisy", new Percepteur("daisy", "bijoux"));

        lessecteurs.put("picsou", new ImpotFoncierDuSecteur("secteurnord"));
        lessecteurs.put("donald", new ImpotFoncierDuSecteur("secteursud"));
        lessecteurs.put("pluto", new ImpotFoncierDuSecteur("secteurest"));
        lessecteurs.put("mickey", new ImpotFoncierDuSecteur("secteurouest"));
        lessecteurs.put("daisy", new ImpotFoncierDuSecteur("secteurcentre"));
    }

    public boolean isPercepteur(Percepteur percepteur){
        Percepteur percepteurFound = listepercepteurs.get(percepteur.getLogin());
        if (percepteurFound != null && percepteur.getMotdepasse().equals(percepteurFound.getMotdepasse())){
            percepteurFound.setLeSecteur(lessecteurs.get(percepteur.getLogin()));
            return true;
        }
        return false;
    }
}
