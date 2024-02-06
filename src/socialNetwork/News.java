package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class News extends NewsFeed {
	
	
	private String text;
	
	
	public News() {
		super();
	}
	
	
	public News(ArrayList<NewsFeed> newsfeed, String title, String content, String text,String name, LocalDateTime date,
			String like, String comment) {
		super(newsfeed, title, content,name, date, like, comment);
	
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	

}
