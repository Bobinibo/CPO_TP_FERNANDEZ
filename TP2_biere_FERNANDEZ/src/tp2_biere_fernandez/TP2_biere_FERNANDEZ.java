/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_biere_fernandez;

/**
 *
 * @author alois
 */
public class TP2_biere_FERNANDEZ {

    public static void main(String[] args) {
        // Création des bières
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0f, "Dubuisson");
        uneBiere.lireEtiquette();

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        autreBiere.lireEtiquette();

        System.out.println(uneBiere);

        uneBiere.decapsuler();

        System.out.println(uneBiere);

        BouteilleBiere biere1 = new BouteilleBiere("Heineken", 5.0f, "Heineken Brewery");
        BouteilleBiere biere2 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");
        BouteilleBiere biere3 = new BouteilleBiere("Corona", 4.5f, "Grupo Modelo");

        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);

        biere1.decapsuler();
        System.out.println(biere1);
    }
}

class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bière
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " a ete decapsulee.");
            return true;
        } else {
            System.out.println("Erreur : biere deja ouverte.");
            return false;
        }
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
        if (ouverte == true) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;
    }
}


