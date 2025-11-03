import java.util.Scanner;
public class finalexam9{
	static int calculateIncentive(int time, int totalResponses){
	int incentive = 0;
	
	if(time >= 9 && time <= 11){
		if(totalResponses >= 50)
			incentive = 15;
		else if(totalResponses >= 20)
			incentive = 10;
		
	}
	
	else if (time >= 12 && time <= 13){
		if(totalResponses >= 50)
			incentive = 20;
		else if(totalResponses >= 20)
			incentive = 12;
	}
	
	return incentive;
	
	}
	
	
	static void displayCertificate(int finalPoints){
		if(finalPoints >= 25)
			System.out.println("Certificate: Gold");
		else if(finalPoints >= 15)
			System.out.println("Certificate: Silver");
		else if(finalPoints >= 5)
			System.out.println("Certificate: Bronze");
		else
			System.out.println("Certificate: None");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time (9-13): ");
		int time = input.nextInt();
		
		if(time < 9 || time > 13){
			System.out.println("Invalid time entered!");
			return;
		}
		
		System.out.print("Enter total responses: ");
		int totalResponses = input.nextInt();
		
		int finalPoints = calculateIncentive(time, totalResponses);
		
		System.out.println("Final points after incentive: " + finalPoints);
		
		displayCertificate(finalPoints);
	}
	
    
    	
	
}