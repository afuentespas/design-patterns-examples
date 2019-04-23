package afuentes.desing.patterns.creational.builder.v1;

import java.util.List;

public class Post {

	private int id;
	
	private String author;
	
	private String title;
	
	private String content;
	
	private List<String> tags;
	
	public Post(int id, String author) {
		this.id = id;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
}
