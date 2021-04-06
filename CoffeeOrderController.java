package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
This class is the controller than implements the Coffee Menu GUI. The Coffee 
Menu has options of adding add ins, choosing a type, choosing a quantity, and
adding everything to the customers order. The total price is displayed depending
on the changes made as soon as a customer starts their coffee order.
@author mayeesha, rebecca
*/
public class CoffeeOrderController implements Initializable{
	//FIGURE OUT PRICE CHANGES WHEN CHANGING MIND WHEN SELECTING TYPE AND QUANTITY
	
	private String coffeeSize; 
	private int coffQuantity;
	private double finalPrice;
	private boolean alrSelected; 
	DecimalFormat decimal = new DecimalFormat("0.00");
	
	@FXML
	private CheckBox creamBox, syrupBox, milkBox, caramelBox, whipCreamBox;
	
	@FXML
	private TextField coffeeTotalField;
	
	@FXML
	private Button addToOrder;
	
	 @FXML
	 private ComboBox <String> selectCoffeeType;
	 protected ObservableList<String> typeCoffItems = 
	    		FXCollections.observableArrayList("Short", "Tall", "Grande", "Venti");
	 
	 
	 @FXML
	 protected ComboBox <Integer> numberOfCoffee;
	 protected ObservableList<Integer> numCoffItems = 
	    		FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	 
	 /** 
     This method initializes the combo boxes and list views with
     items. 
     @param location, resources
     */
	 @Override
	 public void initialize(URL location, ResourceBundle resources) {
		 numberOfCoffee.setItems(numCoffItems);
		 selectCoffeeType.setItems(typeCoffItems);
	 }
	 
	 @FXML
	    /** 
	     Action Event Handler when handling the coffee size
	     @param event
	     */
	    void coffeeTypeAction(ActionEvent event) {
		 if(!alrSelected) {
		 String coffeeSize = selectCoffeeType.getValue().toString();
		 this.coffeeSize = coffeeSize;	
		 CoffeeClass coffClass = new CoffeeClass(coffeeSize);
		 coffClass.itemPrice();
		 //String strPrice = String.valueOf(coffClass.getPrice());
		 double finPrice = coffClass.getPrice() + finalPrice;
		 coffeeTotalField.setText(decimal.format(finPrice));
		 this.finalPrice = finPrice; 
		 boolean isSelected = true;
		 this.alrSelected = isSelected;
		 } else {
			double finalPrice = 0.0; 
			this.finalPrice = finalPrice;
			String coffeeSize = selectCoffeeType.getValue().toString();
			this.coffeeSize = coffeeSize;	
			CoffeeClass coffClass = new CoffeeClass(coffeeSize);
			coffClass.itemPrice();
			if(coffQuantity > 0) {
			double finPrice = coffClass.getPrice() * coffQuantity;
			coffeeTotalField.setText(decimal.format(finPrice));
			this.finalPrice = finPrice; 
			} else {
			double finPrice = coffClass.getPrice();
			coffeeTotalField.setText(decimal.format(finPrice));
			this.finalPrice = finPrice; 
			}
		 }
		 

	    }

	 
	 @FXML
	    /** 
	     Action Event Handler when getting the coffee quantity
	     @param event
	     */
	    void coffeeAmountAction(ActionEvent event) {
		 int coffQuantity = numberOfCoffee.getValue();
		 this.coffQuantity = coffQuantity; 
		 double newDPrice = coffQuantity * finalPrice;
		 coffeeTotalField.setText(decimal.format(newDPrice));
		 this.finalPrice = newDPrice;

	    }
	 
	 @FXML
	    /** 
	     Mouse Event Handler when clicking or unclicking the cream
	     add in option
	     @param event
	     */
	    void creamCheckClick (MouseEvent event) {
		 if(creamBox.isSelected()) {
		 double newDoublePrice = finalPrice + 0.20; 
		 coffeeTotalField.setText(decimal.format(newDoublePrice));
		 this.finalPrice = newDoublePrice;
		 } else {
			 double newDoublePrice = finalPrice - 0.20; 
			 coffeeTotalField.setText(decimal.format(newDoublePrice));
			 this.finalPrice = newDoublePrice;
		 }
		 
	    }
	 
	 @FXML
	    /** 
	     Mouse Event Handler when clicking or unclicking the syrup
	     add in option
	     @param event
	     */
	    void syrupCheckClick (MouseEvent event) {
		 if(syrupBox.isSelected()) {
		 double newDoublePrice = finalPrice + 0.20; 
		 coffeeTotalField.setText(decimal.format(newDoublePrice));
		 this.finalPrice = newDoublePrice;
		 } else {
			 double newDoublePrice = finalPrice - 0.20; 
			 coffeeTotalField.setText(decimal.format(newDoublePrice));
			 this.finalPrice = newDoublePrice;
		 }
		 
	    }
	 
	 @FXML
	    /** 
	     Mouse Event Handler when clicking or unclicking the milk
	     add in option
	     @param event
	     */
	    void milkCheckClick (MouseEvent event) {
		 if(milkBox.isSelected()) {
		 double newDoublePrice = finalPrice + 0.20; 
		 coffeeTotalField.setText(decimal.format(newDoublePrice));
		 this.finalPrice = newDoublePrice;
		 } else {
			 double newDoublePrice = finalPrice - 0.20; 
			 coffeeTotalField.setText(decimal.format(newDoublePrice));
			 this.finalPrice = newDoublePrice;
		 }
	    }
	 
	 
	 @FXML
	    /** 
	     Mouse Event Handler when clicking or unclicking the caramel
	     add in option
	     @param event
	     */
	    void caramelCheckClick (MouseEvent event) {
		 if(caramelBox.isSelected()) {
		 double newDoublePrice = finalPrice + 0.20; 
		 coffeeTotalField.setText(decimal.format(newDoublePrice));
		 this.finalPrice = newDoublePrice;
		 } else {
			 double newDoublePrice = finalPrice - 0.20; 
			 coffeeTotalField.setText(decimal.format(newDoublePrice));
			 this.finalPrice = newDoublePrice;
		 }
	    }
	 
	 @FXML
	    /** 
	     Mouse Event Handler when clicking or unclicking the whippped
	     cream add in option
	     @param event
	     */
	    void whipCreamCheckClick (MouseEvent event) {
		 if(whipCreamBox.isSelected()) {
		 double newDoublePrice = finalPrice + 0.20; 
		 coffeeTotalField.setText(decimal.format(newDoublePrice));
		 this.finalPrice = newDoublePrice;
		 } else {
			 double newDoublePrice = finalPrice - 0.20; 
			 coffeeTotalField.setText(decimal.format(newDoublePrice));
			 this.finalPrice = newDoublePrice;
		 }
	    }
	
	 @FXML
	    /** 
	     Action Event Handler for the Add To Order Button
	     @param event
	     */
	    void addToOrder (ActionEvent event) {
	
	    }

}
