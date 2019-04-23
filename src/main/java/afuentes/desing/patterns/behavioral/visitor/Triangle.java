package afuentes.desing.patterns.behavioral.visitor;

public class Triangle extends Figure {
	
	private static final String FIGURE_TYPE = "Triangle";

	private double base;
	
	private double height;
	
	public Triangle(double base, double height) {
		super(FIGURE_TYPE);	
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visitTriangle(this);
	}

}
