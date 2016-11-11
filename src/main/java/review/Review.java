package review;

import java.util.Date;

public class Review {
	
	private long id;
	private String title;
	private String author;
	private String content;
	private Date date;
	
	
	public Review(long id, String title, String author, String content, Date date) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.date = date;
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public String getContent() {
		return content;
	}


	public Date getDate() {
		return date;
	}

}
