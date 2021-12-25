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
public class Task4 {
    public static void main(String[]args){      
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        float i=sc.nextFloat();
        System.out.println("area is: "+ (i*i));
        System.out.println("circumference is: "+ (2*3.1416*i));

    }
}
