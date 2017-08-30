import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Timer;

public class Main {
	
	public static Random rand = new Random();
	public static int n = rand.nextInt(20) + 80;
	public static int n2 = rand.nextInt(300) + 1;
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static javax.management.timer.Timer time = new javax.management.timer.Timer();
	
	public static void main(String[] args){
		
		
//		System.out.println(n + "% Plagiarism.");
		TextInput.Text();
		
	}
	
	public static void chooser() { //chooses random value between 80 and 100%
		
		
//		for(int i = 0; i <= n2; i++) {
//			if(i == n2)System.out.println(rand.nextInt(5) + "% Plagiarism.");
//			System.out.println("i: " + i + " n2: " + n2);
//			break;
//		}
		int i = rand.nextInt(300) + 1;

		if(i == n2 && i <= 100) {
			System.out.println(rand.nextInt(20) + "% Plagiarism.");
		}else if(i == n2 && i>= 101 && i<=200) {
			System.out.println((rand.nextInt(20) + 20) + "% Plagiarism.");
		}else if(i == n2 && i>=201) {
			System.out.println(rand.nextInt(20) + 40 + "% Plagiarism.");
		}else {
			System.out.println(n + "% Plagiarism.");
		}
		
//		System.out.println(n2 + "  " + i);/
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
	}
	
	public static void CheatCheck() {
		System.out.println("ERROR: Minimum Character Count Not Met (50 Characters)");
		TextInput.Text();
	}

}
