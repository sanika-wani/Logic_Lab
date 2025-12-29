package oop;


class BankAccount{
	private String owner;
	private double balance;
	
	BankAccount(String owner, double balance){
		this.owner = owner;
		this.balance = balance;
	}
	void deposit(double amount) {
		if (amount>0) {
			this.balance += amount;
		}
	}
	void withdraw(double amount) {
		if((amount<= this.balance)&& amount>0) {
			this.balance-=amount;
		}
	}
	String getOwner(){
		return this.owner;
	}
	double getBalance() {
		return this.balance;
	}
	protected void applyFee(double fee) {
		if(fee>0 && fee<=balance) {
			balance-=fee;
		}
	}
	
}

public class Day4_Q6 {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Sarthak", 1000.0);
		System.out.println(acc.getBalance()); 
		acc.deposit(500);
		System.out.println(acc.getBalance()); 
		acc.withdraw(300);
		System.out.println(acc.getBalance()); // 1200.0 
		acc.applyFee(10);
		System.out.println(acc.getBalance()); 
	}
}
