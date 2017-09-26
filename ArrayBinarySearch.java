import java.util.Scanner;
class ArrayBinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(args[0]);
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(args[i+1]);
		}
		System.out.print("Enter the key : ");
		int key = sc.nextInt();
		int i = 0;
		while(arr[i] != key) {
			i++;
		}
		if (i >= N) {
			System.out.print("-1");
		} else {
			System.out.println("The Index of key is : " + i);
		}
	
	
		sc.close();
	}
}