/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week4q5;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week4q5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a number :");
        double n = sc.nextDouble();
        
        int r;
        String z = "";
        
        while(n>=10){
            n=n/2;
            System.out.println("Result = " +n);
        }
        
    }
}
