/**
 * 
 * @author Eimhin Ward (ID 119411722)
 *
 */
public class Title {
	private String title;
	private String subTitle;
	
	public Title(String title, String subtitle) {
		this.title = title;
		this.subTitle = subtitle;
		
	}
	public Title(String title) {
		this.title = title;
	}
	
	String getTitle() {
		return this.title;
	}
	
	String getSubTitle() {
		return this.subTitle;
	}
	
}
