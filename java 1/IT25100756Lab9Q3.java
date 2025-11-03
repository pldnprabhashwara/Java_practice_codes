public class IT25100756Lab9Q3{
	public static int add (int no1, int no2){
		return no1+no2;
	}
	public static int multiply (int no1, int no2){
		return no1*no2;
	}
	public static int square(int no1){
        return multiply(no1,no1);
	}	
	public static void main(String [] args){
		
		int x1 = square(add(multiply(3,4),multiply(5,7)));
		System.out.println("Result of (3 * 4 + 5 * 7)^2       : " + x1);
		
		int x2 = add(square(add(4,7)),square(add(8,3)));
		System.out.print("Result of (4 + 7)^2 + (8 + 3)^2   : " + x2);
		
	}
	
	
	
}