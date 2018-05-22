package Driver;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mininetworkController {
	
	 
	
	@FXML
	private  TextField userName ;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button loginBtn ;
	
	@FXML
//	private void handleLogin(ActionEvent event) throws IOException {
	private void handleLogin() throws IOException {
		
			//check
		String uName = userName.getText();
		String pWord = password.getText();
		
		try {
			LoginController.auth(uName, pWord);
			//login
			
			Stage stage = (Stage) loginBtn.getScene().getWindow();
		
			Parent root = FXMLLoader.load(getClass().getResource("menuScene.fxml"));
		
			Scene scene = new Scene(root);
		
			stage.setScene(scene);
		
			stage.show();
		} catch (LoginException e) {
			
			Alert alert = new Alert(AlertType.ERROR);

            alert.setTitle("Ooops");

            alert.setHeaderText(null);

            alert.setContentText(e.getMessage());

            alert.showAndWait();						
		}	

	}

}
