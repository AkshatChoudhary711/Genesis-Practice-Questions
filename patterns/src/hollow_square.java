import java.util.Scanner;

public class hollow_square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Edge: ");
		int edge = sc.nextInt();
		sc.close();

		for(int i=1; i<=edge; i++){
			for(int j=1; j<=edge; j++){
				if(i==1||i==edge||j==edge||j==1){
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
