/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open5
the template in the editor.
 */
package fungsi;

import java.util.Scanner;

public class Fungsi {
    public static void hitung (int a,int b) {
        System.out.println("Hasil: "+ (a+b));
    }
     public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Masukkan bilangan I : ");
         int bil1= input.nextInt();
         
         System.out.println("Masukkan bilangan II : ");
         int bil2= input.nextInt();
         
         hitung(bil1,bil2);
    }
}

     