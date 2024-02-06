package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class NewsFeed {

	 private ArrayList<NewsFeed> newsfeed;
	 private String title;
	 private String content;
	 private String name;
	 private LocalDateTime date;
	 private String like;
	 private String comment;
	 
	 public NewsFeed() {
		 
	 }
	 
	public NewsFeed(ArrayList<NewsFeed> newsfeed, String title, String content, String name,
			LocalDateTime date, String like, String comment) {
		this.newsfeed = newsfeed;
		this.title = title;
		this.content = content;
		this.name = name;
		this.date = date;
		this.like = like;
		this.comment = comment;
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
	
	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime Date) {
		this.date = Date;
	}
	

	public String getlike() {
		return like;
	}

	public void setDate(String like) {
		this.like = like;
	}
	
	public String getcomment() {
		return comment;
	}

	public void setcomment(String comment) {
		this.comment = comment;
	}
	 
}
