import java.util.*;
abstract class BankAccount{
	String accountNumber;
	String holderName;
	double balance;
	public BankAccount(String accountNumber,String holderName,double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	abstract double calculateInterest();
	public void deposit(int amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited Amount:$"+amount);
		}else{
			System.out.println("The amount mut be greater than 0");
		}
	}
	public void withdraw(int amount){
		if(amount>0 && balance>=amount){
			balance-=amount;
			System.out.println("Withdraw amount:$"+amount);
		}else{
			System.out.println("Insufficient amount");
		}
	}
	public void displayAccountDetails(){
		System.out.println("Account Details:");
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Holder Name:"+holderName);
		System.out.println("Balance:"+balance);
		System.out.println("Interest:"+calculateInterest());
	}
}
class SavingAccount extends BankAccount{
	SavingAccount(String accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
	public double calculateInterest(){
		return balance*0.04;
	}
}
class CurrentAccount extends BankAccount{
	
	public CurrentAccount(String accountNumber,String holderName,double balance){
		super(accountNumber,holderName,balance);
	}
	public double calculateInterest(){
		return balance*0.02;
	}
}	
public class BankingSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		SavingAccount saving=new SavingAccount("1234","Alice",50000);
		CurrentAccount current=new CurrentAccount("1234","Alice",50000);
		System.out.println("Choose the option:\n1.Savings Account\n2.Current Account:")	;
		int option=sc.nextInt();
		switch(option){
			case 1:{
				System.out.println("1.Withdraw\n2.Deposit\n3.Display balance");
				int choice=sc.nextInt();
				switch(choice){
					case 1:{
						System.out.println("Enter amount:$");
						int amount=sc.nextInt();
						saving.withdraw(amount);
						saving.displayAccountDetails();
						break;
						}
					case 2:{
						System.out.println("Enter amount:$");
						int amount=sc.nextInt();
						saving.deposit(amount);
						saving.displayAccountDetails();
						break;	
						}
					case 3:{
						saving.displayAccountDetails();
						break;}
				}
				break;}
			case 2:{
				System.out.println("1.Withdraw\n2.Deposit\n3.Display balance");
				int choice=sc.nextInt();
				switch(choice){
					case 1:{
						System.out.println("Enter amount:$");
						int amount=sc.nextInt();
						current.withdraw(amount);
						current.displayAccountDetails();
						break;
						}
					case 2:{
						System.out.println("Enter amount:$");
						int amount=sc.nextInt();
						current.deposit(amount);
						current.displayAccountDetails();
						break;
						}
					case 3:{
						current.displayAccountDetails();
						break;}
				}
			}
}
}
}
