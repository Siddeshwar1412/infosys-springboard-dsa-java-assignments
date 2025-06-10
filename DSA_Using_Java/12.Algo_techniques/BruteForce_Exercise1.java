class Tester {
	 
	public static int calculatePower(int num, int p) {
		int result = 1;
		for (int i = 0; i < p; i++) {
			result *= num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePower(2, 3));
	}
}
