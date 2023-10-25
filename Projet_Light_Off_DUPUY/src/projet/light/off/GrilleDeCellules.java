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
    private final CelluleLumineuse[][] matriceCellules;

    public GrilleDeCellules(int n) {
        matriceCellules = new CelluleLumineuse[n][n];
        initialiserGrille();
        melangerMatriceAleatoirement(100); // Mélangez la grille aléatoirement.
    }

    private void initialiserGrille() {
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            for (int j = 0; j < matriceCellule.length; j++) {
                matriceCellule[j] = new CelluleLumineuse();
            }
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (CelluleLumineuse matriceCellule : matriceCellules[idLigne]) {
            matriceCellule.inverserEtat();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            matriceCellule[idColonne].inverserEtat();
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
            case 0 -> {
                int ligne = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(ligne);
            }
            case 1 -> {
                int colonne = random.nextInt(matriceCellules.length);
                activerColonneDeCellules(colonne);
            }
            case 2 -> activerDiagonaleDescendante();
            case 3 -> activerDiagonaleMontante();
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
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            for (CelluleLumineuse matriceCellule1 : matriceCellule) {
                if (matriceCellule1.estAllumee()) {
                    return false; // Si une cellule est encore allumée, la grille n'est pas résolue.
                }
            }
        }
        return true; // Si toutes les cellules sont éteintes, la grille est résolue.
    }

    public void afficherGrille() {
        for (CelluleLumineuse[] matriceCellule : matriceCellules) {
            for (CelluleLumineuse matriceCellule1 : matriceCellule) {
                System.out.print(matriceCellule1 + " ");
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
