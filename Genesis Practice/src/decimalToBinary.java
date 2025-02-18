import java.util.Scanner;

public class decimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		StringBuilder binary = new StringBuilder();
		while(num>1){
			binary.append(num%2);
			num/=2;
		}
		binary.append(1);
		binary.reverse();
		System.out.println(binary);

	}
}
