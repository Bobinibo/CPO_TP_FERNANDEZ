/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo.pkg2;

/**
 *
 * @author alois
 */
import java.util.Scanner; // Import de la classe Scanner

public class Exo2 {
    public static void main(String[] args) {
        // Déclaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // résultat
        int ind; // indice

        // Utilisation de Scanner pour la saisie du nombre d'entiers à additionner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer le nombre d'entiers a additionner :");
        nb = sc.nextInt(); 

        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++; 
        }

        // Affichage du résultat
        System.out.println("La somme des " + nb + " premiers entiers est : " + result);

        sc.close();
    }
}

