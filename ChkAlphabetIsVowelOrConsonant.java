package decisionMaking;

import java.util.Scanner;

public class ChkAlphabetIsVowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		char c = sc.next().charAt(0);

		if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U'))

			System.out.println(c + " is vowel");
		else
			System.out.println(c + " is not a vowel");

	}
}
