import java.util.Scanner;

public class printNaturalNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range n: ");
		int n = sc.nextInt();
		sc.close();

		for(int i=1; i<=n; i++){
			System.out.print(i+" ");
		}

	}
}
