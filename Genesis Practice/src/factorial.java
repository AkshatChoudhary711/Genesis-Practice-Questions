import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		long fact = 1;
		while(num>1){
			fact = fact * num;
			num--;
		}
		System.out.println(fact);
	}
}
