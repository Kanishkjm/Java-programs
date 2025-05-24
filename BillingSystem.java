interface Billable{
	double priceCalculation(int quantity,double price);
	void generateBill(double amount);
}
interface Discountable extends Billable{
	double applyDiscount(double amount);
}
class RegularCustomer implements Billable{
	
	public double priceCalculation(int quantity,double price){
		price=quantity*price;
		return price;
	}
	
	public void generateBill(double amount){
		System.out.println("Price:"+amount);
		System.out.println("Total amount:$"+amount);
		System.out.println("=====================================");
	}
}
class PremiumCustomer implements Discountable{
	private double discount=20.0;
	
	public double priceCalculation(int quantity,double price){
		price=quantity*price;
		return price;
	}
	
	public double applyDiscount(double amount){
		return amount-(amount*discount/100);
	}
	
	public void generateBill(double amount){
		System.out.println("Price:"+amount);
		System.out.println("Discount:"+discount+"%");
		System.out.println("Total amount:$"+applyDiscount(amount));
		System.out.println("=====================================");
	}
}
class EmployeeCustomer implements Discountable{
	private double discount=30.0;
	
	public double priceCalculation(int quantity,double price){
		price=quantity*price;
		return price;
	}
	public double applyDiscount(double amount){
		return amount-(amount*discount/100);
	}
	
	public void generateBill(double amount){
		System.out.println("Price:"+amount);
		System.out.println("Discount:"+discount+"%");
		System.out.println("Total amount:$"+applyDiscount(amount));
		System.out.println("=====================================");
	}
}
public class BillingSystem{
	public static void main(String args[]){
	RegularCustomer	regular=new RegularCustomer();
	PremiumCustomer premium=new PremiumCustomer();
	EmployeeCustomer employee=new EmployeeCustomer();
	double amount=regular.priceCalculation(5,500);
	regular.generateBill(amount);
	double discountprice=premium.priceCalculation(5,500);
	premium.generateBill(discountprice);
	double discountamount=employee.priceCalculation(5,500);
	employee.generateBill(discountamount);
	}
}
	 

