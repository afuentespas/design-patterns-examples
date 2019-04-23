package afuentes.desing.patterns.structural.composite;

public class Number extends Expression {
	
	private int number;

	public Number(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.number);
	}

	@Override
	public int calculate() {
		return this.number;
	}

}
