import java.util.Scanner;

public class greatestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		if (first > second && first > third) {
			System.out.println(first);
		} else if (second > first && second > third) {
			System.out.println(second);
		} else {
			System.out.println(third);
		}

	}
}
