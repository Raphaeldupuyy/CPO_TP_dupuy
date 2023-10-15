/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dupuy;

/**
 *
 * @author Raphaël
 */
public class Personne {
     String nom;

    String prenom;

    int nbVoitures;

    Voiture[] liste_voitures;
 

    public Personne(String prenom, String nom) {

        this.nom = nom;

        this.prenom = prenom;

        this.nbVoitures = 0;

        this.liste_voitures = new Voiture[3];

    }

 

    public boolean ajouterVoiture(Voiture voiture) {

        if (voiture.proprietaire != null) {

            System.out.println("La voiture est déjà possédée par quelqu'un d'autre.");

            return false;

        }

 

        if (nbVoitures >= 3) {

            System.out.println("Le propriétaire a déjà 3 voitures, impossible d'en ajouter plus.");

            return false;

        }

 

        liste_voitures[nbVoitures] = voiture;

        voiture.proprietaire = this;

        nbVoitures++;

 

        return true;

    }

 

    @Override

    public String toString() {

        return prenom + " " + nom;

    }
    
}
