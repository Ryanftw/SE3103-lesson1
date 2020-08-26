package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorSimulator;

public class ButtonClickListener implements ActionListener {

	private CalculatorSimulator panel;

	public ButtonClickListener(CalculatorSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var button = e.getSource();
		if (button == panel.getExitButton()) {

		}

	}
}