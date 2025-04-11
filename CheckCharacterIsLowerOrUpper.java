package decisionMaking;

import java.util.Scanner;

public class CheckCharacterIsLowerOrUpper {
	public static void main(String[] args) {
		System.out.println("ENter a character");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);

		if (c >= 65 && c <= 90) {
			System.out.println(c + " is a uppercase alphabet");
		} else if (c >= 97 && c <= 122) {
			System.out.println(c + " is a lowercase alphabet");
		} else {
			System.out.println(c + " is not an alphabet");
		}

	}

}
