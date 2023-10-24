/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_dupu;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrirer;
import armes.*;


import java.util.ArrayList;

/**
 *
 * @author grego
 */
public class TP3_Classe_et_heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
                Epee Epee1 = new Epee("Excalibur", 7, 5);

        Epee épée2 = new Epee("Durandal", 4, 7);

       

        Baton baton1 = new Baton("Chêne", 4, 5);

        Baton baton2 = new Baton("Charme", 5, 6);

       

        System.out.println(baton1);

        System.out.println(baton2);

        System.out.println(Epee1);

        System.out.println(Epee1);

       

        ArrayList<Arme> n_arme = new ArrayList<Arme>();

        n_arme.add(Epee1);

        n_arme.add(épée2);

        n_arme.add(baton1);

        n_arme.add(baton2);

       

        int taille = n_arme.size();

        int longueur=taille-1;

        for (int i=0 ; i<longueur; i++){

            System.out.println(n_arme.get(i));

       

        }

        Magicien magi1 = new Magicien ("Gandalf", 65, true);

        System.out.println(n_arme.get(taille-1));

        Magicien magi2 = new Magicien ("Garcimor", 44, false);

        Guerrirer g1 = new Guerrirer ("Conan", 78, false);

        Guerrirer g2 = new Guerrirer ("Lannister", 45, true);

       

        ArrayList<Personnage> tab_p = new ArrayList<Personnage>();

        tab_p.add(magi1);

        tab_p.add(magi2);

        tab_p.add(g1);

        tab_p.add(g2);

       

        int taille2 =tab_p.size();

       

        int longueur2=taille2-1;

        for (int i=0 ; i<longueur2; i++){

            System.out.println(tab_p.get(i));

           

        

        Guerrirer g3 = new Guerrirer("cam", 67, false);

        Magicien m3 = new Magicien ("lulu", 8, false);

        Baton baton10 = new Baton ("tronc", 5 , 5);

        Baton baton11 = new Baton ("petit", 5 , 5);

        Baton baton12 = new Baton ("branche", 5 , 5);

       

        Epee épée10 = new Epee ("épee1", 97, 6);

        Epee épée11 = new Epee ("épee2", 5, 6);

        Epee épée12 = new Epee ("épee3", 5, 6);

       

        g3.ajouter_arme(épée10);

        g3.ajouter_arme(épée11);

        g3.ajouter_arme(baton10);

       

       

        m3.ajouter_arme(baton11);

        m3.ajouter_arme(baton12);

        m3.ajouter_arme(épée12);

 

        g3.équiper_arme("épee1");


        m3.équiper_arme("épee2");

       

        

        System.out.println(g3);

        System.out.println(g1);
        
        System.out.println(Personnage.getNombreDeMagiciens());
        System.out.println(Personnage.getNombreDePersonnages());
        System.out.println(Personnage.getNombreDeGuerriers());

       

        

        

        

        

        

        

    }

   

}

}