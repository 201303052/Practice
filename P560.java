package problem;

import java.util.Scanner;

public class P560 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		int min = 10000;

		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
