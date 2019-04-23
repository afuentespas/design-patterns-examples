package afuentes.desing.patterns.creational.builder.v1;

import java.util.ArrayList;
import java.util.List;

public class PostBuilder {

	private Post post;
	
	public PostBuilder(int id, String author) {
		this.post = new Post(id, author);
	}
	
	public PostBuilder id(int id) {
		this.post.setId(id);
		return this;
	}
	
	public PostBuilder author(String author) {
		this.post.setAuthor(author);
		return this;
	}
	
	public PostBuilder title(String title) {
		this.post.setTitle(title);
		return this;
	}
	
	public PostBuilder content(String content) {
		this.post.setContent(content);
		return this;
	}
	
	public PostBuilder tag(String tag) {
		List<String> tags = this.post.getTags(); 
		if( tags == null) {
			tags = new ArrayList<>();
		}
		tags.add(tag);
		this.post.setTags(tags);
		return this;
	}
	
	public Post build() {
		return this.post;
	}
}
