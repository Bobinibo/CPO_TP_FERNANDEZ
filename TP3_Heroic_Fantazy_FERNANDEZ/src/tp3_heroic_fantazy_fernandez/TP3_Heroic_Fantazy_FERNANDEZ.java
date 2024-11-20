/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantazy_fernandez;

import java.util.Scanner;

/**
 *
 * @author alois
 */
public class TP3_Heroic_Fantazy_FERNANDEZ {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Création des personnages
        TP3_Heroic_Fantasy hero = new TP3_Heroic_Fantasy("Arthas", 100, 20);
        TP3_Heroic_Fantasy monster = new TP3_Heroic_Fantasy("Dragon", 80, 15);
        
        System.out.println("Bienvenue dans le monde Heroic Fantasy !");
        System.out.println("Le heros " + hero.getName() + " affronte un terrible " + monster.getName() + " !");
        
        Scanner scanner = new Scanner(System.in);
        while (hero.getHealth() > 0 && monster.getHealth() > 0) {
            System.out.println("\n1. Attaquer le monstre");
            System.out.println("2. Defendre");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une action : ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    hero.attack(monster);
                    if (monster.getHealth() > 0) {
                        monster.attack(hero);
                    }
                    break;
                case 2:
                    System.out.println(hero.getName() + " se defend et reduit les degats du prochain coup !");
                    hero.defend(monster);
                    break;
                case 3:
                    System.out.println("Vous avez fui le combat !");
                    return;
                default:
                    System.out.println("Choix invalide, reessayez.");
            }
        }
        
        if (hero.getHealth() <= 0) {
            System.out.println("\n" + hero.getName() + " est mort. Le " + monster.getName() + " a gagne !");
        } else if (monster.getHealth() <= 0) {
            System.out.println("\nFelicitations ! " + hero.getName() + " a vaincu le " + monster.getName() + " !");
        }
    }
}

class TP3_Heroic_Fantasy {
    private String name;
    private int health;
    private int attackPower;

    public TP3_Heroic_Fantasy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void attack(TP3_Heroic_Fantasy opponent) {
        System.out.println(name + " attaque " + opponent.getName() + " pour " + attackPower + " degats !");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " a maintenant " + health + " points de vie.");
    }

    public void defend(TP3_Heroic_Fantasy opponent) {
        int reducedDamage = opponent.attackPower / 2;
        System.out.println(opponent.getName() + " attaque avec des degats reduits de " + reducedDamage + " !");
        takeDamage(reducedDamage);
    }
}
