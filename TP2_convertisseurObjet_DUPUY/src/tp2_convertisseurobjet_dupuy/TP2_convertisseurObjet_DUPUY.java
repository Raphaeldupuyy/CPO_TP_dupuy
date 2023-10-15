/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dupuy;

import java.util.Scanner;

/**
 *
 * @author Raphaël
 */
public class TP2_convertisseurObjet_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur convertisseur = new Convertisseur();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                
                System.out.println("Menu de conversion :");
                
                System.out.println("1. Celcius vers Kelvin");
                
                System.out.println("2. Kelvin vers Celcius");
                
                System.out.println("3. Celcius vers Fahrenheit");
                
                System.out.println("4. Fahrenheit vers Celcius");
                
                System.out.println("5. Quitter");
                
                System.out.print("Choisissez une option : ");
                
                int choix = scanner.nextInt();
                
                
                
                if (choix == 5) {
                    
                    System.out.println("Au revoir !");
                    
                    break;
                    
                }
                
                
                
                double valeur;
                
                switch (choix) {
                    
                    case 1 -> {
                        System.out.print("Entrez la température en Celcius : ");
                        
                        valeur = scanner.nextDouble();
                        
                        System.out.println("Résultat : " + convertisseur.celciusVersKelvin(valeur) + " K");
                    }
                    
                    case 2 -> {
                        System.out.print("Entrez la température en Kelvin : ");
                        
                        valeur = scanner.nextDouble();
                        
                        System.out.println("Résultat : " + convertisseur.kelvinVersCelcius(valeur) + " °C");
                    }
                    
                    case 3 -> {
                        System.out.print("Entrez la température en Celcius : ");
                        
                        valeur = scanner.nextDouble();
                        
                        System.out.println("Résultat : " + convertisseur.celciusVersFahrenheit(valeur) + " °F");
                    }
                    
                    case 4 -> {
                        System.out.print("Entrez la température en Fahrenheit : ");
                        
                        valeur = scanner.nextDouble();
                        
                        System.out.println("Résultat : " + convertisseur.fahrenheitVersCelcius(valeur) + " °C");
                    }
                    
                    default -> System.out.println("Option invalide. Veuillez choisir une option valide.");
                    
                }
                
                System.out.println(convertisseur);
                
            }
        }

    
    }
    
}
