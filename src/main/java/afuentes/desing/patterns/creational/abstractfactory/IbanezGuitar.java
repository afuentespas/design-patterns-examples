package afuentes.desing.patterns.creational.abstractfactory;

public class IbanezGuitar implements IGuitar {

	public Manufacturer getManufacturer() {
		return Manufacturer.IBANEZ;
	}

	public InstrumentType getInstrumentType() {
		return InstrumentType.GUITAR;
	}

}
