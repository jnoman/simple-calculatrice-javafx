package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,420,300);
			
			Label lapel_num1 = new Label("number 1 :");
			lapel_num1.relocate(20, 50);
			root.getChildren().add(lapel_num1);
			
			Label lapel_num2 = new Label("number 2 :");
			lapel_num2.relocate(20, 100);
			root.getChildren().add(lapel_num2);
			
			TextField txt_num1 = new TextField();
			txt_num1.relocate(150, 50);
			root.getChildren().add(txt_num1);

			TextField txt_num2 = new TextField();
			txt_num2.relocate(150, 100);
			root.getChildren().add(txt_num2);

			Button btn_addition = new Button("Addition");
			Button btn_soustraction = new Button("Soustraction");
			Button btn_multiplication = new Button("Multiplication");
			Button btn_division = new Button("Division");
			
			btn_addition.relocate(20, 160);
			btn_soustraction.relocate(110, 160);
			btn_multiplication.relocate(220, 160);
			btn_division.relocate(340, 160);
			
			root.getChildren().add(btn_addition);
			root.getChildren().add(btn_soustraction);
			root.getChildren().add(btn_multiplication);
			root.getChildren().add(btn_division);
			
			Label lapel_result = new Label();
			lapel_result.relocate(20, 250);
			root.getChildren().add(lapel_result);
			
			btn_addition.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					Double result=Double.parseDouble(txt_num1.getText())+Double.parseDouble(txt_num2.getText());
					lapel_result.setText("Resultat : "+result);
				}
			});
			
			btn_soustraction.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					Double result=Double.parseDouble(txt_num1.getText())-Double.parseDouble(txt_num2.getText());
					lapel_result.setText("Resultat : "+result);
				}
			});
			
			btn_multiplication.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					Double result=Double.parseDouble(txt_num1.getText())*Double.parseDouble(txt_num2.getText());
					lapel_result.setText("Resultat : "+result);
				}
			});
			
			btn_division.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					Double result=Double.parseDouble(txt_num1.getText())/Double.parseDouble(txt_num2.getText());
					lapel_result.setText("Resultat : "+result);
				}
			});
			
			primaryStage.setTitle("Calculatrice");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
