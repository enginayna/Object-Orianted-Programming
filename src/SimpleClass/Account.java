package SimpleClass;

public class Account {
 private String  accountNumber;
 private double balance;
 private String name;
 private String email;
 private String phoneNumber;
 	Account(){
	 
 }
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public void addMoney(double ammount) {
	balance += ammount;
	System.out.println("New balance is " + balance);
}
public void moneyExtract(double ammount) {
	
	if(ammount> 1500) {
		System.out.println("Daily money extract limit is 1500");
	}
	if(balance-ammount < 0) {
		System.out.println("The balance has not enough. Balance is " + balance);
	}
	else {
		balance -= ammount;
		System.out.println("New balance is " + balance);
	}
}
	

}
