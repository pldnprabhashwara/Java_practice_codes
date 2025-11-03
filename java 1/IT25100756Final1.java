import java.util.Scanner;
public class IT25100756Final1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int  marks1, marks2, marks3, marks4, marks5, ave;
		
        
		
		
		System.out.print("Enter the Subject1 mark: ");
		marks1 = input.nextInt();
		
		System.out.print("Enter the Subject2 mark: ");
		marks2 = input.nextInt();
		
		System.out.print("Enter the Subject3 mark: ");
		marks3 = input.nextInt();
		
		System.out.print("Enter the Subject4 mark: ");
		marks4 = input.nextInt();
		
		System.out.print("Enter the Subject5 mark: ");
		marks5 = input.nextInt();
		
		
		ave = (marks1 + marks2 + marks3 + marks4 + marks5) / 5 ;
		System.out.println("Subjects average is " + " " + ave);
		
		
		if (marks1 < 35 || marks2 < 35 || marks3 < 35 || marks4 < 35 || marks5 < 35){
			System.out.println("Any Subject Fail");
		}
		else if (ave >= 90 && ave < 100){
			System.out.print("Exellent");
		}
		else if (ave >= 75 && ave <= 89){
			System.out.print("Very Good");
		}
		else if (ave >= 60 && ave <= 74){
			System.out.print("Good");
		}
		else if (ave >= 50 && ave <= 59){
			System.out.print("Average");
		}
	    else if (ave >= 35 && ave <= 49){
			System.out.print("Pass");
		}
		else{
			System.out.println("Your Exam is Repeat");
		}
	
    }

}