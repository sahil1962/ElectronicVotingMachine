package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	//@Override
	public void start(Stage stage) {
//		OracleCon Conection = new OracleCon();
//		Conection.TempFunc();		

			try {
				Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
				Scene scene =  new Scene(root);
				stage.setScene(scene);
				stage.setTitle("Java fx Project");
				stage.show();
			

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
