package application;

public class MenuItem {
	private double price;

	/**
	This constructor is the default to make a menu item and the price depends on the type of item so it'll
	be set in the subclasses.
	*/
	public MenuItem() {
		price = 0;
	}
	
	/**
	Getter method for the price of an item so the value can be used in other classes.
	@return price of item
	*/
	public double getPrice() { 
		return price;
	}
	
	/**
	Setter method for the price of an item so the value can be set in other classes
	@param item price
	*/
	public void setPrice(double price) {
		this.price = price;
	}
		
	/**
	This method is the method that the other classes with the same method will override. It calculates
	the price of a menu item. 
	*/
	public void itemPrice() {
		
	}
	
	

}
