package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String name;
	private String foodType;
	private int numericRating;
	private int ID;
	private static int numericID = 0;
	

	public FoodTruck(String name2, String foodType2, int numericRating2) {
		setName(name2);
		setFoodType(foodType2);
		setNumericRating(numericRating2);
		ID = numericID;
		numericID++;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [name=").append(name).append(", foodType=").append(foodType)
				.append(", numericRating=").append(getNumericRating()).append(", ID=").append(ID).append("]");
		return builder.toString();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumericRating() {
		
		return numericRating;
	}


	public void setNumericRating(int numericRating) {
		this.numericRating = numericRating;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

}
