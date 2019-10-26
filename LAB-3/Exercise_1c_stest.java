package lab3;

class Exercise_1c_stest {
	private static String[] Str;
	static {
		System.out.println("1.%");
	}
	public static void main(String args) {
		System.out.println("2.@");
	}
	static {
		System.out.println("3.&");
	}
	static {
		Exercise_1c_test.main(Str);
		Exercise_1c_stest.main(Str);
	}
	static {
		System.out.println("4.~");
	}
	static {
		System.out.println("5.$");
	}
}

