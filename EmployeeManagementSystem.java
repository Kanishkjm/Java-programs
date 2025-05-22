abstract class Employee{
	private String name;
	private int empId;
	double basicSalary;
	Employee(String name,int empId,double basicSalary){
		this.name=name;
		this.empId=empId;
		this.basicSalary=basicSalary;
	}
	abstract double calculateSalary();
	public void displaySalary(){
		System.out.println("Employee Name:"+name);
		System.out.println("Employee ID:"+empId);
		System.out.println("Salary:"+calculateSalary());
	}
}
class FullTimeEmployee extends Employee{
	FullTimeEmployee(String name,int empId,double basicSalary){
		super(name,empId,basicSalary);
	}
	@Override
	public double calculateSalary(){
		return basicSalary+(0.2*basicSalary);
	}
}
class PartTimeEmployee extends Employee{
	private double hourlyrate;
	private int hoursWorked;
	PartTimeEmployee(String name,int empId,double basicSalary,double hourlyrate,int hoursWorked){
		super(name,empId,basicSalary);
		this.hourlyrate=hourlyrate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double calculateSalary(){
		return basicSalary+(hourlyrate+hourlyrate);
	}
}
public class EmployeeManagementSystem{
	public static void main(String args[]){
		FullTimeEmployee fulltime=new FullTimeEmployee("Alice",101,50000);
		Employee partTime=new PartTimeEmployee("Bob",102,3000,500,10);
		fulltime.displaySalary();
		partTime.displaySalary();
}
}
	
		
