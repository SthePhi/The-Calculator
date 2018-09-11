//package com.sthembiso.calculator;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller
{
	@FXML
	private Text ouput;
	private long number1 = 0;
	private String operator;
	private boolean start = true;
	private Model model = new Model();

	@FXML
	private void processNumpad(Action event)
	{
		if (start)
		{
			output.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		output.setText(output.getText() + value);
	}

	@FXML
	private void processOperator(Action event)
	{
		String value = ((Button)event.getSource()).getText();

		if (!"=".equals(value))
		{
			if (!operator.isEmpty())
				return;
			operator = value;
			number1 = Long.parseLong(output.getText());
			output.setText("");
		}
		else
		{
			if (operator.isEmpty())
				return;
			output.setText(Strong.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
			operator = "";
			start = true;
		}	
	}
}
