abstract class Exam{
	String subject;
	String rollNumber;
	double totalMark;
	public Exam(String subject,String rollNumber,double totalMark){
		this.subject=subject;
		this.rollNumber=rollNumber;
		this.totalMark=totalMark;
	}
	abstract boolean result();
	public void displayResult(){
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Subject:"+subject);
		System.out.println("Total marks:"+totalMark);
		System.out.println("Result:"+(result()?"Pass":"Fail")); 
	}
}
class TheoryExam extends Exam{
	TheoryExam(String subject,String rollNumber,double totalMark){
		super(subject,rollNumber,totalMark);
	}
	@Override
	public boolean result(){
		return totalMark>40;
	}
}
class PracticalExam extends Exam{
	PracticalExam(String subject,String rollNumber,double totalMark){
		super(subject,rollNumber,totalMark);
	}
	@Override
	public boolean result(){
		return totalMark>50;
	}
}
public class UniversityExamSystem{
	public static void main(String args[]){
		TheoryExam theory=new TheoryExam("Maths","1011",84);
		PracticalExam practical=new PracticalExam("C programming lab","1011",70);
		theory.displayResult();
		practical.displayResult();
}
}
