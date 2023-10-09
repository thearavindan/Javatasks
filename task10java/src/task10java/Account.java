package task10java;

public class Account {
private double
balance;
Account(){
	balance = 0.00;
	
}
Account (double initialbalace){
	balance = initialbalace;
	if(balance>=0) {
		System.out.println("your account balance is : Rs." +balance);
	}else {
		System.out.println("balance cannot be negative. setting to the default balance");
		balance = 0;
	}
		
}
public void deposit(double amount) {
	
	if (amount>=0) {
		balance += amount;
	System.out.println("RS." +amount+ " has been credited to your account. your Balance is : Rs." +balance);
	}else
		System.out.println("entered invalid number");
	
}

public void  withdraw(double amount) {
	if(amount>0 && amount<= balance) {
		balance -= amount;
		System.out.println("Rs." +amount+ " withdrawed from your account. your balance is : Rs."+balance);
		
	}else {
		System.out.println("Insufficient balance");
	}
}
	public double getbalance() {
		return balance;
	}
	public static void main(String[] args) {
		Account acc = new Account(5000);
		acc.deposit(5000);
		acc.withdraw(6000);
		System.out.println("The available balance in your account is = Rs." +acc.getbalance());
		
	}
	
}

