//package com.sthembiso.calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class App extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = (Parent)(FXMLLoader.load(getClass().getResource("ui.fxml")));

		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

/*	public static void main(String[] args)
	{
		launch(args);
	}*/
}
