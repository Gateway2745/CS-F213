package lab6;

public class Movie {
	// Declaring an interface inside the class
	interface Bookable {
		public void printTicket();

		public void giveTicket(String movie);
	}

	public void BookTheTicket() {
		// Writing an InnerClass that implements the above interface
		class EnglishMovie implements Bookable {
			String name;

			public void printTicket() {
				giveTicket("BlindDate");
			}

			public void giveTicket(String movie) {
				name = movie;
				System.out.println("You have booked for the movie " + name);
			}
		}// end of class EnglishMovie
			// creating an object for the inner class
		Bookable hollywood = new EnglishMovie();
		// anonymous inner class which is basing the interface..
		Bookable hindiMovie = new Bookable() {
			public void printTicket() {
				giveTicket("Bachna Ae Haseeno");
			}

			public void giveTicket(String movie) {
				String name = movie;
				System.out.println("You have booked for the movie " + name);
			}
		};
		hollywood.giveTicket("abc");
		hindiMovie.giveTicket("def");
	}// end of method BookTheTicket

	public static void main(String[] args) {
		Movie easyMovie = new Movie();
		easyMovie.BookTheTicket();
	}
} // end of class Movie

