/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 
@author Utilisateur*/
public class Arme {
    int attaque;
    String nom;


    public Arme (String n, int i){
        attaque = i;
        nom = n;


    }

    public String getNom() {
        return nom;
    }




    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("L'arme "+nom+" a un niveau d'attaque de "+attaque);
return chaine_a_retourner;
}}

  
