package SimpleClass;

public class Run_Account {
public static void main(String[] args) {
	Account a1 = new Account();
	
	a1.setAccountNumber("1234567e");
	a1.setBalance(1000);
	a1.setEmail("enginayna@hotmail.com");
	a1.setName("Engin");
	a1.setPhoneNumber("05530580957");
	
	System.out.println("Balance is " + a1.getBalance());
	a1.addMoney(524);
	a1.moneyExtract(389);
	
}
}
