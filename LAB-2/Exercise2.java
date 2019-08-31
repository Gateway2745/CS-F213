import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++){
			System.out.println("enter integer " + (i + 1));
			int val = in.nextInt();
			sum += val;
		}
		System.out.println("The sum is " + sum);
	}

}
