import java.util.Scanner;
public class finalexam6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[5];
        int[] codes    = new int[5];
        double[] temps = new double[5];
        
        double total = 0;
        double maxcity, mincity;
        int maxcode = 0, mincode = 0, more30 = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter the city name: ");
            names[i] = input.nextLine();
            
            System.out.print("Enter the city code: ");
            codes[i] = input.nextInt();
            
            System.out.print("What is the temperature: ");
            temps[i] = input.nextDouble();
            
            input.nextLine();
        }
        
        maxcity = temps[0];
        mincity = temps[0];
        
        for(int j = 0; j < temps.length; j++){
            total += temps[j];
            
            if(maxcity < temps[j]){
                maxcity = temps[j];
                maxcode = j;
            }
            
            if(mincity > temps[j]){   // FIXED here
                mincity = temps[j];
                mincode = j;
            }
            
            if(temps[j] > 30){
                more30++;
            }
        }
        
        double average = total / temps.length;
        
        System.out.println("Average temperature: " + average);
        System.out.println("Hottest city is: " + names[maxcode] + 
                           " (Code: " + codes[maxcode] + 
                           ") with " + maxcity + "°C");
        System.out.println("Coldest city is: " + names[mincode] + 
                           " (Code: " + codes[mincode] + 
                           ") with " + mincity + "°C");
        System.out.println("Above 30°C cities are: " + more30);
    }
}
