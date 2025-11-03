/*public class finalexam7{
	static void addnumbers(int a, int b){
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}
	
	public static void main(String[] args){
		addnumbers(5, 7);
		addnumbers(10, 20);
	}
*/

public class finalexam7{
    // Method that checks even or odd
    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(5);   // Calling method with 5
        checkEvenOdd(10);  // Calling method with 10
        checkEvenOdd(21);  // Calling method with 21
    }
}