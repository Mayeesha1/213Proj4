package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
This class is the controller that implements the individual orders
and shows them on the list view
@author mayeesha, rebecca
*/
public class YourOrderController implements Initializable{
	//OrderClass orderList = new OrderClass(newList);
	//CoffeeClass addInsList = new CoffeeClass();
	Alert errorAlert = new Alert(Alert.AlertType.ERROR);
	@FXML
	private TextField subTotalField, salesTaxField, totalAmountField;
	
	@FXML
	private ListView<String> orderListView = new ListView<String>();
	
	@FXML
	private Button seePrice;
	
	mainMenuController mainController = new mainMenuController();
	private ObservableList<String> listOfItem = FXCollections.observableArrayList();
	
	
	@FXML 
    	void seePriceAction(){
        double subtotal = mainController.getfinalPrice();
        System.out.println(subtotal);
        double tax = subtotal * 0.06625;
        double totalPrice = subtotal + tax;
        DecimalFormat decimalFormat = new DecimalFormat("###, ###, ##0.00");
        salesTaxField.setText(decimalFormat.format(tax));
        subTotalField.setText(decimalFormat.format(subtotal));
        totalAmountField.setText(decimalFormat.format(totalPrice));
 
    }

	 
	 /*  public void setMainController(mainMenuController controller){ 
	        mainController = controller;
	        setText();
	        for(int i =0; i< mainController.getOrder().getItem().size(); i++){
	                listOfItem.add(mainController.getOrder().getItem().get(i).toString());
	                System.out.println(listOfItem);
	        }
	 
	 
	    } */
	 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
