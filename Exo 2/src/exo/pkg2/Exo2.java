/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo.pkg2;

/**
 *
 * @author alois
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Déclaration des variables
    int nb; // nombre d'entiers à additionner
    int result; // résultat
    int ind; // indice

    nb = 5;
    result = 0;

    // Addition des nb premiers entiers
    ind = 1;
    while (ind <= nb) {
        result = result + ind;
        ind++; // Incrémentation de l'indice pour éviter la boucle infinie
    }

    // Affichage du résultat
    System.out.println("La somme des " + nb + " premiers entiers est : " + result);
}

    
}
