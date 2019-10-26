package lab3;

public class MyStatic {
	int a;
	static int b;
	MyStatic() {
		b++;
	}
	public void showData() {
		System.out.println("value of a = " + a);
		System.out.println("value of b = " + b);
	}
		
//	public static void increment() {
//		a++;
//	}
	
}
