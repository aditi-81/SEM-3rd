/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5q6;

/**
 *
 * @author CSD
 */
import java.util.Scanner;
public class Week5q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number :");
        int n = sc.nextInt();
        
        int fact=1;
        for(int i= 1; i<=n; i++){
            
            fact*=i;
        }
        System.out.println("Factorial of" +n+ "is :" +fact);
    }
}
