package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class shoppingcart {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> cart = new ArrayList<>();
	        boolean running = true;

	        while (running) {
	            System.out.println("\nShopping Cart Menu:");
	            System.out.println("1. Add Item to Cart");
	            System.out.println("2. View Cart");
	            System.out.println("3. Remove Item from Cart");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item name: ");
	                    String item = scanner.nextLine();
	                    cart.add(item);
	                    System.out.println("Item added to cart.");
	                    break;

	                case 2:
	                    if (cart.isEmpty()) {
	                        System.out.println("Your cart is empty.");
	                    } else {
	                        System.out.println("Items in your cart:");
	                        for (int i = 0; i < cart.size(); i++) {
	                            System.out.println((i + 1) + ". " + cart.get(i));
	                        }
	                    }
	                    break;

	                case 3:
	                    if (cart.isEmpty()) {
	                        System.out.println("Your cart is empty.");
	                    } else {
	                        System.out.print("Enter the item number to remove: ");
	                        int itemNumber = scanner.nextInt();
	                        if (itemNumber > 0 && itemNumber <= cart.size()) {
	                            cart.remove(itemNumber - 1);
	                            System.out.println("Item removed from cart.");
	                        } else {
	                            System.out.println("Invalid item number.");
	                        }
	                    }
	                    break;

	                case 4:
	                    running = false;
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}



