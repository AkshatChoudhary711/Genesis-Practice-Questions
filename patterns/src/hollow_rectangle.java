import java.util.Scanner;

public class hollow_rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		System.out.println("Enter breadth: ");
		int breadth = sc.nextInt();

		sc.close();

		for (int i = 1; i <= breadth; i++) {
			for (int j = 1; j <= length; j++) {
				if(i==1||j==1||i==breadth||j==length){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
