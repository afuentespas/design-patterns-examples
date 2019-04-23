package afuentes.desing.patterns.creational.builder.v1;

import static org.junit.Assert.*;
import org.junit.Test;


public class PostBuilderTest {
	
	@Test
	public void testPost() {
		Post post = new PostBuilder(1, "AFuentes")
				.id(2)
				.title("Builder")
				.content("Builder Pattern Test")
				.tag("Design Patter")
				.tag("Java")
				.build();
		assertEquals(2, post.getId());
		assertEquals("AFuentes", post.getAuthor());
		assertEquals("Builder", post.getTitle());
		assertEquals("Builder Pattern Test", post.getContent());
		assertEquals("Design Patter", post.getTags().get(0));
		assertEquals("Java", post.getTags().get(1));
	}
	
	@Test
	public void simpleTest() {
		Post post = new PostBuilder(1, "AFuentes").build();
		assertEquals(1, post.getId());
		assertEquals("AFuentes", post.getAuthor());
	}

}
