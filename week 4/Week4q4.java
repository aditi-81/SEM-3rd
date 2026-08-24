/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//sum of series
package com.mycompany.week4q4;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week4q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of terms :");
        int n = sc.nextInt();
        int sum=0;
         for(int i=1;i<=n;i++){
             sum = sum+i;
             
         }  System.out.println("Sum = "+sum);                
    }
}
