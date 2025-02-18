import java.util.Scanner;

public class quadraticEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Equation : Ax^2 + Bx + C = 0");
		System.out.print("Enter coefficient of x^2 (A): ");
		int a = sc.nextInt();
		System.out.print("Enter coefficient of x (B): ");
		int b = sc.nextInt();
		System.out.print("Enter constant term (C): ");
		int c = sc.nextInt();
		sc.close();

		int d =(int)Math.pow(b,2) - 4*a*c;


		if(d>0){
			System.out.println("Roots are real and distinct! \n");
			d = (int)Math.pow(d,0.5);
			long rootOne = (-b + d)/2*a;
			long rootTwo = (-b - d)/2*a;
			System.out.println("Root 1: "+rootOne);
			System.out.println("Root 2: "+rootTwo);
		}else if (d == 0){
			d = (int)Math.pow(d,0.5);
			System.out.println("Roots are real but equal!\n");
			long rootOne = (-b + d)/2*a;
			System.out.println("Root 1: "+rootOne);
			System.out.println("Root 2: "+rootOne);
		}else{
			d = (int)Math.pow(-d,0.5);
			System.out.println("Roots are imaginary!\n");
			long rootOne = (-b + d)/2*a;
			long rootTwo = (-b - d)/2*a;
			System.out.println("Root 1: "+rootOne);
			System.out.println("Root 2: "+rootTwo);


		}

	}
}
