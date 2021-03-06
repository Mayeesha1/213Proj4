package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList; //**says quantity so is it like 2 of the exact same coffee?? then have to equal and add to quantity

/**
The OrderClass implements the Customizable interface so there's methods to add and
remove add-ins. There are instance variables such as an arraylist for menu items
so donuts and coffee can be added and price can be calculated and variables for order number
and various totals. 
@author mayeesha, rebecca
*/
public class OrderClass implements Customizable { //**order number and specific type of coffee etc and export to txt stuff in "kiosk/payrollprocessing" thing so maybe in some controller class idk)
	private ArrayList<MenuItem> itemList; //idk if need numItems
	private int orderNumber;
	private double subtotal;
	private double salestax;
	private MenuItem item;
	private double total;
	
	/**
	This is a constructor method setting everything to default
	*/
	public OrderClass() {
		subtotal = 0;
		salestax = 0;
		total = 0;
	}
	
	/**
	This constructor takes the order number and creates an arraylist of menu items and sets the totals
	to 0.
	@param itemList
	*/
	public OrderClass(ArrayList<MenuItem> itemList) {
		this.itemList = itemList;
		//this.orderNumber = 0;
		//subtotal = 0;
		//salestax = 0;
		//total = 0;
	}
	
	/**
	This method adds menu items to the arraylist for the order.
	@param obj
	*/
	public boolean add(Object obj) {
		if (obj instanceof CoffeeClass || obj instanceof DonutClass) {
			//MenuItem item = (MenuItem) obj;
			itemList.add((MenuItem) obj);
			return true;
		}
		return false;
	}
	
	/**
	This method removes menu items from the arraylist for the order.
	@param obj
	*/
	public boolean remove(Object obj) {
		if (obj instanceof MenuItem) {
			MenuItem item = (MenuItem) obj;
			itemList.remove(item);
			return true;
		}
		return false;
	}
	
	/**
	This method returns the arraylist of menu items so menu items can be added, removed, and
	retrieved from the arraylist.
	@return itemList
	*/
	public ArrayList<MenuItem> getItems() {
		return itemList;
	}
	
	/*
	This method calculates the subtotal, sales tax, and total for an order.
	*/
	public void calculateTotal() { //might have to round to two decimal places somehow
		for (int i = 0; i < itemList.size(); i++) {
			subtotal += itemList.get(i).getPrice();
		}
		salestax = subtotal * 0.06625;
		total = subtotal + salestax;
	}
	
	/*
	This method sets the total price
	@param finalPrice
	*/
	public void setTotalPrice(double finalPrice) {
		this.total = finalPrice;
		
	}
	
	/*
	This returns itemList arrayList
	@param itemList
	*/
	public ArrayList<MenuItem> getItem(){
	      return itemList;
	    }
	
	/**
	Getter method for the order number so the value can be used in other classes.
	@return orderNumber
	*/
	public int getOrderNumber() { 
		return orderNumber;
	}
	
	/**
	Setter method for the order number so the value can be set from other classes.
	@param orderNumber
	*/
	public void setOrderNumber(int orderNumber) { 
		this.orderNumber = orderNumber;
	}
	
	/**
	Getter method for the subtotal of an order so the value can be used in other classes.
	@return subtotal of order
	*/
	public double getSubtotal() { 
		return subtotal;
	}
	
	/**
	Getter method for the sales tax on an order so the value can be used in other classes.
	@return salestax
	*/
	public double getSalestax() { 
		return salestax;
	}
	
	/**
	Getter method for the total of an order so the value can be used in other classes.
	@return total of order
	*/
	public double getTotal() { 
		return total;
	}
	
	/**
	Setter method for the total of an order so the value can be set from other classes.
	*/
	public void setTotal(double total) {
		this.total = total;
	}
	
	/**
	The method exports the order to a path of a file to help it be saved/exported to that file.
	@param path of the file
	*/
	public void exportOrder(String path) {
		try {
			FileWriter write = new FileWriter(path);
			BufferedWriter writer = new BufferedWriter(write);
			for (int i = 0; i < itemList.size(); i++) {
				 if (itemList.get(i) instanceof DonutClass) {
					 DonutClass don = (DonutClass) itemList.get(i);
					 writer.append(don.toString());
				 }
				 else if (itemList.get(i) instanceof CoffeeClass) {
					 CoffeeClass cof = (CoffeeClass) itemList.get(i);
					 writer.append(cof.toString());
				 }
			 }
			writer.close();
		}
		catch (IOException e) {
		}
	}
	public void setIncrement() {
		
		
	}
}
