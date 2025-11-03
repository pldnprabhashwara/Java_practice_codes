import java.util.Scanner;
public class finalexam28{
	static int calculatePriority(int time, int partySize){
	
	int incentive = 0;
	if(time >= 18 && time <= 20){
		if(partySize >= 6){
			incentive = 20;
		}else if(partySize < 6 && partySize >= 3){
			incentive = 10;
		}
	}else if(time >= 21 && time <= 22){
		if(partySize >= 6){
			incentive = 25;
		}else if(partySize < 6 && partySize >= 3){
			incentive = 15;
		}
	}
	return incentive;
	}
	
	static void displayTable(int finalPoints){
		if(finalPoints >= 25)
		System.out.println("Table Type: VIP");
		else if(finalPoints >= 15 || finalPoints <= 24)
		System.out.println("Premium");
		else if(finalPoints >= 5 || finalPoints <= 14)
		System.out.println("Table Type: Standard");
		else 
		System.out.println("Table Type: Waiting List");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter time (18-22): ");
		int time = input.nextInt();
		
		if(time < 18 || time > 22){
			System.out.println("You Entered Time Wrong");
			return;
		}
		
		System.out.println("Enter party size: ");
        int partySize = input.nextInt();
		
		int finalPoints = calculatePriority(time, partySize);
		System.out.println("Final priority points: " + finalPoints);
		
		displayTable(finalPoints);
	}
	
} 