import java.util.Scanner;
public class finalexam24{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[]    ids   = new int[5];
		char[]   types = new char[5];
		double[] amounts = new double[5];
		
		int totalHealth = 0;
		int totalEducation = 0;
		int countHeath = 0;
		int countEducation = 0;
		
		
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Donor " + ( i + 1) + " name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Donation ID: ");
			ids[i] = input.nextInt();
			
			System.out.print("Enter Cause Type: ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Amount: ");
			amounts[i] = input.nextDouble();
			
			input.nextLine();
			System.out.println();
		}
		
		double maximumNum = 0;
		String maximunName = "";
		
		double minimumNum = 0;
		String minimumName = "";
		
		boolean firstHealth = true;
		boolean firstEducate = true;
		
		for(int i = 0; i < 5; i++){
			if(types[i] == 'H' || types[i] == 'h'){
				totalHealth += amounts[i];
				countHeath++;
				
				if(firstHealth){
					maximumNum = amounts[i];
					maximunName = names[i];
					firstHealth = false;
				}else if(amounts[i] > maximumNum){
					maximumNum = amounts[i];
					maximunName = names[i];
				}
				
				
			}else if(types[i] == 'E' || types[i] == 'e'){
				totalEducation += amounts[i];
				countEducation++;
				
				if(firstEducate){
					minimumNum = amounts[i];
					minimumName = names[i];
					firstEducate = false;
				}else if(amounts[i] < minimumNum){
					minimumNum = amounts[i];
					minimumName = names[i];
				}
			}
		}
		
		System.out.println();
		System.out.println("Total Health Amount is: " + totalHealth);
		System.out.println("Total Education Amount is: " + totalEducation);
		System.out.println("Count of All Health Donations is: " + countHeath);
		System.out.println("Count of All Education Donations is: " + countEducation);
		System.out.println("Maximum Health Amount Donor Name is: " + maximunName + " and " + maximumNum);
		System.out.println("Minimum Education Amount Donor Name is: " + minimumName + " and " + minimumNum);
		
		
	}
}