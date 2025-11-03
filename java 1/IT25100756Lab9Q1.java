import java.util.Scanner;

public class IT255100756Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = sc.nextDouble();
        
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminant > 0) {
            System.out.println("Roots are real and different :");
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.println("Root 1 : " + String.format("%.2f", root1));
            System.out.println("Root 2 : " + String.format("%.2f", root2));
        }
        
        
        sc.close();
    }
}