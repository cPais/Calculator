package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;


public class calculatorController implements Initializable  {
	
	public TextField calculationField;
	public Button button0, button1, button2, button3;
	public Button button4, button5, button6, button7;
	public Button button8, button9, buttonDivide,buttonMultiply;
	public Button buttonSubtract, buttonAdd, buttonDecimal, buttonEquals;
	public Button buttonClear;
	
	ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		button0.setOnAction(e -> calculationField.appendText("0") );
		button1.setOnAction(e -> calculationField.appendText("1") );
		button2.setOnAction(e -> calculationField.appendText("2") );
		button3.setOnAction(e -> calculationField.appendText("3") );
		button4.setOnAction(e -> calculationField.appendText("4") );
		
		button5.setOnAction(e -> calculationField.appendText("5") );
		button6.setOnAction(e -> calculationField.appendText("6") );
		button7.setOnAction(e -> calculationField.appendText("7") );
		button8.setOnAction(e -> calculationField.appendText("8") );
		button9.setOnAction(e -> calculationField.appendText("9") );
		
		buttonDivide.setOnAction(e -> calculationField.appendText("/") );
		buttonMultiply.setOnAction(e -> calculationField.appendText("*") );
		buttonSubtract.setOnAction(e -> calculationField.appendText("-") );
		buttonAdd.setOnAction(e -> calculationField.appendText("+") );
		buttonDecimal.setOnAction(e -> calculationField.appendText(".") );
		
		buttonClear.setOnAction(e -> calculationField.setText("") );
		buttonEquals.setOnAction(e -> calculate());
		
		
	    
	    
		
		
	}
	public void calculate(){
		
		try {
			calculationField.setText( engine.eval(calculationField.getText()).toString() );
		} catch (ScriptException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

}
