class ArrayMaxMin {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(args[i+1]);
		}
		int max = 0;
		int min = 0;
		for(int i = 0; i < N; i++) {
			if (arr[i] >= arr[max]) {
				max = i;
			} else if (arr[i] <= arr[min]) {
				min = i; 
			}
		}
		System.out.println("The maximum number is : " + arr[max]);
		System.out.println("The minimum number is : " + arr[min]);
	}
}