/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator
        
import java.util.Scanner 

/**
 *
 * @author alois
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");

        System.out.println("1) add");

        System.out.println("2) substract");

        System.out.println("3) multiply");

        System.out.println("4) divide");

        System.out.println("5) modulo");

        Scanner sc;

        sc = new Scanner(System.in);

        int operateur;

        operateur = sc.nextInt();

        while (operateur < 1 || operateur > 5) {

            System.out.println("Invalid operator. Please enter a number between 1 and 5:");

            operateur = sc.nextInt();

        }

        System.out.println("Please enter the first number:");

        int operande1 = sc.nextInt();

        System.out.println("Please enter the second number:");

        int operande2 = sc.nextInt();

        int result = 0;

        switch (operateur) {

            case 1:

                result = operande1 + operande2;

                break;

            case 2:

                result = operande1 - operande2;

                break;

            case 3:

                result = operande1 * operande2;

                break;

            case 4:

                result = operande1 / operande2;

                break;

            case 5:

                result = operande1 % operande2;

                break;

            default:

                System.err.println("erreur de saisie");

        }

        System.out.println("The result is: " + result);

    }

}
