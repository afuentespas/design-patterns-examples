package afuentes.desing.patterns.creational.abstractfactory;

public class IbanezBass implements IBass {

	public Manufacturer getManufacturer() {
		return Manufacturer.IBANEZ;
	}

	public InstrumentType getInstrumentType() {
		return InstrumentType.BASS;
	}

}
