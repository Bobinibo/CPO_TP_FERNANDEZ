/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_fernandez;

/**
 *
 * @author alois
 */
public class TP2_Relation_FERNANDEZ {

public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire;

    public Voiture(String modele, String marque, int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null; // Par défaut, pas de propriétaire
    }

    @Override
    public String toString() {
        return marque + " " + modele + " (" + puissance + " CV)" + 
               (proprietaire != null ? ", propriétaire: " + proprietaire.nom : ", pas de propriétaire");
    }
}
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Capacité de 3 voitures max
        this.nbVoitures = 0;
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur: cette voiture a déjà un propriétaire.");
            return false; // Voiture déjà possédée par quelqu'un d'autre
        }
        if (nbVoitures >= 3) {
            System.out.println("Erreur: " + nom + " possède déjà 3 voitures.");
            return false; // Tableau plein
        }
        // Ajout de la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this; // Assignation du propriétaire
        return true;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}

