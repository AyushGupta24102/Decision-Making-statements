package decisionMaking;

import java.util.Scanner;

public class GreatestAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter Third number");
		int c = sc.nextInt();

		if (a > b && a > c)
			System.out.println(a + " is biggest number");
		else if (b > c)
			System.out.println(b + " is biggest number");
		else
			System.out.println(c + " is biggest number");

	}
}