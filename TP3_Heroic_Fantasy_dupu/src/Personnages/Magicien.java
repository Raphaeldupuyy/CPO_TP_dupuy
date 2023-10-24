package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author grego
 */
public class Magicien extends Personnage {
    boolean confirmer;    
    
    public Magicien (String nom, int pdv, boolean a){
        super(nom , pdv);
        confirmer=a;
        nombreDeMagiciens++;
        
    }
 @Override
public String toString() {
String chaine_a_retourner;
if (confirmer == true){
chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie confirmé");
return chaine_a_retourner;
}
else {
    chaine_a_retourner = ("Le magicien "+nom+pdv+ "vie débutant");

   return chaine_a_retourner; 
}
}
}
