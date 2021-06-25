/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */
public class AudioBook implements Books, hasPrice, hasDuration {
	private Author author;
	private Title t1;
	private Double price = 15.0;
	private double duration;
	
	
	
	AudioBook(Title t1, Author author, double duration) {
		this.t1 = t1;
		this.author = author;
		this.duration = duration;
		author.getbooksPublished().add(this);
	}
	
	@Override
	public Author getAuthor() {
		
		return this.author;
	}


	@Override
	public Title getTitle() {
		
		return this.t1;
	}

	@Override
	public Double getPrice() {
		
		return price;
	}

	@Override
	public double getDuration() {
		
		return this.duration;
	}

}
