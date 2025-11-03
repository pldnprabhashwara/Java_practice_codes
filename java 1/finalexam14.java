import java.util.Scanner;
public class finalexam14{
	
	
	static int calculateExtension(int time, int totalBooks){
		int incentive = 0;
		if(time >= 14 && time <= 16){
			if(totalBooks >= 10)
				incentive = 5;
			else if(totalBooks <= 10 && totalBooks >= 5)
				incentive = 3;
		}
		
		else if(time >= 17 && time <= 18){
			if(totalBooks >= 10)
				incentive = 7;
			else if(totalBooks <= 10 && totalBooks >= 5)
				incentive = 4;
		}
		
		return incentive;
	}
	
	
	static void displayPriority(int finalDays){
		
		if(finalDays >= 8)
			System.out.println("Priority Tag: High");
		else if(finalDays >= 4 && finalDays <= 7)
			System.out.println("Priority Tag: Medium");
		else if(finalDays >= 1 && finalDays <= 3)
		    System.out.println("Priority Tag: Low");
		else
			System.out.println("Priority Tag: None");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time (14-18): ");
		int time = input.nextInt();
		
		if(time < 14 || time > 18){
			System.out.println("Invalid time entered!");
			return;
		}

		System.out.print("Enter total books: ");
		int totalBooks = input.nextInt();
		
		int finalDays = calculateExtension(time, totalBooks);
		System.out.println("Final extension days: " + finalDays);
		
		
		displayPriority(finalDays);
		
		
	}
}
