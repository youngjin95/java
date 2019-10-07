package java;

import java.util.Scanner;

public class Two {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
		}
	}
}
