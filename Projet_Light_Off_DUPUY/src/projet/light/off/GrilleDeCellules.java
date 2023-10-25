/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.light.off;

/**
 *
 * @author Raphaël
 */

import java.util.Random;

public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;

    public GrilleDeCellules(int n) {
        matriceCellules = new CelluleLumineuse[n][n];
        initialiserGrille();
        melangerMatriceAleatoirement(100); // Mélangez la grille aléatoirement.
    }

    private void initialiserGrille() {
        for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules[i].length; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int colonne = 0; colonne < matriceCellules[idLigne].length; colonne++) {
            matriceCellules[idLigne][colonne].inverserEtat();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int ligne = 0; ligne < matriceCellules.length; ligne++) {
            matriceCellules[ligne][idColonne].inverserEtat();
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][i].inverserEtat();
        }
    }

    public void activerDiagonaleMontante() {
        int n = matriceCellules.length;
        for (int i = 0; i < n; i++) {
            matriceCellules[i][n - i - 1].inverserEtat();
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4);

        switch (choix) {
            case 0:
                int ligne = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(ligne);
                break;
            case 1:
                int colonne = random.nextInt(matriceCellules.length);
                activerColonneDeCellules(colonne);
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int ligne = random.nextInt(matriceCellules.length);
            int colonne = random.nextInt(matriceCellules.length);

            matriceCellules[ligne][colonne].inverserEtat();
        }
    }

    public boolean estResolue() {
        for (int ligne = 0; ligne < matriceCellules.length; ligne++) {
            for (int colonne = 0; colonne < matriceCellules[ligne].length; colonne++) {
                if (matriceCellules[ligne][colonne].estAllumee()) {
                    return false; // Si une cellule est encore allumée, la grille n'est pas résolue.
                }
            }
        }
        return true; // Si toutes les cellules sont éteintes, la grille est résolue.
    }

    public void afficherGrille() {
        for (int ligne = 0; ligne < matriceCellules.length; ligne++) {
            for (int colonne = 0; colonne < matriceCellules[ligne].length; colonne++) {
                System.out.print(matriceCellules[ligne][colonne] + " ");
            }
            System.out.println();
        }
    }

    public int getTaille() {
        return matriceCellules.length;
    }

    void inverserLigneColonne(int coord) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
