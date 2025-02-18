import java.util.Scanner;

public class reverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n/2; i++){
			arr[i] = arr[i]^arr[n-i-1];
			arr[n-i-1] = arr[i]^arr[n-i-1];
			arr[i] = arr[i]^arr[n-i-1];

		}

		for(int j:arr){
			System.out.print(j+" ");
		}
	}
}
