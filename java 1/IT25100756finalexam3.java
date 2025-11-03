import java.util.Scanner;
public class IT25100756finalexam3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] numbers  = new int[5];
		char[] types   = new char[5];
		int[] rates    = new int[5];
		
		int totalSuites = 0;
		int totalStandered = 0;
		int countSuites = 0;
		int countStandered = 0;
		
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Guest " + ( i + 1 ) + " Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Room Number: ");
			numbers[i] = input.nextInt();
			
			System.out.print("Enter Room Type: ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Nightly Rate: ");
			rates[i] = input.nextInt();
			
			input.nextLine();
			System.out.println();
		}
		
		
		int highestSuite = 0;
		String highestsuiteName = "";
		
		int lowestStandered = 0;
		String loweststanderedName = "";
		
		boolean firstsuite = true;
		boolean firstStandered = true;
		
		
		for(int i = 0; i < 5; i++){
			if(types[i] == 'S' || types[i] == 's'){
				totalSuites += rates[i];
				countSuites++;
				
				if(firstsuite){
					highestSuite = rates[i];
					highestsuiteName = names[i];
					firstsuite = false;
				}else if(rates[i] > highestSuite){
					highestSuite = rates[i];
					highestsuiteName = names[i];
				}
				
			}else if(types[i] == 'D' || types[i] == 'd'){
				totalStandered += rates[i];
				countStandered++;
				
				if(firstStandered){
					lowestStandered = rates[i];
					loweststanderedName = names[i];
					firstStandered = false;
				}else if(rates[i] < lowestStandered){
					lowestStandered = rates[i];
					loweststanderedName = names[i];
				}
			}
		}
		
		System.out.println("Total Suite Revenue is: " + totalSuites);
		System.out.println("Total Standard Revenue is: " + totalStandered);
		System.out.println("Count of All Suite Bookings is: " + countSuites);
		System.out.println("Count of All Standard Bookings is: " + countStandered);
		System.out.println("Highest Suite Rate Guest Name is: " + highestsuiteName + " and " + highestSuite);
		System.out.println("Lowest Standard Rate Guest Name is: " + loweststanderedName + " and " + lowestStandered);
		
	}
}