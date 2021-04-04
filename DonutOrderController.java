package application;

import java.awt.Label;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class DonutOrderController {
	

	 @FXML
	 private Label haha;
	 
	 @FXML
	 private ListView<String> selectListView;
	 private ObservableList list = FXCollections.observableArrayList("jelly", "chocolate frosted", "strawberry frosted", "sugar", "lemon filled");
	 

	  
	
	 
	 
}
