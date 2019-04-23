package afuentes.desing.patterns.creational.prototype;

public abstract class AnimalPrototype implements Cloneable {
	
	protected String name;

	public AnimalPrototype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
