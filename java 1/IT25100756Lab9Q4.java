import java.util.Scanner;
public class IT25100756Lab9Q4{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		double [] assignment = new double[5];
		double [] exam = new double[5];
		double [] finalmark = new double[5];
		
		char [] grades = new char[5];
		String [] names = new String[5];
		
		for(int i = 0; i < 5; i++){
			System.out.println(" ");
			
			System.out.print("Enter Name of Student " + (i+1) + ": ");
			names [i] = input.next();
			
			System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
			assignment [i] = input.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
			exam [i] = input.nextDouble();
			
			finalmark[i] = calcFinalMark(assignment[i], exam[i]);
			
			grades[i] = findGrades(finalmark[i]);
			
		}
		System.out.println(" ");
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		for(int i=0; i<5; i++){
			printDetails(names[i], assignment[i], grades[i]);
		}
	}
	public static double calcFinalMark(double assignment, double exam){
	    double finalmark = (assignment * 0.3 + exam * 0.7);
		return finalmark;
	}
	public static char findGrades(double finalmark){
		if(finalmark >= 75){
			return 'A';
		}
		else if(finalmark >= 60){
			return 'B';
		}
		else if(finalmark >= 50){
			return 'C';
		}
		else{
			return 'F';
		}
	}
	public static void printDetails(String names,double finalmark,char grades){
		System.out.println(names + "\t\t" + String.format("%.2f", finalmark) + "\t\t" + grades);
	}
	
		
	
	
	
	
	
	
}