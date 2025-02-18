import java.util.Scanner;

public class palindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int copy = number;
		int reverse = 0;
		while(copy>0){
			reverse = reverse*10 + copy%10;
			copy/=10;
		}
		if(reverse == number){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}


	}
}
