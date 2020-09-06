package com.skilldistillery.FoodProj;

import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);

	FoodTruck[] foodTrucks = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();

	}

	private void run() {

		System.out.println("Hello, welcome to the food truck application.");
	

		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.println("enter truck name");

			String name = kb.next();
			if (name.endsWith("quit")) {
				break;
			}
			kb.nextLine();

			System.out.println("please enter type of food");
			String foodType = kb.nextLine();

			System.out.println("give them a rating");
			int rating = kb.nextInt();

			FoodTruck newTruck = new FoodTruck(foodType, name, rating);

			foodTrucks[i] = newTruck;
			// System.out.println(foodTrucks[i].toString());

		}

		displayMenu();
	}

	private void displayMenu() {
		int[] ratings = new int[foodTrucks.length];
		double sum = 0.0;
		int choice;
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("What would you like to do?");
			System.out.println("1: list food trucks");
			System.out.println("2: see avarage rating");
			System.out.println("3: view highest rated");
			System.out.println("4: quit");
			choice = kb.nextInt();
			if (choice == 1) {
				for (int i = 0; i < foodTrucks.length; i++) {
					if(foodTrucks[i]== null) {
						break;
					}
					System.out.println(foodTrucks[i].toString());
					System.out.println();
					FoodTruck.id++;
				}

			} else if (choice == 2) {
				// int[] ratings = new int[foodTrucks.length];
				for (int i = 0; i < foodTrucks.length; i++) {
					ratings[i] = foodTrucks[i].getRating();

				}

				for (int i = 0; i < ratings.length; i++) {
					sum += ratings[i];

				}
				double average = sum / ratings.length;
				System.out.println(average);
			} else if (choice == 3) {
				// int[] ratings = new int[foodTrucks.length];
				int largest = ratings[0];
int bestTruck = 0;
				for (int i = 0; i < foodTrucks.length; i++) {
					ratings[i] = foodTrucks[i].getRating();
					if (ratings[i] > largest) {
						largest = ratings[i];
						bestTruck = i;

					}
					
				}
				System.out.println(largest);
				System.out.println(foodTrucks[bestTruck].toString());
			} else {
				System.out.println("goodbye");
				keepGoing = false;
			}

		}
	}

}
