package SideProjects;
import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {
		int TotalCreditHours = 0;
		double TotalGrade = 0;
		String input = "";
		String a = "";
		Scanner scn = new Scanner(System.in);
		
	System.out.println("Welcome to the GPA calculator");
	System.out.println("Would you like to input a course? Type y or n");
	input = scn.nextLine();
	
	 while (input.equals("y")){
		 System.out.println("Please enter the number of credit hours for the course");
			double CreditHours = scn.nextDouble();
			TotalCreditHours += CreditHours;
			System.out.println("Please enter the grade you achieved in the course.");
			String CourseGrade = scn.next();
			double number = ( GradeNumericalValue(CourseGrade) ) * (CreditHours);
			// total grade points achieved
			TotalGrade += number;
			System.out.println("Would you like to input another course? Type y or n");
			input = scn.next();
	 }
	double GPA = TotalGrade / TotalCreditHours;
	System.out.println("Your GPA is for this semester was " + GPA);
}

	public static double GradeNumericalValue(String grade){
		double number = 0;
		if (grade.equals("A")){
			number = 4;
		} else if (grade.equals("B+")){
			number = 3.5;
		} else if (grade.equals("B")){
			number = 3;
		} else if (grade.equals("C+")){
			number = 2.5;
		}else if (grade.equals("C")){
			number = 2;
		}else if (grade.equals("D")) {
			number = 1;
		}else if (grade.equals("F")){
			number = 0;
		} 
		return number;
	}
}
