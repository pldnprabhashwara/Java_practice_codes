import java.util.Scanner;
public class IT25100756Q1A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] numbers = new int[5];
		char[] types = new char[5];
		int[] amounts = new int[5];
		
		int totalDeposit = 0;
		int totalWithdraw = 0;
		int countDeposit = 0;
		int countWithdraw = 0;
		
		for(int i =0; i < 5; i++){
			System.out.print("Enter Customer " + ( i + 1) + " Name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter Account Number     : ");
			numbers[i] = input.nextInt();
			
			System.out.print("Enter Transaction Type   : ");
			types[i] = input.next().charAt(0);
			
			System.out.print("Enter Amount             : ");
			amounts[i] = input.nextInt();
			
			input.nextLine();
			System.out.println();
		}
		
		int maximunNum = 0;
		String maximumName = "";
		
		int minimunNum = 0;
		String minimumName = "";
		
		boolean firstDeposit = true;
		boolean firstWithdraw = true;
		
		for(int i = 0; i < 5; i++){
			if(types[i] =='W' || types[i] == 'w'){
				totalWithdraw += amounts[i];
				countWithdraw++;
				
				if(firstWithdraw){
					maximunNum = amounts[i];
					maximumName = names[i];
					firstWithdraw = false;
 				}else if(amounts[i] > maximunNum){
					maximunNum = amounts[i];
					maximumName = names[i];
				}
			}else if(types[i] =='D' || types[i] =='d'){
				totalDeposit += amounts[i];
				countDeposit++;
				
				if(firstDeposit){
					minimunNum = amounts[i];
					minimumName = names[i];
					firstDeposit = false;
				}else if(amounts[i] < minimunNum){
					minimunNum = amounts[i];
					minimumName = names[i];
				}
			}
		}
		
		System.out.println();
		System.out.println("Total Deposit Amount is                      : " + totalDeposit);
		System.out.println("Total Withdrawal Amount is                   : " + totalWithdraw);
		System.out.println("Count of All Deposit Transactions  is        : " + countDeposit);
		System.out.println("Count of All Withdrawal Transactions is      : " + countWithdraw);
		System.out.println("Maximum Deposit Amount Customer Name is      : " + maximumName + " and " + maximunNum);
		System.out.println("Minimum Withdrawal Amount Customer Name is   : " + minimumName + " and " + minimunNum);
	}
}