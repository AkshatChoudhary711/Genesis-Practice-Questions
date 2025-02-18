import java.util.Scanner;

public class armstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		sc.close();
		long copy = number;
		int count = 0;
		while(copy>0){
			copy/=10;
			count++;
		}
		long sum = 0;
		copy = number;
		while(copy>0){
			sum += (long)Math.pow((copy%10),count);
			copy/=10;
		}
		if(sum == number) System.out.println("Armstrong Number");
		else System.out.println("Not an armstrong number");


	}
}
