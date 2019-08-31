import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) {
		int num1;
		double double1;
		String numStr1, numStr2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter an integer: ");
		num1 = in.nextInt();
		System.out.println("you entered " + num1);
		
		System.out.println("enter a double: ");
		double1 = in.nextDouble();
		System.out.println("you entered " + double1);
		
		System.out.println("enter your first name: ");
		numStr1 = in.next();
		System.out.println("you name is " + numStr1);
		
		System.out.println("enter your surname: ");
		String dummy = in.nextLine();
		numStr2 = in.nextLine();
		System.out.println("you entered " + numStr2);
	
	}

}
