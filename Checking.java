/*
 * Checking.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * 
 */


public class Checking {
	
	private double balance; // instance variable
	public static int totalAccountsGenerated; //static, ++ as objects are instantiated// 
		
	public Checking(){ // constructor; sets balance, increments a static variable.
		balance = 0.0;
		totalAccountsGenerated++;
		}
	public static double getTotalAccountsGenerated(){ // static methods can only reference static variables
		return totalAccountsGenerated;
		}	
	public void makeDeposit(double amount){ // mutator
		balance += amount;
		System.out.println("you made a deposit of: " + amount);
		}
	public void makeWithdraw(double amount) { // mutator
		if (balance >= amount){
			balance -= amount;
			}
		else {
			System.out.println("insufficient funding");
			}	
		}
	public double getBalance(){ // accessory method
		return balance;
		}
	
	public static void showBalance(Checking anyAccount){ // Static methods need an object to call non static methods
		System.out.println(anyAccount.getBalance());
		}	
	
	public static void main (String args[]) {
		
		Checking personal = new Checking();
		Checking personal2 = new Checking();
		System.out.println(totalAccountsGenerated);
		personal.makeWithdraw(10.00);
		personal.makeDeposit(11.00);
		Checking.showBalance(personal);
	}
}

