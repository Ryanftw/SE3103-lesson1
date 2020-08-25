package test;

import model.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.enter(1);
		c1.enter(2);
		c1.add();

		assert c1.getResult() == 2;
	}
}