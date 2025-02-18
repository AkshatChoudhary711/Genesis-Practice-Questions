import java.util.Scanner;

public class binaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder binaryNum = new StringBuilder(sc.next());
		sc.close();
		binaryNum.reverse();
		int num = 0;
		for(int i=0; i<binaryNum.length(); i++){
			num += (int)Math.pow(2,i) * (binaryNum.charAt(i) - '0');
		}
		System.out.println(num);


	}
}
