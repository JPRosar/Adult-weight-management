//John Rosar
//COSC1437
//Lab2 part 2
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class AdultWeightManagement_Rosar {
	public static void main(String arg[])	
	{
		//declaring variables and collecting input
		String name;
		float BMI, weight;
		int height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
			name = sc.nextLine();
		System.out.println("Enter your height in inches: ");
			height = sc.nextInt();
		System.out.println("Enter your Body Mass Index: ");
			BMI = sc.nextFloat();
			
			//formula
			weight = (BMI * height * height)/703;
			
			//outputting data
			System.out.println("-------------------------------------------------------");
			System.out.println("File: AdultWeightManagement_Rosar.java "); 
			System.out.println("Adult Weight Management – John Rosar");
			System.out.println("Standard BMI:            18.5 – 24.9"); 
			System.out.println("-------------------------------------------------------"); 
			
			//formatting to make look neater
			System.out.printf("%-15s%21s%n", "Name: ", name);
			System.out.printf("%-15s%15d%n", "Height (inches): ",  height);
			System.out.printf("%-15s%18.1f%n", "BMI: ", BMI);
			System.out.println("-------------------------------------------------------"); 
			System.out.printf("%-15s%17.1f%n", "Weight (pounds): ", weight);
	                   }
	}

