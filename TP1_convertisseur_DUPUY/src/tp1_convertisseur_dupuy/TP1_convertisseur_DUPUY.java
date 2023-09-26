/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_dupuy;

import java.util.Scanner;

public class TP1_convertisseur_DUPUY{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une valeur en degrés Celsius
        System.out.print("Bonjour, saisissez une valeur en degrés Celsius : ");
        double valeurCelsius = scanner.nextDouble();

        // Affiche la valeur en degrés Celsius
        System.out.println("Vous avez saisi : " + valeurCelsius + " degrés Celsius.");

        // Affiche le menu des conversions
        afficherMenu();

        int choix = scanner.nextInt();
        double resultat = 0.0;

        switch (choix) {
            case 1:
                resultat = celciusVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Celsius est égal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                resultat = kelvinVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Kelvin est égal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                resultat = fahrenheitVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Fahrenheit est égal à " + resultat + " degrés Celsius.");
                break;
            case 4:
                resultat = celciusVersFahrenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Celsius est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 5:
                resultat = kelvinVersFahrenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Kelvin est égal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                resultat = fahrenheitVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degrés Fahrenheit est égal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix non valide.");
        }
        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
    }

    public static double celciusVersKelvin(double tCelsius) {
        // Formule de conversion de Celsius vers Kelvin
        return tCelsius + 273.15;
    }

    public static double kelvinVersCelsius(double tKelvin) {
        // Formule de conversion de Kelvin vers Celsius
        return tKelvin - 273.15;
    }

    public static double fahrenheitVersCelsius(double tFahrenheit) {
        // Formule de conversion de Fahrenheit vers Celsius
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double celciusVersFahrenheit(double tCelsius) {
        // Formule de conversion de Celsius vers Fahrenheit
        return (tCelsius * 9 / 5) + 32;
    }

    public static double kelvinVersFahrenheit(double tKelvin) {
        // Conversion Kelvin vers Celsius, puis Celsius vers Fahrenheit
        double tCelsius = kelvinVersCelsius(tKelvin);
        return celciusVersFahrenheit(tCelsius);
    }

    public static double fahrenheitVersKelvin(double tFahrenheit) {
        // Conversion Fahrenheit vers Celsius, puis Celsius vers Kelvin
        double tCelsius = fahrenheitVersCelsius(tFahrenheit);
        return celciusVersKelvin(tCelsius);
    }
}
