package model;

import java.util.ArrayList;

public class PiggyBank {

	private ArrayList<Coin> coinHistory = new ArrayList<>();
	private int balance;

	public PiggyBank() {
		balance = 0;
	}

	public void enter(Coin c) {
		balance += c.getValue();
		coinHistory.add(c);
	}

	public int getBalance() {
		return balance;
	}

	public int getCoinCount() {
		return coinHistory.size();
	}

	@Override
	public String toString() {
		return "Balance = " + balance + ", Coin count = " + coinHistory.size();
	}

	public ArrayList<Coin> getCoinHistory() {
		return coinHistory;
	}
}