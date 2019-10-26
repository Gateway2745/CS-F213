package test_bank;
import java.util.*;

public class BankFileTester {
	public static void main(String[] args) {
		Bank bank = new Bank(50);
		Scanner s = new Scanner(System.in);
		System.out.println("enter name of file");
		String filename = s.nextLine();
		BankIO.readFile("E:\\java-files\\accounts.txt", bank);
//		BankIO.write(bank, filename);
		System.out.println(bank);
	}
}
