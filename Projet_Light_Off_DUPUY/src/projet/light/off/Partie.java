package projet.light.off;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import projet.light.off.GrilleDeCellules;


/**
 * La classe Partie représente une partie du jeu Light Off.
 * Elle gère l'interaction entre le joueur et la grille.
 */
import java.util.Scanner;

public class Partie {
    private GrilleDeCellules grille;
    private int coups;

    public Partie(int tailleGrille) {
        grille = new GrilleDeCellules(tailleGrille);
        coups = 0;
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!grille.estResolue()) {
            System.out.println("Grille actuelle (Tour " + coups + "):");
            grille.afficherGrille();

            System.out.println("Saisissez une ligne (0-" + (grille.getTaille() - 1) + "), une colonne (0-" + (grille.getTaille() - 1) + "), ou 'q' pour quitter :");
            String saisie = scanner.nextLine();

            if (saisie.equals("q")) {
                System.out.println("Partie abandonnée.");
                break;
            }

            try {
                int coord = Integer.parseInt(saisie);
                if (coord >= 0 && coord < grille.getTaille()) {
                    grille.inverserLigneColonne(coord);
                    coups++;
                } else {
                    System.out.println("Coordonnée invalide. Veuillez réessayer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Saisie invalide. Veuillez réessayer.");
            }
        }

        if (grille.estResolue()) {
            System.out.println("Bravo ! Vous avez résolu la grille en " + coups + " coups.");
        }
    }

    public static void main(String[] args) {
        Partie partie = new Partie(15);
        partie.lancerPartie();
    }
}


