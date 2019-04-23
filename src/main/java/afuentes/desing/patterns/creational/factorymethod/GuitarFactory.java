package afuentes.desing.patterns.creational.factorymethod;

public class GuitarFactory extends InstrumentFactory {

	@Override
	protected Instrument create() {
		return new Guitar();		
	}

}
