class ArraySumAverage {
	public static void main(String args []) {
		int N = Integer.parseInt(args[0]);
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(args[i+1]);
		}
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / N;
		System.out.println("Sum : " + sum);
		System.out.print("Average : " + avg);
	}
}