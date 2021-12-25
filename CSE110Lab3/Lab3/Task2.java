/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse110.lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task2 {
    public static void main(String[]args){      
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int i=sc.nextInt();
        System.out.print("Enter 2nd number:");
        int j=sc.nextInt();
        System.out.println("The sum is"+ (i+j));
        System.out.println("The sum is"+ (i*j));
        System.out.println("The sum is"+ (i-j));
    }
    
}
