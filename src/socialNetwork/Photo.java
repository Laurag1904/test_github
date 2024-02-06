package socialNetwork;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Photo extends NewsFeed{
	
	
	private String dataname;
	private String foto;
	
	
	public Photo(){
		super();
	}
	
	
	public Photo(ArrayList<NewsFeed> newsfeed, String title, String content,String name, String dataname,
			String foto, LocalDateTime date, String like, String comment) {
		super(title, content, name, date, like, comment);
		this.dataname = dataname;
		this.foto = foto;
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
	
}
