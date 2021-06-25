/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */
public class Hardback implements hasPageCount, hasPrice, Books {

	
	private Author author;
	private Title t1;
	private int pageCount;
	private Double price = 12.0;
	
	
	Hardback(Title t1, Author author, int pageCount) {
		this.t1 = t1;
		this.author = author;
		this.pageCount = pageCount;
		author.getbooksPublished().add(this);
	}
	
	
	@Override
	public Author getAuthor() {
		// TODO Auto-generated method stub
		return this.author;
	}

	@Override
	public Title getTitle() {
		// TODO Auto-generated method stub
		return this.t1;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int getPageCount() {
		// TODO Auto-generated method stub
		return this.pageCount;
	}

}
