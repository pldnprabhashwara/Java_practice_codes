import java.util.Scanner;
public class finalexam23{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[6];
		int[]    ids   = new int[6];
		char[]   types = new char[6];
		int[]    fees  = new int[6];
		
		int totalYoga = 0;
		int totalCardio = 0;
		int countYoga = 0;
		int countCardio = 0;
		
		
		for(int i = 0; i < 6; i++){
			System.out.print("Enter Member " + ( i + 1 ) + " Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Membership ID: ");
			ids[i] = input.nextInt();
			
			System.out.print("Enter Class Type: ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Monthly Fee: ");
			fees[i] = input.nextInt();
			
			input.nextLine();
			System.out.println();
		}
		
		int highestYoganum = 0;
		String highestYoganame = "";
		
		int lowestCardionum = 0;
		String lowestCardioname = "";
		
		boolean firstYoganame = true;
		boolean firstCardioname = true;
		
		for(int i = 0; i < 6; i++){
			if(types[i] == 'Y' || types[i] == 'y'){
				totalYoga += fees[i];
				countYoga++;
				
				if(firstYoganame){
					highestYoganum = ids[i];
					highestYoganame = names[i];
					firstYoganame = false;
				}else if(fees[i] > highestYoganum){
					highestYoganum = ids[i];
					highestYoganame = names[i];
				}
				
			}else if(types[i] == 'C' || types[i] == 'c'){
				totalCardio += fees[i];
				countCardio++;
				
				if(firstCardioname){
					lowestCardionum = ids[i];
					lowestCardioname = names[i];
					firstCardioname = false;
				}else if(fees[i] < lowestCardionum){
					lowestCardionum = ids[i];
					lowestCardioname = names[i];
				}
				
			}
			
		}
        System.out.println();
		System.out.println("Total Yoga Fee is: " + totalYoga);
		System.out.println("Total Cardio Fee is: " + totalCardio);
		System.out.println("Count of All Yoga Memberships is: " + countYoga);
		System.out.println("Count of All Cardio Memberships is: " + countCardio);
		System.out.println("Highest Yoga Fee Member Name is: " + highestYoganame + " and " + highestYoganum);
		System.out.println("Lowest Cardio Fee Member Name is: " + lowestCardioname + " and " + lowestCardionum);
	}
}