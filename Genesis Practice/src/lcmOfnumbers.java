public class lcmOfnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A: ");
		int a = sc.nextInt();
		System.out.print("Enter number B: ");
		int b = sc.nextInt();
		sc.close();

		int lcm = (a*b)/HcfOfNumbers.gcd(a,b);
		System.out.println("LCM: "+lcm);
	}


}
