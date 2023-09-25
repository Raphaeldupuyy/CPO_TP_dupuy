/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

/**
 *
 * @author Raphaël
 */
public class Exo2 {

    public static void main(String[] args) {
        // Déclaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // résultat
        int ind; // indice
        nb = 5;
        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }

        // Affichage du résultat
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
