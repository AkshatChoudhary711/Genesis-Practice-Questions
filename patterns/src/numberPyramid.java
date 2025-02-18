import java.util.Scanner;

public class numberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int levels = sc.nextInt();
		sc.close();
		int count = 1;
		for(int i=1; i<=levels; i++){
			for(int j=1; j<=levels-i; j++){
				System.out.print("   ");
			}
			count = 1;
			for(int j=1; j<=2*i-1; j++){
				System.out.print(" "+count++ +" ");
			}
			System.out.println();
		}
	}
}
