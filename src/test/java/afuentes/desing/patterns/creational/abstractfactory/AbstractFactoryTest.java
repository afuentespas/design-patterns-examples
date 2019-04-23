package afuentes.desing.patterns.creational.abstractfactory;

import static org.junit.Assert.*;
import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void buildFenderGuitar() {
		InstrumentsFactory instrumentFactory = new FenderFactory();
		IGuitar guitar = instrumentFactory.createGuitar();
		assertEquals(Manufacturer.FENDER, guitar.getManufacturer());
		assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
	}
	
	@Test
	public void buildFenderBass() {
		InstrumentsFactory instrumentFactory = new FenderFactory();
		IBass bass = instrumentFactory.createBass();
		assertEquals(Manufacturer.FENDER, bass.getManufacturer());
		assertEquals(InstrumentType.BASS, bass.getInstrumentType());
	}
	
	@Test
	public void buildIbanezGuitar() {
		InstrumentsFactory instrumentFactory = new IbanezFactory();
		IGuitar guitar = instrumentFactory.createGuitar();
		assertEquals(Manufacturer.IBANEZ, guitar.getManufacturer());
		assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
	}
	
	@Test
	public void buildIbanezBass() {
		InstrumentsFactory instrumentFactory = new IbanezFactory();
		IBass bass = instrumentFactory.createBass();
		assertEquals(Manufacturer.IBANEZ, bass.getManufacturer());
		assertEquals(InstrumentType.BASS, bass.getInstrumentType());
	}

}
