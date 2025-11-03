import java.util.Scanner;
public class IT25100756finalexam2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] ids = new int[5];
		char[] types = new char[5];
		double[] values = new double[5];
		
		int totalElectronic = 0;
		int totalClothes = 0;
		int countElectronic = 0;
		int countClothes = 0;
		
		
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter Customer " + ( i + 1 ) + "Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Order ID: ");
			ids[i] = input.nextInt();
			
			System.out.print("Enter Product Type: ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Order Value: ");
			values[i] = input.nextDouble();
			
			input.nextLine();
			System.out.println();
			
		}
		
		double maximumNum = 0;
		String maximumName = "";
		
		double minimumNum = 0;
		String minimumName = "";
		
		boolean firstElectronic = true;
		boolean firstClothes = true;
		
		for(int i = 0; i < 5; i++){
			if(types[i] == 'E' || types[i] == 'e'){
				totalElectronic += values[i];
				countElectronic++;
				
				if(firstElectronic){
					maximumNum = values[i];
					maximumName= names[i];
					firstElectronic = false;
				}else if(values[i] > maximumNum){
					maximumNum = values[i];
					maximumName = names[i];
				}
				
				
			}else if(types[i] == 'C' || types[i] == 'c'){
				totalClothes += values[i];
				countClothes++;
				
				if(firstClothes){
					minimumNum = values[i];
					minimumName = names[i];
					firstClothes = false;
				}else if(values[i] < minimumNum){
					minimumNum = values[i];
					minimumName = names[i];
				}
			}
		}
		
		System.out.println("Total Electronics Value is " + totalElectronic);
		System.out.println("Total Clothing Value is: " + totalClothes);
		System.out.println("Count of All Electronics Orders is: " + countClothes);
		System.out.println("Count of All Clothing Orders is: " + countClothes);
		System.out.println("Maximum Electronics Value Customer Name is: " + maximumName + " and " + maximumNum);
		System.out.println("Minimum Clothing Value Customer Name is: " + minimumName + " and " + minimumNum);
	}
}