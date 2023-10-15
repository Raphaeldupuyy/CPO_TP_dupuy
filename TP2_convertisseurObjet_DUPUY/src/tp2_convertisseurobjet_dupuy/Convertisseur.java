/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dupuy;

/**
 *
 * @author Raphaël
 */
public class Convertisseur {
    

    private int nbConversions;

 

    public Convertisseur() {

        nbConversions = 0;

    }

 

    public double celciusVersKelvin(double degreCelcius) {

        nbConversions++;

        return degreCelcius + 273.15;

    }

 

    public double kelvinVersCelcius(double degreKelvin) {

        nbConversions++;

        return degreKelvin - 273.15;

    }

 

    public double celciusVersFahrenheit(double degreCelcius) {

        nbConversions++;

        return (degreCelcius * 9 / 5) + 32;

    }

 

    public double fahrenheitVersCelcius(double degreFahrenheit) {

        nbConversions++;

        return (degreFahrenheit - 32) * 5 / 9;

    }

 

    public int getNbConversions() {

        return nbConversions;

    }

 

    @Override

    public String toString() {

        return "Nombre de conversions : " + nbConversions;

    }
    
}
