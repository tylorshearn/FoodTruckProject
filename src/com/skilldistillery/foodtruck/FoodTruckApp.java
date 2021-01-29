package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	private int numericIDCounter = 0;

	public static void main(String[] args) {

		System.out.println(
				"Welcome to Food Trucks! You are going to be inputting a name, food type, and numeric rating for\n"
						+ "up to 5 food trucks.");
		FoodTruckApp foodTruckApp = new FoodTruckApp();

		int numericIDCounter = 0;

		FoodTruck[] foodTruckB;

		foodTruckB = new FoodTruck[5];
		foodTruckApp.getTrucks(foodTruckB);
		

	}

	public void getTrucks(FoodTruck[] trucks) {
		// in a loop, ask the user for truck details, one truck at a time.
		for (int i = 0; i < 5; i++) {
			System.out.println("Input the name for the next food truck: ");
			String name = kb.nextLine();
			if (name.equals("quit")) {
				menu(trucks);
				break;
			}
			System.out.println("Input the food type for the next food truck: ");
			String foodType = kb.nextLine();
			System.out.println("Input a numeric rating from 0-5 for the next food truck. Use whole numbers only: ");
			int numericRating = kb.nextInt();
			kb.nextLine();
			trucks[i] = new FoodTruck(name, foodType, numericRating);
			System.out.println(trucks[i]);
			numericIDCounter++;
			System.out.println("If you'd like to open the menu, input \"quit\" when prompted\n"
					+ "for the name of any of the following food trucks. Otherwise, when 5 food trucks have been added, the menu will appear.");
			if (numericIDCounter == 5) {
				menu(trucks);

			}
		}

	}

	void menu(FoodTruck[] trucks) {
		boolean keepGoing = true;
		while (keepGoing == true) {
			
		System.out.println("~~~~~MENU~~~~~");
		System.out.println("List all existing food trucks: Input \"1\"");
		System.out.println("See the average rating of food trucks: Input \"2\"");
		System.out.println("Display the highest-rated food truck: Input \"3\"");
		System.out.println("Quit the program: Input \"4\"");

		int switchChoice = 0;
		switchChoice = kb.nextInt();
		switch (switchChoice) {
		case 1:
			for (int i = 0; i < trucks.length; i++) {
				System.out.println("All existing food trucks: " + trucks[i].toString());
			}
			break;
		case 2:
			double sumForAverageRating = 0;
			for (int i = 0; i < trucks.length; i++) {
				sumForAverageRating += trucks[i].getNumericRating();
			}
			double averageRating = 0;
			averageRating = sumForAverageRating / trucks.length;
			System.out.println("The average rating of food trucks is: " + averageRating);
			break;
		case 3:
			FoodTruck highestRatedTruck = trucks[0];
			for (int i = 0; i < trucks.length; i++) {

				if (trucks[i].getNumericRating() > highestRatedTruck.getNumericRating()) {
					highestRatedTruck = trucks[i];
				} 
			}
			System.out.println("The highest-rated food trucks is: " + highestRatedTruck.getName() + "(ID: "
					+ highestRatedTruck.getID() + ")" + ", with food type: " + highestRatedTruck.getFoodType()
					+ ", with a rating of: " + highestRatedTruck.getNumericRating());
			break;
		case 4:
			System.out.println("Thanks for using Food Trucks!");
			keepGoing = false;
			kb.close();
		}
		}

	}
}
