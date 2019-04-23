package afuentes.desing.patterns.creational.abstractfactory;

public class IbanezFactory implements InstrumentsFactory{

	public IGuitar createGuitar() {
		return new IbanezGuitar();
	}

	public IBass createBass() {
		return new IbanezBass();
	}

}
