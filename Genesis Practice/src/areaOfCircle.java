import java.util.Scanner;

public class areaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius= sc.nextDouble();
		sc.close();

		System.out.println("Area: "+Math.PI * radius * radius);
	}
}
