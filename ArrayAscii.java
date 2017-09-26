class ArrayAscii {
	public static void main (String args[]) {
		int [] ascii = new int [95]; 
		//char [] ch = new char [95];
		int pos = 32;
		for (int i = 0; i < 95; i++) {
			ascii[i] = pos;
			pos++;
		}
		System.out.println("All Characters are : ");
		for (int i = 0; i < 95; i++) {
			System.out.print(Character.toString((char) ascii[i]) + " ");
		}
	}
}