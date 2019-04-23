package afuentes.desing.patterns.behavioral.visitor;

public class Square extends Figure {
	
	private static final String FIGURE_TYPE = "Square";
	
	private double side;

	public Square(double side) {
		super(FIGURE_TYPE);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public void accept(FigureVisitor figureVisitor) {
		figureVisitor.visitSquare(this);		
	}

}
