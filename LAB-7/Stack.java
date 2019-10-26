package lab6;
import java.util.*;

public class Stack {
	LinkedList<String> s = new LinkedList<String>();
	
	public void add(String s) {
		this.s.add(s);
	}
	
	public void remove() {
		if(!this.s.isEmpty()) this.s.removeLast();
	}
	
	public String toString() {
		String temp ="";
		int i = s.size()-1;
		while(i>=0) {
			temp += s.get(i--) + "\n";
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("a");
		s.add("b");
		s.add("c");
		System.out.println(s);
		s.remove();
		System.out.println(s);
	}
}
