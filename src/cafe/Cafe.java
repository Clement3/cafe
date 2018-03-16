/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

/**
 *
 * @author clement
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dosettes = 100;
        int cafe = 1;
        int nombre = 0;
        int nbrCafe = 6;
        double prix = 0.78;
        int seb = 2;
        
        for (int i = dosettes; i >= 0; i--) {
            cafe++;

            if (cafe > nbrCafe) {
                nombre++;
                cafe = 1;
                System.out.println(i + " Il faut remttre de l'eau");
              
            } else if (i == prix * 100) {
                System.out.println(i + " à partir d'ici seb fait des benefs");
            } else {
                System.out.println(i + " café");
            }
        }
        
        
        System.out.println("Seb nous carotte " + (seb * dosettes - prix * dosettes));
        
        System.out.println("Il faudra remplir la machine " + nombre + " fois.");   
    }
    
}
