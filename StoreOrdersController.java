package application;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField; 
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
This class is the controller that implements the Store Orders and shows
them on the portal.
@author mayeesha, rebecca
*/
public class StoreOrdersController implements Initializable { 
	
	private int orderNumber;
	private StoreOrders orders;
	private OrderClass order;
	private double total;
	DecimalFormat decimal = new DecimalFormat("0.00");
	private ArrayList<Integer> ordNumList;
	private ArrayList<String> displayList;
	
	@FXML
	private Button cancelOrderButton;
	
	@FXML
	private Button exportOrdersButton;
	
	@FXML
	private TextField orderTotalField;
	
	@FXML
	 protected ComboBox <Integer> orderNum;
	 protected ObservableList<Integer> ordNum = 
	    		FXCollections.observableArrayList(ordNumList); //**if cancel order idk how to remove ordernum from this list
	 
	@FXML
	 private ListView<String> displayListView;
	 protected ObservableList<String> displayOrdersList = 
	    		FXCollections.observableArrayList(displayList);
	 
	 @Override
	 public void initialize(URL location, ResourceBundle resources) {
		 orderNum.setItems(ordNum);
		 displayListView.setItems(displayOrdersList);
	 }
	 
	 //@FXML
	 /*void orderNumberList(ActionEvent event) {
		 try {
			 for (int i = 0; i < orders.getOrderList().size(); i++) {
				 ordNumList.add(orders.getOrderList().get(i).getOrderNumber());
			 }
		 }
		 catch (Exception e) {
			 //idk
		 }
	 }*/

}