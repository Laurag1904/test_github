package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	 private ArrayList<NewsFeed> newsfeed;
	 private String title;
	 private String content;
	 
	 public NewsFeed() {
		 
	 }
	 
	public NewsFeed(ArrayList<NewsFeed> newsfeed, String title, String content) {
		this.newsfeed = newsfeed;
		this.title = title;
		this.content = content;
	}

	public ArrayList<NewsFeed> getNewsfeed() {
		return newsfeed;
	}

	public void setNewsfeed(ArrayList<NewsFeed> newsfeed) {
		this.newsfeed = newsfeed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	

	 
	 
	 
}
