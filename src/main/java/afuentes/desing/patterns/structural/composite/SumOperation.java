package afuentes.desing.patterns.structural.composite;

public class SumOperation extends ExpressionComposite {

	public SumOperation(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int calculate() {
		return this.expression1.calculate() + this.expression2.calculate();
	}
	
	@Override
	public String getOperator() {
		return "+";
	}

}
