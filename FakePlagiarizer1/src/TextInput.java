import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextInput {
	
	static Scanner in = new Scanner(System.in);
	static BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
	
	public TextInput() {
		//
	}
	
	public static void Text() {
		
		System.out.println("Input the text you'd like to check for plagiarism.");
		if(FakePlagiarizerGUI.txtTypeTextHere.getText().length() <= 50) {
			Main.CheatCheck();
		}else {
			Main.chooser();
		}
			
		
	
}
	
	public static void choice() {
		System.out.println("Would you like to restart?");
		switch(in.nextLine()) {
		
		case "Yes":
			Main.main(null);
			break;
			
		case "yes":
			Main.main(null);
			break;
			
		case "y":
			Main.main(null);
			break;
			
		case "No":
			System.out.println("Press ENTER to finish.");
			try {
				in2.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
			break;
			
		case "no":
			System.out.println("Press ENTER to finish.");
			try {
				in2.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
			break;
			
		case "n":
			System.out.println("Press ENTER to finish.");
			try {
				in2.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
			break;
			
		default:
			System.out.println("That is not a valid option. Please try again.");
			choice();
			break;
		
		
		
		}
		System.out.println("Press ENTER to finish.");
	}
}
