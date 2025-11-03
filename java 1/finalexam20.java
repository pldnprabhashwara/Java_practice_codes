import java.util.Scanner;
public class finalexam20{
	static double calcRebate(int time, double totalCost);
	double incentive;
	
	if(time > 8 && time < 10){
		if(totalCost >= 20000)
			incentive = 8% ;
		else if(20000 > totalCost >= 10000)
			incentive = 5%;
	}else if(time > 11 && time < 12){
		if(totalCost >= 20000)
			incentive = 10%;
		else if(20000 > totalCost >= 10000)
			incentive = 7%;
	}
	
	return incentive;
	
	static void displayUpgrade(double finalCost){
		if(finalCost >= 25000)
			System.out.println("Upgrade: Business Class");
		else if(finalCost >= 15000 && finalCost <= 24999)
		    System.out.println("Upgrade: Premium Economy");
		else if(finalCost >= 10000 && finalCost <= 14999)
		    System.out.println("Upgrade: Extra Legroom");
		else
			System.out.println("No Upgrade");
		
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time (8-12): ");
		int time = input.nextInt();
		
		if(time < 8 || time > 12){
			System.out.print("Invaliid time entered!");
			return;
		}
		
		System.out.print("Enter total cost: ");
		double totalCost = input.nextDouble;
		
		int finalCost = calcRebate(time, totalCost);
		System.out.println("Final cost after rebate: " + finalCost);
		
		displayUpgrade(finalCost);
		
	}
}

