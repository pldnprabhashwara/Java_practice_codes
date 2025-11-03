import java.util.Scanner;
public class finalexam22{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] panels = new char[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("Enter Status for Position [" + i + " " + j + "]: ");
				panels[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nMonitoring Panel Visual Display: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(panels[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("\nSelect a Status (N, H, or L) to display all locations: ");
		char target = input.next().charAt(0);
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(panels[i][j] == target){
				System.out.println("Location of All Normal Indicators are: [" + i + " " + j + "]");
				}
			}
		}
	}
}