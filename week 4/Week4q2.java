/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week4q2;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week4q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER NUMBER 1 :");
        int a = sc.nextInt();
        
        System.out.println("ENTER NUMBER 2 :");
        int b = sc.nextInt();
        
        System.out.println("ENTER NUMBER 3 :");
        int c = sc.nextInt();
        
        int largest = a;
        
        if(b>largest)
            largest = b;
        if(c>largest)
            largest = c;
        
        System.out.println("The largest number is :" + largest);
    }
}
