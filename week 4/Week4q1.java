/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week4q1;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week4q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer number");
        int n = sc.nextInt();
        
        if(n%2==0){
        System.out.println("The number is even");
    }else{
            System.out.println("The number is odd");
        }
}
}