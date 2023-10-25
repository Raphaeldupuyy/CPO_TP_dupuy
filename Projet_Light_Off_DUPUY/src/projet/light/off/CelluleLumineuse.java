/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.light.off;

/**
 * La classe CelluleLumineuse repr�sente une cellule lumineuse du jeu Light Off.
 * Une cellule peut �tre dans l'�tat "allum�e" ou "�teinte".
 */
public class CelluleLumineuse {
    private boolean allumee;

    /**
     * Constructeur par d�faut. Initialise la cellule �teinte.
     */
    public CelluleLumineuse() {
        allumee = false;
    }

    /**
     * V�rifie si la cellule est allum�e.
     *
     * @return true si la cellule est allum�e, sinon false.
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
     * �teint la cellule.
     */
    public void eteindre() {
        allumee = false;
    }

    /**
     * Inverse l'�tat de la cellule (allum�e devient �teinte, et vice versa).
     */
    public void inverserEtat() {
        allumee = !allumee;
    }

    @Override
    public String toString() {
        return allumee ? "O" : "X";
    }

    public static void main(String[] args) {
        CelluleLumineuse cellule = new CelluleLumineuse();
        System.out.println("�tat initial de la cellule : " + cellule.estAllumee());
        cellule.allumer();
        System.out.println("La cellule est-elle allum�e ? " + cellule.estAllumee());
        cellule.eteindre();
        System.out.println("La cellule est-elle allum�e ? " + cellule.estAllumee());
        cellule.inverserEtat();
        System.out.println("La cellule est-elle allum�e ? " + cellule.estAllumee());
    }
}
