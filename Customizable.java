package application;

/**
This interface has methods to add and remove objects and other classes implement it since they
commonly need add and remove methods. 
@author mayeesha, rebecca
*/
public interface Customizable {
	
	/**
	This method would add an object.
	@param obj
	*/
	boolean add(Object obj);
	
	/**
	This method would remove an object.
	@param obj
	*/
	boolean remove(Object obj);

}