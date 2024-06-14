package com.demo;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, ans, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Online Calculator");
		System.out.println("Press 1 Addition /n 2 Substraction /n 3 Multiplication /n 4 Division");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter two Numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			ans = x + y;
			System.out.println("The Addition of Two Numbers  :" +ans);
			break;
			
		case 2:
			System.out.println("Enter two Numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			ans = x - y;
			System.out.println("The Substration of Two Numbers  :" +ans);
			break;
		
		case 3:
			System.out.println("Enter two Numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			ans = x * y;
			System.out.println("The Multiplication of Two Numbers  :" +ans);
			break;
			
		case 4:
			System.out.println("Enter two Numbers");
			x = sc.nextInt();
			y = sc.nextInt();
			ans = x / y;
			System.out.println("The Division of Two Numbers  :" +ans);
			break;
			
		default:
			System.out.println("Please Enter Proper choice");
			break;
		}
		

	}

}
