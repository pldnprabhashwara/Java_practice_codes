import java.util.Scanner;
public class finalexam17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[]    ids   = new int[5];
		char[]   types = new char[5];
		int[]    fees  = new int[5];
		
		int totalHike = 0;
		int totalPicnic = 0;
		int countHike = 0;
		int countPicnic = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Attendee "+ (i + 1) + " Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Event ID: ");
			ids[i] = input.nextInt();
			
			System.out.print("Enter Activity Type: ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Registration Fee: ");
			fees[i] = input.nextInt();
			
			input.nextLine();
			System.out.println();
		}
		
		int maximumNum = 0;
		String maximumName = "";
		
		int minimumNum = 0;
		String minimumName = "";
		
		boolean firstHiker = true;
		boolean firstpicnic = true;
		
		for(int i = 0; i < 5; i++){
			if(types[i] == 'H' || types[i] == 'h'){
				totalHike += fees[i];
				countHike++;
				
				if(firstHiker){
					maximumNum = fees[i];
					maximumName = names[i];
					firstHiker = false;
					
				}else if(fees[i] > maximumNum){
					maximumNum = fees[i];
					maximumName = names[i];
				}
			}else if(types[i] == 'P' || types[i] == 'p'){
				totalPicnic = fees[i];
				countPicnic++;
				
				if(firstpicnic){
					minimumNum = fees[i];
					minimumName = names[i];
					firstpicnic = false;
			
				}else if(fees[i] < minimumNum){
					minimumNum = fees[i];
					minimumName = names[i];
				}
			}
		}
		
		System.out.println("Total Hike Fee is: " + totalHike);
		System.out.println("Total Picnic Fee is: " + totalPicnic);
		System.out.println("Count of All Hike Registrations is: " + countHike);
		System.out.println("Count of All Picnic Registrations is: " + countPicnic);
		System.out.println("Maximum Hike Fee Attendee Name is: " + maximumName + " and " + maximumNum);
		System.out.println("Minimum Picnic Fee Attendee Name is: " + minimumName + " and " + minimumNum);
		
	}
}