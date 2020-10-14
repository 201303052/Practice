package Problems;

import java.util.Scanner;

public class P530 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		
		if(input >= 20) 
			System.out.println("adult");
		else 
			System.out.println(20-input + " years later");
		
	}

}
