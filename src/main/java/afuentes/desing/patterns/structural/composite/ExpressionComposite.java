package afuentes.desing.patterns.structural.composite;

public abstract class ExpressionComposite extends Expression {

	protected Expression expression1;
	
	protected Expression expression2;
	
	public ExpressionComposite(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	public abstract String getOperator();

	@Override
	public String toString() {
		return "(" + this.expression1.toString() + this.getOperator() + this.expression2.toString() + ")";
	}

}
