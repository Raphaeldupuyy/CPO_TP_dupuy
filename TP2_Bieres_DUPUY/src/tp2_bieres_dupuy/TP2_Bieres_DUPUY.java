/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dupuy;



/**
 *
 * @author Raphaël
 */
public class TP2_Bieres_DUPUY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6
        ,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
       
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
        7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere BiereCamille = new BouteilleBiere ( " Monaco", 4.0, " LataverneDeLuLu");
        BiereCamille.lireEtiquette();
        BouteilleBiere biere3 = new BouteilleBiere("MaBière", 5.0, "MaBrasserie");
        biere3.lireEtiquette(); 
        
    }}  
    
  