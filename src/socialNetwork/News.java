package socialNetwork;

import java.time.LocalDate;

public class News {
	
	private String name;
	private String text;
	private LocalDate Date;
	private String readers;
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
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public String getReaders() {
		return readers;
	}
	public void setReaders(String readers) {
		this.readers = readers;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
