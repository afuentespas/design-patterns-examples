package afuentes.desing.patterns.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		InstrumentFactory instrumentFactory = new GuitarFactory();
		instrumentFactory.createInstrument();
		System.out.println("--------------------------------");
		instrumentFactory = new BassFactory();
		instrumentFactory.createInstrument();
	}

}
