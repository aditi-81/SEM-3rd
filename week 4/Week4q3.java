/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week4q3;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week4q3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        
        System.out.println("\nThe table of"+n);
        System.out.println("-------------------");
        for(int i = 1; i<=10; i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
