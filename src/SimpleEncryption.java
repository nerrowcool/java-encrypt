import java.util.Scanner;
import java.util.ArrayList;

public class SimpleEncryption {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int counterA, counterB, counterC, counterD, counterE;
		char[] newAlpha = new char[26];
		char[] orgAlpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		boolean checkInput;
		ArrayList<Character> newString = new ArrayList<Character>();

		/* make a second alphabet */
		System.out.println("Number of position you want to swift (with in 26) :");
		String input = n.nextLine();
		int num1 = Integer.parseInt(input);
		for (int checkLoop = 0; checkLoop > 0; checkLoop++) {
			if (num1 < 0 && num1 > 26) {
				System.out.println("Please enter valid number :");
				input = n.nextLine();
				num1 = Integer.parseInt(input);
			} else {
				break;
			}
		}
		for (counterA = 0; counterA <= 25 - num1; counterA++) {
			newAlpha[counterA] = orgAlpha[num1 + counterA];
		}
		for (counterB = 0; counterB <= num1 - 1; counterB++) {
			newAlpha[counterA] = orgAlpha[counterB];
			counterA = counterA + 1;
		}

		/* test alphabet */

		System.out.println("orgAlpha :");
		for (int pri = 0; pri < 26; pri++) {
			System.out.print(orgAlpha[pri]);
		}
		System.out.println("\r\nnewAlpha :");
		for (int pri = 0; pri < 26; pri++) {
			System.out.print(newAlpha[pri]);
		}

		System.out.println("\r\nEnter the string you want to encrypt :");
		String str1 = s.nextLine();

		for (counterC = 0; counterC < str1.length(); counterC++) {
			boolean found = false;
			for (counterD = 0; counterD < 26; counterD++) {
				if (str1.charAt(counterC) == orgAlpha[counterD]) {
					newString.add(newAlpha[counterD]);
					found = true;
					break;
				}
			}
			if (!found) {
				newString.add(str1.charAt(counterC));
			}
		}
		for (counterE = 0; counterE < newString.size(); counterE++) {
			System.out.print(newString.get(counterE));
		}
	}
}