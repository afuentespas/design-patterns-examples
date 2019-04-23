package afuentes.desing.patterns.behavioral.visitor;

public class PerimeterVisitor implements FigureVisitor {

	private double perimeter;
	
	@Override
	public void visitTriangle(Triangle triangle) {
		double hypotenuse = Math.sqrt(Math.pow(triangle.getBase(), 2) + Math.pow(triangle.getHeight(), 2));
		this.perimeter = hypotenuse + triangle.getBase() + triangle.getHeight();
	}

	@Override
	public void visitSquare(Square square) {
		this.perimeter = square.getSide() * 4;		
	}

	public double getPerimeter() {
		return perimeter;
	}

}
