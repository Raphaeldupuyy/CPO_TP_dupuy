/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_dupuy;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_DUPUY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Bienvenue dans le jeu Guess My Number !");
        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Facile");
        System.out.println("2. Normal");
        System.out.println("3. Difficile");

        int choixDifficulte = scanner.nextInt();
        int nombreMaximum = 100;

        switch (choixDifficulte) {
            case 1:
                nombreMaximum = 50;
                break;
            case 2:
                nombreMaximum = 100;
                break;
            case 3:
                nombreMaximum = 200;
                break;
            default:
                System.out.println("Choix de difficulté non valide. Niveau normal choisi par défaut.");
        }

        int nombreAleatoire = randomGenerator.nextInt(nombreMaximum) + 1;
        int tentative = 0;
        int nombreSaisi = -1;

        System.out.println("Devinez le nombre entre 1 et " + nombreMaximum + ".");

        while (nombreSaisi != nombreAleatoire) {
            System.out.print("Saisissez un nombre : ");
            nombreSaisi = scanner.nextInt();
            tentative++;

            if (nombreSaisi < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (nombreSaisi > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le nombre en " + tentative + " tentatives.");
            }
        }
    }
}
