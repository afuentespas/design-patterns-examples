package afuentes.desing.patterns.creational.abstractfactory;

public class FenderBass implements IBass{

	public Manufacturer getManufacturer() {
		return Manufacturer.FENDER;
	}

	public InstrumentType getInstrumentType() {
		return InstrumentType.BASS;
	}

}
