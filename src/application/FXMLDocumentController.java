package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        if(event.getSource()==btn1){
           //get reference to the button's stage         
           stage=(Stage) btn1.getScene().getWindow();
           //load up OTHER FXML document
     root = FXMLLoader.load(getClass().getResource("SecondScene.fxml"));
         }
        else{
          stage=(Stage) btn2.getScene().getWindow();
     root = FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
         }
        //create a new scene with root and set the stage
         Scene scene = new Scene(root);
         stage.setScene(scene);
         stage.show();
       }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
    
    
