/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week5q1;
import java.util.Scanner;
/**
 *
 * @author CSD
 */
public class Week5q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements of the array : ");
        for(int i=0; i < size; i++){
            arr[i] = sc.nextInt();
            }
        
        System.out.println("Array elements are :");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
        
    }
}
