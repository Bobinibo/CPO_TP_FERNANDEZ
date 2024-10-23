/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_fernandez;
import java.util.Scanner;
/**
 *
 * @author alois
 */
public class TP2_ConvertisseurObjet_FERNANDEZ {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Création de deux objets Convertisseur
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        boolean continuer = true;
        
        while (continuer) {
            System.out.println("Choisissez une option :");
            System.out.println("1 : Convertir Celsius vers Kelvin");
            System.out.println("2 : Convertir Kelvin vers Celsius");
            System.out.println("3 : Convertir Celsius vers Fahrenheit");
            System.out.println("4 : Convertir Fahrenheit vers Celsius");
            System.out.println("5 : Convertir Kelvin vers Fahrenheit");
            System.out.println("6 : Convertir Fahrenheit vers Kelvin");
            System.out.println("7 : Quitter");

            int choix = sc.nextInt();

            if (choix == 7) {
                continuer = false;
                break;
            }

            System.out.println("Entrez la temperature a convertir : ");
            double temperature = sc.nextDouble();
            double resultat = 0.0;

            switch (choix) {
                case 1:
                    resultat = convertisseur1.CelsiusVersKelvin(temperature);
                    System.out.println(temperature + " C = " + resultat + " K");
                    break;
                case 2:
                    resultat = convertisseur1.KelvinVersCelsius(temperature);
                    System.out.println(temperature + " K = " + resultat + " C");
                    break;
                case 3:
                    resultat = convertisseur1.CelsiusVersFahrenheit(temperature);
                    System.out.println(temperature + " C = " + resultat + " F");
                    break;
                case 4:
                    resultat = convertisseur1.FahrenheitVersCelsius(temperature);
                    System.out.println(temperature + " F = " + resultat + " C");
                    break;
                case 5:
                    resultat = convertisseur1.KelvinVersFahrenheit(temperature);
                    System.out.println(temperature + " K = " + resultat + " F");
                    break;
                case 6:
                    resultat = convertisseur1.FahrenheitVersKelvin(temperature);
                    System.out.println(temperature + " F = " + resultat + " K");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }

            System.out.println(convertisseur1.toString());
        }


        sc.close();
    }
}

class Convertisseur {
    int nbConversions;

    // Constructeur
    public Convertisseur() {
        nbConversions = 0;
    }

    public double CelsiusVersKelvin(double tempC) {
        nbConversions++;
        return tempC + 273.15;
    }

    public double KelvinVersCelsius(double tempK) {
        nbConversions++;
        return tempK - 273.15;
    }

    public double CelsiusVersFahrenheit(double tempC) {
        nbConversions++;
        return (tempC * 9 / 5) + 32;
    }

    public double FahrenheitVersCelsius(double tempF) {
        nbConversions++;
        return (tempF - 32) * 5 / 9;
    }

    public double KelvinVersFahrenheit(double tempK) {
        nbConversions++;
        return (tempK - 273.15) * 9 / 5 + 32;
    }

    public double FahrenheitVersKelvin(double tempF) {
        nbConversions++;
        return (tempF - 32) * 5 / 9 + 273.15;
    }

    @Override
    public String toString() {
        return "Nombre de conversions : " + nbConversions;
    }
}

