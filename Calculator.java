package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {

	static Stage window;
	static Scene calculator;
	
	public void initialize() throws IOException{
		calculator = new Scene(FXMLLoader.load(getClass().getResource("calculator.fxml")), 375, 350);
		calculator.getStylesheets().add("application.css");
	}
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		window = primaryStage;
	     initialize();
	     
	        window.setTitle("MyHandyCalculator version 1.0");
	        window.setResizable(false);
	        window.setScene(calculator);
	        window.show();
	        
	}

	public static void main(String[] args) {
		launch(args);
	}
}
