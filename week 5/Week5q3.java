/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5q3;


public class Week5q3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
           
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); 
       
    }
}
}
