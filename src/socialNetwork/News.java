package socialNetwork;

import java.time.LocalDateTime;

public class News {
	
	private String name;
	private String text;
	private LocalDateTime Date;
	private String like;
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getDate() {
		return Date;
	}
	public void setDate(LocalDateTime date) {
		Date = date;
	}
	public String getlike() {
		return like;
	}
	public void setlike(String like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
