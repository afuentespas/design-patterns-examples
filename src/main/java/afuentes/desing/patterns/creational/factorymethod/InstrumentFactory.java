package afuentes.desing.patterns.creational.factorymethod;

public abstract class InstrumentFactory {
	
	public void createInstrument() {
		System.out.println("In progress...");
		this.create().numStrings();
		System.out.println("Instrument created!!!");
	}
	
	protected abstract Instrument create();
	
}
