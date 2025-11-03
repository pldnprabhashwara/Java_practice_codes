import java.util.Scanner;
public class finalexam27{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] scores = new char[5][3];
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
			System.out.print("Enter Result for Position [" + i + " " + j + "]: ");
			scores[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nScoreboard Visual Display: ");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Select a Result (W, L, or T) to display all locations: ");
		char target = input.next().charAt(0);
		
		System.out.print("Location of All Wins are: ");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				if(scores[i][j] == target){
					System.out.print("[" + i + " " + j + "]");
				}
			}
		}
	}
}