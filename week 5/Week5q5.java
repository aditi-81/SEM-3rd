/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5q5;

/**
 *
 * @author CSD
 */
import java.util.Scanner;

public class Week5q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some integer number :");
        int n = sc.nextInt();
        int r;
        int sum = 0;
        while(n>0){
            r = n%10;
            n = n/10;
            
            sum += r;
        }
        System.out.println("The sum of the digits of this number is : " +sum);
    }
}
