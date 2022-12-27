package com.impotFoncier.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.stream.Collectors;

public class ImpotFoncierDuSecteur {

    private String nomSecteur;

    public List<Habitation> lesHabitationsDuSecteur = new ArrayList<>();

    public ImpotFoncierDuSecteur(String nomSecteur) {
        this.nomSecteur = nomSecteur;
    }

    public boolean estEnregistre(Habitation habitation) {

        String proprietaire = habitation.getProprietaire().toLowerCase().replaceAll("\\s+", "");
        String adresse = habitation.getAdresse().toLowerCase().replaceAll("\\s+", "");

        if (lesHabitationsDuSecteur
                .stream()
                .anyMatch(each -> proprietaire
                        .equals(each
                                .getProprietaire()
                                .toLowerCase()
                                .replaceAll("\\s+", "")))
                && lesHabitationsDuSecteur
                .stream()
                .anyMatch(each -> adresse
                        .equals(each
                                .getAdresse()
                                .toLowerCase()
                                .replaceAll("\\s+", ""))))
            return true;

        return false;
    }

    public boolean ajouterHabitation(Habitation habitation) {
        if (estEnregistre(habitation)) return false;
        lesHabitationsDuSecteur.add(habitation);
        return true;
    }

    public void supprimerHabitation(Habitation habitation) {
        if (estEnregistre(habitation)) {
            lesHabitationsDuSecteur.remove(habitation);
            System.out.println("Size de la liste d'Habitation : " + lesHabitationsDuSecteur.size());
        } else System.out.println("Habitation n'existe pas!");
    }

    public String lireProprietaire(String adresse) {
        return lesHabitationsDuSecteur
                .stream()
                .filter(habitation -> adresse
                        .toLowerCase()
                        .replaceAll("\\s+", "")
                        .equals(habitation
                                .getAdresse()
                                .toLowerCase()
                                .replaceAll("\\s+", "")))
                .findAny()
                .orElse(null)
                .getProprietaire();
    }

    public List<Habitation> lireAdresse(String proprietaire) {
        return lesHabitationsDuSecteur
                .stream()
                .filter(habitation -> proprietaire
                        .toLowerCase()
                        .replaceAll("\\s+", "")
                        .equals(habitation
                                .getProprietaire()
                                .toLowerCase()
                                .replaceAll("\\s+", "")))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public double calculerImpot() {
        double impot = lesHabitationsDuSecteur.stream()
                .mapToDouble(habitation ->
                        habitation.calculImpot())
                .sum();
        return impot;
    }

}
