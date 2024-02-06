package socialNetwork;

import java.time.LocalDateTime;

public class Photo extends NewsFeed{
	
	private String name;
	private String dataname;
	private String foto;
	private LocalDateTime Date;
	private String like;
	private String comment;
	
	public Photo(){
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataname() {
		return dataname;
	}
	public void setDataname(String dataname) {
		this.dataname = dataname;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public LocalDateTime getDate() {
		return Date;
	}
	public void setTime(LocalDateTime Date) {
		this.Date = Date;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
