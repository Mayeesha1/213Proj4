package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DonutOrderController {
		
	Alert errorAlert = new Alert(Alert.AlertType.ERROR);
    Stage stage = new Stage();

	 @FXML
	 private ListView<String> selectListView;
	 
	 @FXML
	 private ComboBox <String> selectDonutType;
	 
	 @FXML
	 private ComboBox <String> numberOfDonut;
	 
	 @FXML
	 /** 
	 Action Event Handler for Donut Select Type Combo Box
	 @param event
	 */
	 void donutMouseClicked(MouseEvent event) {
	    ObservableList<String> typeItems = 
	    		FXCollections.observableArrayList("Yeast Donut", "Cake Donut", "Donut Hole");
	    selectDonutType.setItems(typeItems);
	    
	    ObservableList<String> typeList = 
	    		FXCollections.observableArrayList("jelly", "chocolate frosted", "strawberry frosted", "sugar", "lemon filled");
	    selectListView.setItems(typeList);
	    }
	 
	 
	 
	 @FXML
	 /** 
	 Action Event Handler for Donut Select Type Combo Box
	 @param event
	 */
	 void numberDonutClicked(MouseEvent event) {
	    ObservableList<String> typeItems = 
	    		FXCollections.observableArrayList("1", "2", "3","4","5","6","7","8","9","10","11","12");
	    numberOfDonut.setItems(typeItems);
	    }
	    
	 
	 
	  
	
	 
	 
}
