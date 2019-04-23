package afuentes.desing.patterns.creational.abstractfactory;

public class FenderFactory implements InstrumentsFactory{

	public IGuitar createGuitar() {
		return new FenderGuitar();
	}

	public IBass createBass() {
		return new FenderBass();
	}

}
