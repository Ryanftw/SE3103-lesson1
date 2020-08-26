package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.CalculatorSimulator;
import view.MenuScreen;

public class ButtonClickListener implements ActionListener {

	private CalculatorSimulator panel;

	public ButtonClickListener(CalculatorSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var button = e.getSource();
		String message = panel.getDisplay().getText() + "\n";
		if (button == panel.getExitButton()) {
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			var menu = new MenuScreen(window);
			menu.init();
			window.pack();
			window.revalidate();
		} else if (button == panel.getEnterButton()) {
			try {
				double value = Double.parseDouble(panel.getNumField().getText());
				panel.getCalculator().enter(value);
				panel.getDisplay().setText(message + value + " Entered");
				panel.getNumField().setText("");
			} catch (NumberFormatException exception) {
				panel.getDisplay().setText(message + panel.getNumField().getText() + " : Invalid number");
				panel.getNumField().setText("");
			}
		} else if (button == panel.getResultButton()) {
			panel.getDisplay().setText(message + "Result = " + panel.getCalculator().getResult());
		} else if (button == panel.getAddButton()) {
			panel.getCalculator().add();
			panel.getDisplay().setText(message + "Add operation performed");
		} else if (button == panel.getSubButton()) {
			panel.getCalculator().subtract();
			panel.getDisplay().setText(message + "Subtract operation performed");
		} else if (button == panel.getMulButton()) {
			panel.getCalculator().multiply();
			panel.getDisplay().setText(message + "Multiply operation performed");
		} else if (button == panel.getDivButton()) {
			panel.getCalculator().divide();
			panel.getDisplay().setText(message + "Divide operation performed");
		}

	}
}