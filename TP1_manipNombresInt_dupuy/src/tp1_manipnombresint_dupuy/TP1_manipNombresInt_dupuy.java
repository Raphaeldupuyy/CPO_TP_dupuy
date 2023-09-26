/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_dupuy;

import java.util.Scanner;

public class TP1_manipNombresInt_dupuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux entiers
        System.out.print("Veuillez saisir le premier entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Veuillez saisir le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        // Afficher les entiers saisis
        System.out.println("Vous avez saisi les entiers suivants :");
        System.out.println("Premier entier : " + nombre1);
        System.out.println("Deuxième entier : " + nombre2);

        // Calculer la somme, la différence et le produit
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        // Afficher la somme, la différence et le produit
        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);

        // Calculer le quotient entier et le reste de la division
        // Vérifier que le deuxième nombre n'est pas zéro pour éviter une division par zéro
        if (nombre2 != 0) {
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;

            // Afficher le quotient et le reste
            System.out.println("Quotient entier : " + quotient);
            System.out.println("Reste de la division : " + reste);
        } else {
            System.out.println("Division par zéro impossible.");
        }

        // Fermer le scanner
        scanner.close();
    }
}
