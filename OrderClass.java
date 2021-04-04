package application;

import java.util.ArrayList;

public class OrderClass {
	private ArrayList<MenuItem> itemList; //idk if need numItems
	private int orderNumber;
	private double subtotal;
	private double salestax;
	private double total;
	
	public OrderClass(int orderNumber) {
		itemList = new ArrayList<MenuItem>();
		this.orderNumber = orderNumber;
		subtotal = 0;
		salestax = 0;
		total = 0;
	}
	
	public boolean add(Object obj) {
		if (obj instanceof MenuItem) {
			MenuItem item = (MenuItem) obj;
			itemList.add(item);
			return true;
		}
		return false;
	}
	
	public boolean remove(Object obj) {
		if (obj instanceof MenuItem) {
			MenuItem item = (MenuItem) obj;
			itemList.remove(item);
			return true;
		}
		return false;
	}
	
	public void calculateTotal() { //might have to round to two decimal places somehow
		for (int i = 0; i < itemList.size(); i++) {
			subtotal += itemList.get(i).getPrice();
		}
		salestax = subtotal * 0.06625;
		total = subtotal + salestax;
	}
	
}
