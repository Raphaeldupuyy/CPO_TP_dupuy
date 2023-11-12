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
    final CelluleLumineuse[][] matriceCellules;

    public GrilleDeCellules(int x,int y) {
        matriceCellules = new CelluleLumineuse[x][y];
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

            activerLigneColonneOuDiagonaleAleatoire();
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
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules.length; j++) {
                matriceCellules[i][j].estEteint();
                if (matriceCellules[i][j].estEteint()==false){
                    return false;
                }

            }
    }
        return true;
    }
    public void afficherGrille() {
        int taille = getTaille();

        // Affiche les indices de colonnes (numéros) en face des cases de colonnes
        System.out.print("     ");
        for (int i = 0; i < taille; i++) {
            System.out.print("  " + (i + 1) + "  ");
        }
        System.out.println();

        for (int i = 0; i < taille; i++) {
            // Affiche une ligne horizontale de barres supérieures
            for (int j = 0; j < taille + 1; j++) {
                System.out.print("----+");
            }
            System.out.println();

            // Affiche les indices de lignes (lettres)
            System.out.print(" " + (char) ('A' + i) + "  |");

            // Affiche les cellules de la ligne
            for (int j = 0; j < taille; j++) {
                System.out.print("  " + matriceCellules[i][j] + " |");
            }
            System.out.println();
        }

        // Affiche la dernière ligne horizontale de barres inférieures
        for (int j = 0; j < taille + 1; j++) {
            System.out.print("----+");
        }
        System.out.println();
    }

    public int getTaille() {
        return matriceCellules.length;
    }

    void inverserLigneColonne(int coord) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void eteindreToutesLesCellules() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
