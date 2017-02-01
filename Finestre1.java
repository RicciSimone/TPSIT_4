/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finestre1;
import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int fin;
    int i=0;
    System.out.println("inserisci il numero delle finestre maggiore di 0");
    do{
        fin = input.nextInt();
    }
    while(fin<=0); 
    
        Finestra f1;
        do{
        i=i+1;
        f1 = new Finestra();
        f1.setVisible(true);
        f1.setTitle("Finestra"+i);
    }while(i<fin);
    
}
}