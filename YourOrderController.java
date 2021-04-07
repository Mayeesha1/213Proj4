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

public class YourOrderController implements Initializable{
	//OrderClass orderList = new OrderClass(newList);
	//CoffeeClass addInsList = new CoffeeClass();
	Alert errorAlert = new Alert(Alert.AlertType.ERROR);
	@FXML
	private TextField subTotalField, salesTaxField, totalAmountField;
	
	@FXML
	private Button priceButton;
	
	@FXML
	private ListView<String> orderListView = new ListView<String>();
	
	mainMenuController mainController = new mainMenuController();
	private ObservableList<String> listOfItem = FXCollections.observableArrayList();
	


    /*private void setText(){
        double subtotal = mainController.getOrder().getTotal();
        System.out.println("The price is "+ subtotal);
        double tax = subtotal * 0.06625;
        double totalPrice = subtotal + tax;
        DecimalFormat decimalFormat = new DecimalFormat("###, ###, ##0.00");
        salesTaxField.setText(decimalFormat.format(tax));
        subTotalField.setText(decimalFormat.format(subtotal));
        totalAmountField.setText(decimalFormat.format(totalPrice));
 
    }*/
	
	 @FXML
	    /** 
	     Action Event Handler for the button that removes a 
	     donut flavor order to the list.
	     @param event
	     */
	    void seePriceAction(ActionEvent event) {
		    double subtotal = mainController.getOrder().getTotal();
	        System.out.println("The price is "+ subtotal);
	        double tax = subtotal * 0.06625;
	        double totalPrice = subtotal + tax;
	        DecimalFormat decimalFormat = new DecimalFormat("###, ###, ##0.00");
	        salesTaxField.setText(decimalFormat.format(tax));
	        subTotalField.setText(decimalFormat.format(subtotal));
	        totalAmountField.setText(decimalFormat.format(totalPrice));
		 
	    }
	 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}
