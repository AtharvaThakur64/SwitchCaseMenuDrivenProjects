package com.demo;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number (1-7) :");
		Days = sc.nextInt();
		
		
		switch(Days)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("WEdnesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("FRiday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("enter number between 1-7");
		}
		

	}

}
