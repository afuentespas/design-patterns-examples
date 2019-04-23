package afuentes.desing.patterns.behavioral.visitor;

public interface FigureVisitor {

	public void visitTriangle(Triangle triangle);
	
	public void visitSquare(Square square);
	
}
