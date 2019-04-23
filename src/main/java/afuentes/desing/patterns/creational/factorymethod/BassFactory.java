package afuentes.desing.patterns.creational.factorymethod;

public class BassFactory extends InstrumentFactory {

	@Override
	protected Instrument create() {
		return new Bass();
	}

}
