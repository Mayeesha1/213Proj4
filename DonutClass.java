package application;

/**
The DonutClass is a subclass of the MenuItem class so it holds the same attributes as the 
MenuItem class. There is an additional instance variable for type of donut. 
@author mayeesha, rebecca
*/
public class DonutClass extends MenuItem {
	private String donutType;
	//private int donQuantity;
	
	/**
	This constructor takes the type of donut and sets the donutType as that type.
	@param donutType
	*/
	public DonutClass(String donutType) {
		this.donutType = donutType;
	}
	
	/**
	This method returns the type of donut.
	@return donutType
	*/
	public String getDonutType() {
		return donutType;
	}
	
	/**
	This method sets the type of donut.
	@param donutType
	*/
	public void setDonutType(String donutType) {
		this.donutType = donutType;
	}
	
	/**
	This method calculates the price of the donut.
	*/
	@Override
	public void itemPrice() {
		if (donutType.equals("Yeast Donut")) {
			setPrice(1.39);
		}
		else if (donutType.equals("Cake Donut")) {
			setPrice(1.59);
		}
		else if (donutType.equals("Donut Hole")) {
			setPrice(0.33);
		}
		//setPrice(getPrice() * getQuantity());
	}
	
	/**
	The method creates a string description of a donut object.
	*/
	@Override
	public String toString() { 
		return donutType + "(" + String.valueOf(getQuantity()) + ")";
	}
	
}