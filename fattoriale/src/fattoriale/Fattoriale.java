/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattoriale;


public class Fattoriale {

    public static void main(String[] args) {
        int i=0;
        for(i=1;i<=10;i++){
            inserimento n = new inserimento(i);
            n.start();
        }
    }
    
}
