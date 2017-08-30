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
		if(in.nextLine().length() <= 50) {
			Main.CheatCheck();
		}else {
			Main.chooser();
		}
			
		
	
}
}
