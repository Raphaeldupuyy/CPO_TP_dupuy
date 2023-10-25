/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.light.off;

/**
 * La classe CelluleLumineuse représente une cellule lumineuse du jeu Light Off.
 * Une cellule peut être dans l'état "allumée" ou "éteinte".
 */
public class CelluleLumineuse {
    private boolean allumee;

    /**
     * Constructeur par défaut. Initialise la cellule éteinte.
     */
    public CelluleLumineuse() {
        allumee = false;
    }

    /**
     * Vérifie si la cellule est allumée.
     *
     * @return true si la cellule est allumée, sinon false.
     */
    public boolean estAllumee() {
        return allumee;
    }

    /**
     * Allume la cellule.
     */
    public void allumer() {
        allumee = true;
    }

    /**
     * Éteint la cellule.
     */
    public void eteindre() {
        allumee = false;
    }

    /**
     * Inverse l'état de la cellule (allumée devient éteinte, et vice versa).
     */
    public void inverserEtat() {
        allumee = !allumee;
    }

    @Override
    public String toString() {
        return allumee ? "O" : "X";
    }
}
