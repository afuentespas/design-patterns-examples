package afuentes.desing.patterns.creational.abstractfactory;

public class FenderGuitar implements IGuitar{

	public Manufacturer getManufacturer() {
		return Manufacturer.FENDER;
	}

	public InstrumentType getInstrumentType() {
		return InstrumentType.GUITAR;
	}

}
