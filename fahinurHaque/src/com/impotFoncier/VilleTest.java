package com.impotFoncier;

import com.impotFoncier.classes.*;

public class VilleTest {

    public static void main(String[] args) {
        System.out.println("Test Q13 : ");
        q13();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q15 : ");
        q15();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q22 : ");
        q22();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q23 : ");
        q23();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q24 : ");
        q24();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q32 : ");
        q32();
        System.out.println("\n\n");

        System.out.println("*******************************************\n");
        System.out.println("Test Q42 : ");
        q42();
        System.out.println("\n\n");

    }

    private static void q13() {
        HabitationIndividuelle individuelle1 = new HabitationIndividuelle("Fahinur", "88 Rue dAlgerie", 70.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle2 = new HabitationIndividuelle("Kashif", "89 Rue dAlgerie", 72.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle3 = new HabitationIndividuelle("Kasian", "78 Rue dAlgerie", 51.00, "individuelle", 3, false);

        System.out.println("Test individuelle : 1 ");
        individuelle1.affiche();
        individuelle1.calculImpot();
        System.out.println("*******************************************\n");

        System.out.println("Test individuelle : 2 ");
        individuelle2.affiche();
        individuelle2.calculImpot();
        System.out.println("*******************************************\n");

        System.out.println("Test individuelle : 3 ");
        individuelle3.affiche();
        individuelle3.calculImpot();
        System.out.println("*******************************************\n");
    }

    //String proprietaire, String adresse, double surface, String type, int nombreEmployes)
    private static void q15() {
        HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
        HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
        HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);

        System.out.println("Test professionnelle : 1 ");
        professionnelle1.affiche();
        professionnelle1.calculImpot();
        System.out.println("*******************************************\n");

        System.out.println("Test professionnelle : 2 ");
        professionnelle2.affiche();
        professionnelle2.calculImpot();
        System.out.println("*******************************************\n");

        System.out.println("Test professionnelle : 3 ");
        professionnelle3.affiche();
        professionnelle3.calculImpot();
        System.out.println("*******************************************\n");

    }

    private static void q22() {

        HabitationIndividuelle individuelle1 = new HabitationIndividuelle("Fahinur", "88 Rue dAlgerie", 70.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle2 = new HabitationIndividuelle("Kashif", "89 Rue dAlgerie", 72.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle3 = new HabitationIndividuelle("Kasian", "78 Rue dAlgerie", 51.00, "individuelle", 3, false);
        //Test duplicate -
        HabitationIndividuelle individuelle4 = new HabitationIndividuelle("Kasian", "78 Rue dAlgerie", 51.00, "individuelle", 3, false);

        HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
        HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
        HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);

        ImpotFoncierDuSecteur impotFoncierDuSecteur = new ImpotFoncierDuSecteur("secteurnord");
        impotFoncierDuSecteur.ajouterHabitation(individuelle1);
        impotFoncierDuSecteur.ajouterHabitation(individuelle2);
        impotFoncierDuSecteur.ajouterHabitation(individuelle3);
        impotFoncierDuSecteur.ajouterHabitation(individuelle4);

        impotFoncierDuSecteur.ajouterHabitation(professionnelle1);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle2);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle3);

        impotFoncierDuSecteur.calculerImpot();
    }

    private static void q23() {
        HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
        HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
        HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);

        ImpotFoncierDuSecteur impotFoncierDuSecteur = new ImpotFoncierDuSecteur("test suppression");

        impotFoncierDuSecteur.ajouterHabitation(professionnelle1);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle2);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle3);
        System.out.println("impot de secteur :");
        impotFoncierDuSecteur.supprimerHabitation(professionnelle3);

    }

    private static void q24() {
        HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
        HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
        HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);
        HabitationIndividuelle individuelle1 = new HabitationIndividuelle("Fahinur", "88 Rue dAlgerie", 70.00, "individuelle", 4, true);

        ImpotFoncierDuSecteur impotFoncierDuSecteur = new ImpotFoncierDuSecteur("lire prop/adr");

        impotFoncierDuSecteur.ajouterHabitation(professionnelle1);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle2);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle3);
        impotFoncierDuSecteur.ajouterHabitation(individuelle1);

        System.out.println("Lire proprietaire : " + impotFoncierDuSecteur.lireProprietaire("55 Rue dAlgerie"));
        System.out.println("\n");
        impotFoncierDuSecteur.lireAdresse("Fahinur").forEach(data -> System.out.println(data.getAdresse()));

    }

    private static void q32() {
        HabitationIndividuelle individuelle1 = new HabitationIndividuelle("Fahinur", "88 Rue dAlgerie", 70.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle2 = new HabitationIndividuelle("Kashif", "89 Rue dAlgerie", 72.00, "individuelle", 4, true);
        HabitationIndividuelle individuelle3 = new HabitationIndividuelle("Kasian", "78 Rue dAlgerie", 51.00, "individuelle", 3, false);
        HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
        HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
        HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);

        ImpotFoncierDuSecteur impotFoncierDuSecteur = new ImpotFoncierDuSecteur("secteurnord");

        impotFoncierDuSecteur.ajouterHabitation(individuelle1);
        impotFoncierDuSecteur.ajouterHabitation(individuelle2);
        impotFoncierDuSecteur.ajouterHabitation(individuelle3);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle1);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle2);
        impotFoncierDuSecteur.ajouterHabitation(professionnelle3);

        Percepteur percepteur = new Percepteur("login", "motdepasse");
        percepteur.setLeSecteur(impotFoncierDuSecteur);

        System.out.println("Impot secteur total : " + percepteur.calculerLesImpotDuSecteur());

        percepteur.ajouterHabitation("Kiki", "39 Rue dAlgerie", 250, "professionnelle", 30);
        percepteur.ajouterHabitation("Ammu", "78 Rue dAlgerie", 51.00, "individuelle", 3, true);

        System.out.println("Impot secteur total : " + percepteur.calculerLesImpotDuSecteur());

    }

    private static void q42(){
        LesPercepteur lesPercepteur = new LesPercepteur();
        Percepteur percepteur =  new Percepteur("picsou", "radin");

        if (lesPercepteur.isPercepteur(percepteur)){
            HabitationIndividuelle individuelle1 = new HabitationIndividuelle("Fahinur", "88 Rue dAlgerie", 70.00, "individuelle", 4, true);
            HabitationIndividuelle individuelle2 = new HabitationIndividuelle("Kashif", "89 Rue dAlgerie", 72.00, "individuelle", 4, true);
            HabitationIndividuelle individuelle3 = new HabitationIndividuelle("Kasian", "78 Rue dAlgerie", 51.00, "individuelle", 3, false);
            HabitationProfessionnelle professionnelle1 = new HabitationProfessionnelle("Fahinur", "45 Rue dAlgerie", 59.20, "professionnelle", 10);
            HabitationProfessionnelle professionnelle2 = new HabitationProfessionnelle("Kaisan", "55 Rue dAlgerie", 80.80, "professionnelle", 8);
            HabitationProfessionnelle professionnelle3 = new HabitationProfessionnelle("Kashif", "34 Rue dAlgerie", 250, "professionnelle", 30);

            ImpotFoncierDuSecteur impotFoncierDuSecteur = new ImpotFoncierDuSecteur("secteurnord");

            impotFoncierDuSecteur.ajouterHabitation(individuelle1);
            impotFoncierDuSecteur.ajouterHabitation(individuelle2);
            impotFoncierDuSecteur.ajouterHabitation(individuelle3);
            impotFoncierDuSecteur.ajouterHabitation(professionnelle1);
            impotFoncierDuSecteur.ajouterHabitation(professionnelle2);
            impotFoncierDuSecteur.ajouterHabitation(professionnelle3);
            System.out.println( impotFoncierDuSecteur.calculerImpot());
        }
    }

}
