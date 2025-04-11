package decisionMaking;

import java.util.Scanner;

public class GreatestAmongFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		System.out.println("Enter fourth number: ");
		int d = sc.nextInt();

		if (a > b && a > c && a > d) {
			System.out.println(a + " is biggest number ");

		} else if (b > c && b > d) {
			System.out.println(b + " is biggest number");
		} else if (c > d) {
			System.out.println(c + " is biggest number");
		} else {
			System.out.println(d + " is biggest number");
		}
	}
}