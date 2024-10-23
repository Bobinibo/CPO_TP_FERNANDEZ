/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_fernandez;

/**
 *
 * @author alois
 */
public class TP2_Manip_FERNANDEZ {


    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        assiette2.nbCalories += 100;

        System.out.println("Apres modification :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Apres inversion des references :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        Moussaka[] tableauMoussaka = new Moussaka[10];
        for (int i = 0; i < tableauMoussaka.length; i++) {
            tableauMoussaka[i] = new Moussaka(400 + i * 100);          }

        for (int i = 0; i < tableauMoussaka.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + tableauMoussaka[i].nbCalories + " calories");
        }

            }
}

class Tartiflette {
    int nbCalories;

    public Tartiflette(int calories) {
        this.nbCalories = calories;
    }
}

class Moussaka {
    int nbCalories;

    public Moussaka(int calories) {
        this.nbCalories = calories;
    }
}

