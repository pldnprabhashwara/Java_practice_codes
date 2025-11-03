import java.util.Scanner;
public class IT25100756Final3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double score = 0;
		String A = "A";
		String B = "B";
		String C = "C";
		String S = "S";
		String subject1,subject2,subject3;
		
		
		System.out.print("Enter your Subject 1 result: ");
		subject1 = input.nextLine();
		
		System.out.print("Enter your Subject 2 result: ");
		subject2 = input.nextLine();
		
		System.out.print("Enter your Subject 3 result: ");
		subject3 = input.nextLine();
		
        if ((subject1.equals("A") || subject1.equals("B") || subject1.equals("C") || subject1.equals("S"))
           && (subject2.equals("A") || subject2.equals("B") || subject2.equals("C") || subject2.equals("S"))
           && (subject3.equals("A") || subject3.equals("B") || subject3.equals("C") || subject3.equals("S"))){
			   
			   
		   System.out.print("Enter Your Z score: ");
			score = input.nextDouble();
		
		 if(score >= 1.5){
			System.out.print("Student is considered for addmision");
		}
		else if(score >= 0){
			System.out.print("The application is due to a low Z-Score");
		}
		else{
			System.out.print("The application is immediatly rejected");
		}
		
		   }
	}
	
}