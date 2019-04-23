package afuentes.desing.patterns.behavioral.visitor;

public class AreaVisitor implements FigureVisitor {

	private double area;
	
	@Override
	public void visitTriangle(Triangle triangle) {
		this.area = triangle.getBase() * triangle.getHeight() * 0.5;		
	}
	
	@Override
	public void visitSquare(Square square) {
		this.area = square.getSide() * 4;
	}

	public double getArea() {
		return area;
	}
	
}
