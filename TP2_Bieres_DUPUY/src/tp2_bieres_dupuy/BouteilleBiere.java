package tp2_bieres_dupuy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raphaël
 */
public class BouteilleBiere {
     

    String nom;
    double degreAlcool; 
    String brasserie; 
    boolean ouverte; public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

}
 

    // ... (autres attributs et méthodes)

    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("Bière ouverte !");
            return true;  
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;  
        }
    }

    // Constructeur
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
     @Override
    public String toString() {
        String chaineARetourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        chaineARetourner += (ouverte ? "oui" : "non");
        return chaineARetourner;
    }

    
}






        



