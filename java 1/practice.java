import java.util.Scanner;
public class practice{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		
		System.out.print("Enter the value a: ");
		a = input.nextDouble();
		
		System.out.print("Enter the value b: ");
		b = input.nextDouble();
		
		c = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
		
		System.out.print("value c is " + c + "cm");
		
	}
}