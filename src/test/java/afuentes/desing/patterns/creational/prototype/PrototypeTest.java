package afuentes.desing.patterns.creational.prototype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PrototypeTest {

	private Dog dog;
	
	private Cat cat;
	
	@Before
	public void before() {
		this.dog = new Dog("Pluto");
		this.cat = new Cat("Misifu");
	}
	
	@Test
	public void testCat() throws CloneNotSupportedException {
		AnimalPrototype animal = (AnimalPrototype) this.cat.clone();
		assertNotEquals(this.cat, animal);
		assertEquals("Misifu", this.cat.getName());
		assertEquals(this.cat.getName(), animal.getName());
	}
	
	@Test
	public void testDog() throws CloneNotSupportedException {
		AnimalPrototype animal = (AnimalPrototype) this.dog.clone();
		assertNotEquals(this.dog, animal);
		assertEquals("Pluto", this.dog.getName());
		assertEquals(this.dog.getName(), animal.getName());
	}

}
