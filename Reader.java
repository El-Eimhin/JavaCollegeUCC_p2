/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Reader implements person {
	private String fn;
	private String sn;
	private List<Books> booksOwned = new ArrayList<Books>();
	private Double earnings = 0.0 ;
	
	public Reader(String fn, String sn) {
		this.fn = fn;
		this.sn = sn;
		
	}
	@Override
	public void printBooksOwned() {
		String outstr = "";
		for (Books i : booksOwned) {
			outstr = outstr + i.getTitle().getTitle() + " ";
			if (i.getTitle().getSubTitle() != null) {
				outstr = outstr + i.getTitle().getSubTitle() + " ";
			}
			}
		
		System.out.println(this.fn +" " + this.sn + " owns: " + outstr);

	}

	@Override
	public void buy(Books b) {
		
		if (this.earnings > b.getPrice()) {
			this.booksOwned.add(b);
			this.charge(b.getPrice());
			b.getAuthor().receive(b.getPrice()*.1);
		}
		else {
			System.out.println("not enough funds to purchase " + b.getTitle().getTitle());
		}
			

	}

	@Override
	public void receive(double x) {
		this.earnings += x;
	}
	
	public String getName() {
		return fn+" "+sn;
	}
	
	@Override
	public double getEarnings() {
		return this.earnings;
	}
	@Override
	public void charge(double x) {
		this.earnings -= x;
		
	}
}
