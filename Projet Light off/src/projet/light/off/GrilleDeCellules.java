/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.light.off;

/**
 *
 * @author Rapha�l
 */
import java.util.Random;

/**
 * La classe GrilleDeCellules repr�sente la grille de cellules lumineuses du jeu Light Off.
 * Elle contient des m�thodes pour manipuler la grille et la m�langer.
 */
public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;

    /**
     * Constructeur de la classe GrilleDeCellules.
     *
     * @param n La taille de la grille (n x n).
     */
    public GrilleDeCellules(int n) {
        matriceCellules = new CelluleLumineuse[n][n];

        // Initialise la grille avec des cellules �teintes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    // M�thodes pour manipuler la grille (activerLigneDeCellules, activerColonneDeCellules, etc.)

    /**
     * Affiche la grille dans la console.
     */
    public void afficherGrille() {
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            for (CelluleLumineuse matriceCellule1 : matriceCellule) {
                System.out.print(matriceCellule1 + " ");
            }
            System.out.println();
        }
    }

    // M�thode pour m�langer la grille
    // ...

    public boolean estResolue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getTaille() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void inverserLigneColonne(int coord) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
