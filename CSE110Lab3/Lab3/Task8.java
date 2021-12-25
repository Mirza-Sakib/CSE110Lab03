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
public class Task8 {
    public static void main(String[]args){      
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st number:");
            float i=sc.nextFloat();
            System.out.print("Enter 2nd number:");
            float j=sc.nextFloat();
            if(i>j){
                System.out.print("Result: "+ (i-j));
            }
    
}
}
