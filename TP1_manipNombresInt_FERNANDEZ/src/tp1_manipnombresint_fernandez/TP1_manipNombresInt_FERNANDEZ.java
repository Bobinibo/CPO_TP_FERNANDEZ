/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_fernandez;

import java.util.Scanner;

/**
 *
 * @author alois
 */
public class TP1_manipNombresInt_FERNANDEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le premier nombre entier ");
        int nombre1 = scanner.nextInt();

        System.out.print("Veuillez saisir le deuxieme nombre entier ");
        int nombre2 = scanner.nextInt();

        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;
        int quotient = nombre1 / nombre2; 
        int reste = nombre1 % nombre2;     

        System.out.println("Vous avez saisi " + nombre1 + " et " + nombre2);
        System.out.println("La somme de vos deux nombres est " + somme);
        System.out.println("La difference de vos deux nombres est " + difference);
        System.out.println("Le produit de vos deux nombres est " + produit);
        System.out.println("Le quotient de de vos deux nombres est " + quotient);
        System.out.println("Le reste de la division est " + reste);

        scanner.close();
    }
}