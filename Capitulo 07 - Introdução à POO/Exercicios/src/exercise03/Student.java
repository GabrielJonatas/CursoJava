package exercise03;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void PassOrFailed() {
		if(FinalGrade() > 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - FinalGrade());
		}
	}
}
