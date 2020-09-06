package com.skilldistillery.FoodProj;

public class FoodTruck {

	static int id;
	private String foodType = "";
	private String name = "";
	private int rating = 0;
	
//	
//	public Foodtruck(int _id) {
//		
//	}

	public FoodTruck(String foodType, String name, int rating) {
		this.foodType = foodType;
		this.name = name;
		this.rating = rating;
         
	}
public String getFoodtype() {
	return foodType;
}

public void setFoodtype(String _foodType) {
	foodType = _foodType;
}
public String getName() {
	return name;
}
public void setName(String _name) {
	name = _name;
}
public int getRating() {
	return rating;
}
public void setRating(int _rating) {
	rating = _rating;
}

@Override
public String toString() {
	
	return "Truck name: " + name +" Food type: " + foodType + " Rating is; " + rating + " Truck ID:  " + id ;
}

}
