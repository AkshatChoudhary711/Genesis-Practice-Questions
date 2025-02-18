import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Edge: ");
		int edge = sc.nextInt();
		sc.close();

		for(int i=1; i<=edge; i++){
			for(int j=1; j<=edge; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
