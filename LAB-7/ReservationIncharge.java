package lab6;

import java.util.*;

public class ReservationIncharge {

	public static void main(String[] args) {

		// getting an instance of ReservationCounter
		ReservationCounter counter = ReservationCounter.InitializeCounter();
		counter.standInLine("Amitab");
		counter.standInLine("amir");
		counter.standInLine("salman");
		counter.standInLine("Tom Cruise");
		for (int position = 0; position < counter.customersInLine(); position++) {
			System.out.println("customer at " + (position + 1)
					+ " place in line is "
					+ counter.checkTheCustomerAt(position));
		}
		System.out.println("Ticket given to" + counter.giveTicket());
		counter.leaveTheLine();
		counter.standInLine("Emma Watson");
		System.out.println("Ticket given to " + counter.giveTicket());
		counter.leaveTheLine();
		System.out.println("customer in position 2 is "
				+ counter.checkTheCustomerAt(1));
		System.out.println("Still there are" + counter.customersInLine()
				+ " people in line");
	}
}

class ReservationCounter {

	LinkedList ReservationQueue;

	private ReservationCounter() {
		// initializing the ReservationQueue
		ReservationQueue = new LinkedList();
	}

	// Adding an element to the linkedlist from the end just like in a queue
	public void standInLine(String customer) {
		ReservationQueue.add((String) customer);
	}

	// default Removal of the element is done from the front i.e first element
	// is removed
	public void leaveTheLine() {
		ReservationQueue.remove();
	}

	// demonstration of how the first element of list can be accessed.
	public String giveTicket() {
		return (String) ReservationQueue.getFirst();
	}

	// retrieving data from anywhere in the list
	public String checkTheCustomerAt(int position) {
		return (String) ReservationQueue.get(position);
	}

	public static ReservationCounter InitializeCounter() {
		return new ReservationCounter();
	}

	// size of the list
	public int customersInLine() {
		return ReservationQueue.size();
	}
}
