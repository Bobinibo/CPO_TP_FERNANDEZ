/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stat_fernandez;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alois
 */
public class TP1_stat_Fernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int[] de = new int[6]; 
        for (int i = 0; i < de.length; i++) {
            de[i] = 0; 
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int m = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < m; i++) {
            int lancer = random.nextInt(6); 
            de[lancer]++; 
        }

      
        System.out.println("Resultats des lancers :");
        for (int i = 0; i < de.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + de[i] + " fois (" + 
                (de[i] * 100.0 / m) + "%)"); 
        }

        scanner.close(); 
    }
}
