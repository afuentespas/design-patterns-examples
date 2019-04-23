package afuentes.desing.patterns.behavioral.visitor;

public abstract class Figure {

	protected String name;
	
	public Figure(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void accept(FigureVisitor figureVisitor);
	
}
