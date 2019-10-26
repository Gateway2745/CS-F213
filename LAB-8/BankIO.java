package test_bank;
import java.util.*;
import java.io.*;

public class BankIO {
	
	public static void readFile(String filename, Bank bank) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
		} 
		catch(FileNotFoundException e) {
			System.out.println("unable to read file!");
		}
		while(in.hasNextLine()) {
			BankAccount b = BankAccountreadAccount(in);
			bank.add(b);
		}
	}
	
	public static BankAccount BankAccountreadAccount(Scanner in){
		int accountNumber = in.nextInt();
		double initBalance = in.nextDouble();
		BankAccount bankAccount = new BankAccount(initBalance, accountNumber);
		return bankAccount;
	}
	
	public static void write(Bank bank, String filename) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(filename);
		}
		catch(FileNotFoundException e) {
			System.out.println("unable to write to file!");
		}
		out.println(bank.toString());
	}
	
}
