class Largest2Smallest2 {
	public static void main (String args []) {
		int N = Integer.parseInt(args[0]);
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(args[i+1]);
		}
		int max1 = 0;
		int min1 = 0;
		for(int i = 0; i < N; i++) {
			if (arr[i] >= arr[max1]) {
				max1 = i;
			} else if (arr[i] <= arr[min1]) {
				min1 = i; 
			}
		}
		int max2 = 0;
		int min2 = 0;
		for(int i = 0; i < N; i++) {
			if (arr[i] >= arr[max2] && i != max1) {
				max2 = i;
			} else if (arr[i] <= arr[min2] && i != min1) {
				min2 = i; 
			}
		}
		System.out.println("Largest two numbers are : " + arr[max1] + " " + arr[max2]);
		System.out.println("Smallest two numbers are : " + arr[min1] + " " + arr[min2]);
	}
}