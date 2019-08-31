import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum=0;
		for(int i=0;i<10;i++){
			System.out.println("enter integer " + (i + 1));
			int val = Integer.parseInt(br.readLine());
			sum += val;
		}
		System.out.println("The sum is " + sum);
	}

}
