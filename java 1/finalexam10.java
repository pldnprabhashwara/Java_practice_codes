import java.util.Scanner;
public class finalexam10{
	static int calculateReadingPoints(int time, int totalBooks){
		int incentive = 0;
		if(time >= 10 && time <= 12){
			if(totalBooks >= 30)
				incentive = 25;
			else if(totalBooks >= 15)
				incentive = 30;
		}
		
		if(time >= 13 && time <= 15){
			if(totalBooks >= 30)
				incentive = 30;
			else if(totalBooks >= 15)
				incentive = 18;
		}	
		return incentive;
	}
	
	
	static void displayReward(int finalPoints){
		if(finalPoints >= 35)
			System.out.println("Reward is Platinum");
		else if(finalPoints >= 25 || finalPoints <= 34)
			System.out.println("Reward is Gold");
		else if(finalPoints >= 15 || finalPoints <= 24)
			System.out.println("Reward is Silver");
		else
			System.out.println("Reward is None");
		
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time you come(10-12 || 13-15): ");
		int time = input.nextInt();
		
		if(time < 10 || time > 15){
			System.out.print("Invalid time entered!");
			return;
		}
		
		System.out.println("Enter total responses: ");
		int totalBooks = input.nextInt();
		
		int finalPoints = calculateReadingPoints(time, totalBooks);
		
		System.out.println("Final points after Reading Points: " + finalPoints);
		
		displayReward(finalPoints);
		
		

		
	}

}