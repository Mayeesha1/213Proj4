package application;

import java.util.ArrayList;

public class StoreOrders {
	private ArrayList<OrderClass> orderList; //idk if need numItems
	
	public StoreOrders() {
		orderList = new ArrayList<OrderClass>(); //getters and setters??
	}
	
	public boolean add(Object obj) {
		if (obj instanceof OrderClass) {
			OrderClass order = (OrderClass) obj;
			orderList.add(order);
			return true;
		}
		return false;
	}
	
	public boolean remove(Object obj) {
		if (obj instanceof OrderClass) {
			OrderClass order = (OrderClass) obj;
			orderList.remove(order);
			return true;
		}
		return false;
	}
}
