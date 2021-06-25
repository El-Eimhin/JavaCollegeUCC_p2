/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */

import java.util.ArrayList;
import java.util.List;

public enum Author implements person{
	JJR_Tolkien("JRR Tolkien"), 
	JD_Sallinger("JD Sallinger");
	
	private List<Books> booksOwned = new ArrayList<Books>();
	private List<Books> booksPublished = new ArrayList<Books>();
	private String name;
	private Double earnings = 0.0 ;
	
	
	Author(String name) {
		this.name = name;
		
	}

	@Override 
	public void printBooksOwned() {
		
		String outstr = "";
		for (Books i : booksOwned) {
			outstr = outstr + i.getTitle().getTitle();
			}
		
		System.out.println(this.name + " owns: " + outstr);
		
	}
	@Override 
	public void buy(Books b) {
		
		if (this.earnings > b.getPrice()) {
			this.booksOwned.add(b);
			this.charge(b.getPrice());
			b.getAuthor().receive(b.getPrice()*.01);
		}
		else {
			System.out.println("not enough funds to purchase " + b.getTitle().getTitle());
		}
			
		
		
	}
	@Override
	public void receive(double x) {
		
		this.earnings += x;
		String s = String.valueOf(x);
		
	}
	
	public void publish(Books b) {
		this.booksPublished.add(b);
		
		System.out.println(this.name + " has Published the book " + b.getTitle().getTitle());
	}

	
	public void printBooksPublished() {
		

		String outstr = "";
		for (Books i : booksPublished) {
			outstr = outstr + i.getTitle().getTitle();
			}
		
		System.out.println(this.name + " has Published: " + outstr);
		
	}
	public List<Books> getbooksPublished() {
		return this.booksPublished;
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
