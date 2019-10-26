package lab6;
import java.util.*;

class Bank {
	private ArrayList<Account> accts= new ArrayList<Account>();
	int maxActive = 10;

	public boolean addAccount(Account newone) {
		if(accts.size() == maxActive) return false;
		accts.add(newone);
		return true;
	}

	public boolean removeAccount(long acctnum) {
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account acc = itr.next();
			if(acc.getAcctNumber()==acctnum) {
				accts.remove(acc);
				return true;
			}
		}
		return false;
	}

	public double deposit(long acctnum, double amount) {
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account acc = itr.next();
			if(acc.getAcctNumber()==acctnum) {
				acc.setBalance(acc.getBalance() + amount);
				return 1;
			}
		}
		return -1;
	}

	public double withdraw(long acctnum, double amount) {
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account acc = itr.next();
			if(acc.getAcctNumber()==acctnum && acc.getBalance() >= amount) {
				acc.setBalance(acc.getBalance() - amount);
				return 1;
			}
		}
		return -1;
	}
	
	public String toString() {
		String temp = "";
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account acc = itr.next();
			temp += acc.toString() + '\n';
		}
		return temp;
	}
}

public class Driver {
	public static void main(String[] args) {
		Account a1 = new Account(1,1000,"a");
		Account a2 = new Account(2,1500,"b");
		Account a3 = new Account(3,2000,"c");
		
		System.out.println("Initial Status");
		Bank b = new Bank();
		b.addAccount(a1);
		b.addAccount(a2);
		b.addAccount(a3);
		
		System.out.println(b);
		
		System.out.println("Modified Status");
		b.deposit(1,500);
		b.withdraw(2,1000);
		b.removeAccount(3);
		
		System.out.println(b);
		
	}
}
