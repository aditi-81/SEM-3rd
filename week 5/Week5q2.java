/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5q2;

/**
 *
 * @author CSD
 */
public class Week5q2 {

    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        
         System.out.println("Array elements :");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        
        for(int i = 0 ; i <arr.length; i++){
            sum += arr[i];
        }
        
        System.out.println("\nThe sum of elements of the array is :" +sum);
    }
}
