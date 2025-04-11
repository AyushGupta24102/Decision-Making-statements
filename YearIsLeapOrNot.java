package decisionMaking;

import java.util.Scanner;

public class YearIsLeapOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();

		if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
			System.out.println(year + " is Leap year");
		else
			System.out.println(year + " is ot a leap year");
	}
}