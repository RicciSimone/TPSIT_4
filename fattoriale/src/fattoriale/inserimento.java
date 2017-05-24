/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fattoriale;

public class inserimento extends Thread{
    private int num;
    public inserimento(int x){
        this.num = x;
    }
    public void run(){
        int prod=1;
        int i=1;
        while(i<=this.num){
            prod=prod * i;
            i++;
        }
        System.out.println(prod);
    }    
}
