/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

/**
 *
 * @author Raphaël
 */
import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom = sc.nextLine();

        int maVariable = 0;

        System.out.println("Au revoir " + prenom + " " + maVariable);
    }
}
