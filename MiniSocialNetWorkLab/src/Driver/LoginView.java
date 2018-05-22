package Driver;

import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginView extends Application {
	
	
	public void LoginView() throws Exception {
		LoginController loginController = new LoginController() ;
		String userName = null ;
		String password = null ;
		Scanner sc = new Scanner (System.in) ;
		
		 boolean ok = false ;
	
		do {
			
			System.out.println("\n++++++++++++WELCOME+++++ TO+++ MININET");
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			System.out.println("\n:-> enter your Username:");
			 userName=sc.next();
			 
			 
			 System.out.println(":-> enter your Password");
			 password = sc.next();
			 	
			 ok=loginController.auth(userName, password);
			 
			 if(!ok){
                 System.out.println("Wrong Credentials.Try Again");
			 }
			
		}while(!ok) ;
	
		
		//show menu
		
		Driver driver = new Driver () ;
		 driver.diverMenu();
		
	}	
			
		
//	public static void main(String[] args) throws Exception {
//		
//		launch(args);
//		
////		LoginView loginview = new LoginView () ;
////		loginview.LoginView(); 
//	
//		
//		
//	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Driver driver = new Driver () ;
		
		primaryStage.setTitle("Mini Network");

		Parent root = FXMLLoader.load(getClass().getResource("mininetwork.fxml"));

		Scene scene = new Scene(root);
//
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	
}















