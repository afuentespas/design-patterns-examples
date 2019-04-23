package afuentes.desing.patterns.behavioral.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
	
	private Figure triangle;
	
	private Figure square;

	@Before
	public void before() {
		this.triangle = new Triangle(3, 4);
		this.square = new Square(4d);
	}
	
	@Test
	public void testTriangleArea() {
		AreaVisitor areaVisitor = new AreaVisitor();
		this.triangle.accept(areaVisitor);
		assertEquals(6.0, areaVisitor.getArea(), 0);
	}
	
	@Test
	public void testSquareArea() {
		AreaVisitor areaVisitor = new AreaVisitor();
		this.square.accept(areaVisitor);
		assertEquals(16.0, areaVisitor.getArea(), 0);
	}
	
	@Test
	public void testTrianglePerimeter() {
		PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
		this.triangle.accept(perimeterVisitor);
		assertEquals(12.0, perimeterVisitor.getPerimeter(), 0);
	}
	
	@Test
	public void testSquarePerimeter() {
		PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
		this.square.accept(perimeterVisitor);
		assertEquals(16.0, perimeterVisitor.getPerimeter(), 0);
	}
	
}
