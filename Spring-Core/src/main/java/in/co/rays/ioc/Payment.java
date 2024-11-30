package in.co.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {

	@Value(value = "100")
	double balance = 0;

	public void setBalance(double balance) {

		this.balance = balance;
	}

	public double getBalancd() {

		return balance;
	}

	public double makePayment(double amount) {

		balance -= amount;

		return balance;
	}

	public double diposite(double amount) {

		balance += amount;

		return balance;
	}

}
