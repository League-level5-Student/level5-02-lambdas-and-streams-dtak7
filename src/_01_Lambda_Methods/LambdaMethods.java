package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String back = "";
			for (int i = s.length(); i > 0; i--) {
				back = back + s.charAt(i - 1);
			}
			System.out.println(back);
		}, "are");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String ans = "";
			char x = 'z';
			boolean preUp = true;
			for (int i = 0; i < s.length(); i++) {
				if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || s.charAt(i) >= 65 && s.charAt(i) <= 90) {
					if (preUp) {
						x = Character.toLowerCase(s.charAt(i));
						preUp = false;
					} else {
						x = Character.toUpperCase(s.charAt(i));
						preUp = true;
					}
				} else {
					x = s.charAt(i);
				}
				ans = ans + x;
			}
			System.out.println(ans);
		}, "i'm ok, don't worry about me");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String ans="";
			for(int i =0;i<s.length();i++) {
				ans=ans+s.charAt(i)+'.';
			}
			System.out.println(ans);
		}, "there are a lot of dots");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
