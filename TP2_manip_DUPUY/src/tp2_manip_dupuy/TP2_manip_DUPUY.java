/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dupuy;

/**
 *
 * @author Raphaël
 */
public class TP2_manip_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Tartiflette assiette1 = new Tartiflette(500);

        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;

 

        System.out.println("Nombre de tartiflettes réellement créées : 2");

 

        System.out.println("Nombre de calories de Assiette 2 : " + assiette2.nbCalories);

        System.out.println("Nombre de calories de Assiette 3 : " + assiette3.nbCalories);

 

        // 5. Inversion des objets référencés par assiette1 et assiette2

        Tartiflette temp = assiette1;

        assiette1 = assiette2;

        assiette2 = temp;

 

        System.out.println("Nombre de calories de Assiette 1 après inversion : " + assiette1.nbCalories);

        System.out.println("Nombre de calories de Assiette 2 après inversion : " + assiette2.nbCalories);

 

        // 6. Lignes concernant Moussaka

        Moussaka assiette666 = new Moussaka(0); // Correct, mais pas une bonne pratique

        // Moussaka assiette667 = new Tartiflette(); // Incorrect, types incompatibles

 

        // 7. Création d'un tableau de 10 références de Moussaka

        Moussaka[] moussakaArray = new Moussaka[10];

 

        // Instanciation de 10 objets de type Moussaka

        for (int i = 0; i < moussakaArray.length; i++) {

            moussakaArray[i] = new Moussaka(i * 100);

        }

 

        // Affichage du nombre de calories pour chaque Moussaka

        for (int i = 0; i < moussakaArray.length; i++) {

            System.out.println("Nombre de calories de Moussaka " + i + " : " + moussakaArray[i].nbCalories);

        }

    }
        // TODO code application logic here
    }
    

