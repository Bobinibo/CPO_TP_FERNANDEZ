/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_fernandez;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alois
 */
public class TP1_guessMyNumber_FERNANDEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.print("Choisissez un niveau de difficulte (facile, normal, difficile) : ");
        String difficulte = scanner.nextLine().toLowerCase();
        int maxTentatives = 0;

        switch (difficulte) {
            case "facile":
                maxTentatives = 10;
                break;
            case "normal":
                maxTentatives = 7;
                break;
            case "difficile":
                maxTentatives = 5;
                break;

        }

        int nombreAleatoire = generateurAleat.nextInt(101);
        int tentatives = 0;
        boolean trouve = false;

        System.out.println("Devinez le nombre entre 0 et 100.");

        while (!trouve && tentatives < maxTentatives) {
            System.out.print("Entrez votre nombre : ");
            int nombreSaisi = scanner.nextInt();
            tentatives++;

            if (nombreSaisi < nombreAleatoire) {
                System.out.println("Trop petit ");
            } else if (nombreSaisi > nombreAleatoire) {
                System.out.println("Trop grand ");
            } else {
                System.out.println("Gagne !");
                trouve = true;
            }

            if (tentatives == maxTentatives && !trouve) {
                System.out.println("Nombre maximum de tentatives atteint. Le nombre etait : " + nombreAleatoire);
            }
        }

        System.out.println("Nombre de tentatives : " + tentatives);
        scanner.close();
    }
}
