/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */
public class MainAssignent2 {

	public static void main(String[] args) {
		final Title t1 = new Title("The Hobbit", "An Unexpected Journey");
		final Title t2 = new Title("Catcher in the Rye");
		
		final Author a1 = Author.JJR_Tolkien;
		final Author a2 = Author.JD_Sallinger;
		
		final Books b1 = new AudioBook(t1, a1, 1800.5);
		final Books b2 = new PaperBack(t2, a2, 100);
		
		final Reader r1 = new Reader("joe", "Soap");
		
		a1.receive(100.0);
		a1.buy(b2);
		
		r1.buy(b1);
		r1.receive(100.0);
		r1.buy(b1);
		r1.buy(b2);
		
		a1.printBooksOwned();
		a1.printBooksPublished();
		
		r1.printBooksOwned();
		System.out.println(a1 + " Owns " + a1.getEarnings() + " Euro");
	}

}
