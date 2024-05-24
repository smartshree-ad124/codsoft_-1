package com.javatpoint.controller;

import java.util.Scanner;

public class Javagradecalci
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        float total=0, average;
        Scanner scanner = new Scanner(System.in);
		
        
        for(int i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        
        average = total/6;
        System.out.print("The student Grade is: ");
        if(average>=80)
        {
            System.out.print("A");
        }
        else if(average>=60 && average<80)
        {
           System.out.print("B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}

