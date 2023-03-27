class SingleRepeatedElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 3, 4, 5, 2, 3, 4 };
		int res1 = 0;
		int res = a[0];
		for (int i = 1; i < a.length; i++) {
			res1 = res ^ a[i];
		}
		System.out.println(res1 + " ");
	}
} 
