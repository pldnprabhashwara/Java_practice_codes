import java.util.Scanner;
public class finalexam11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] codes    = new int[5];
		char[] categories = new char[5];
		int[] quantities = new int[5];
		
		int totalGroceries = 0;
		int totalElectronics = 0;
		int countGroceries = 0;
		int countelectronics = 0;

		
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Item " + (i + 1) + "  Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Item Code: ");
			codes[i] = input.nextInt();
			
			System.out.print("Enter Stock Quantity(G or g || E or e): ");
			categories[i] = input.next().charAt(0);
			
			System.out.print("Enter Stock Quantity: ");
			quantities[i] = input.nextInt();
			
			input.nextLine();
		}
		
		int maxinumGrocery = 0;
		String maximumGrocery = "";
		
		int mininumElectronic = 0;
		String minimumElectronic = "";
		
		boolean firstGrocery = true;
		boolean firstElectronic = true;
		
		for(int i =0; i < quantities.length; i++){
			if(categories[i] == 'G' || categories[i] == 'g'){
				totalGroceries += quantities[i];
				countGroceries++;
				
				if(firstGrocery){
					maxinumGrocery = quantities[i];
					maximumGrocery = names[i];
					firstGrocery = false;
					
				}else if(quantities[i] > maxinumGrocery){
						maxinumGrocery = quantities[i];
					    maximumGrocery = names[i];
					}
				
			}else if(categories[i] == 'E' || categories[i] == 'e'){
				totalElectronics += quantities[i];
				countelectronics++;
				
				if(firstElectronic){
					mininumElectronic = quantities[i];
					minimumElectronic = names[i];
					firstElectronic = false;
					
					
				}else if(quantities[i] < mininumElectronic){
						 mininumElectronic = quantities[i];
					     minimumElectronic = names[i];
					}
					
				
			}
			
			
		}
		
		System.out.println("Total Grocery Stock is: " + totalGroceries);
		System.out.println("Total Electronics Stock is: " + totalElectronics);
		System.out.println("Count of All Grocery Items is: " + countGroceries);
		System.out.println("Count of All Electronics Items is: " + countelectronics);
		System.out.println("Maximum Grocery Stock Item Name is: " + maximumGrocery);
		System.out.println("Minimum Electronics Stock Item Name is: " + minimumElectronic);
		
		
		
	}
}