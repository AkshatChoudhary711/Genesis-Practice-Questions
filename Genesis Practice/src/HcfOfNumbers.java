import java.util.Scanner;

public class HcfOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A: ");
		int a = sc.nextInt();
		System.out.print("Enter number B: ");
		int b = sc.nextInt();
		sc.close();

		System.out.println("HCF : "+gcd(a,b));
	}

	public static int gcd(int a, int b){
		//base case
		if (a == 0) return b;
		if(b == 0) return a;
		if(a>b) return gcd(a%b,b);
		return gcd(a,b%a);
	}

}
