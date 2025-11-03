import java.util.Scanner;
public class finalexam31{
	public static double calcPayment(int peakUnits, int offPeakUnits){
		//peak units charge
		double peakCharges = 0;
		if(peakUnits <= 100){
			peakCharges = peakUnits *  60.00;
			
			
		}else if(peakUnits <= 200){
			peakCharges = 100 * 60.00 + (peakUnits - 100) * 66.00;
			
			
		}else{
			peakCharges = 100 * 60.00 + 100 * 66.00 + (peakUnits - 200) * 68;
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the peak hours: ");
		int peakUnits = input.nextInt();
		
		System.out.print("Enter the off peak hours: ");
		int offPeakUnits = input.nextInt();
		
		calcPayment(peakUnits, offPeakUnits);
	}
}