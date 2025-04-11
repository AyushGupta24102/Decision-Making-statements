package decisionMaking;

import java.util.Scanner;

public class ChkNumIsDivisibleBy5And11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number");
		int a = sc.nextInt();

		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println("Number is divisible by 5 and 11 ");
		} else {
			System.out.println("Number is  not divisible by 5 and 11 ");
		}
	}

}