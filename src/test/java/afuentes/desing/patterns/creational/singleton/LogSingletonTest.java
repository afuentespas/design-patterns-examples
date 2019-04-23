package afuentes.desing.patterns.creational.singleton;

import static org.junit.Assert.*;
import org.junit.Test;

public class LogSingletonTest {

	@Test
	public void lazyLogIsNotNull() {
		assertNotNull(LazyLogSingleton.getInstance());
	}
	
	@Test
	public void eagerLogIsNotNull() {
		assertNotNull(EagerLogSingleton.getInstance());
	}
	
	@Test
	public void lazyLogIsSame() {
		assertEquals(LazyLogSingleton.getInstance(), LazyLogSingleton.getInstance());
	}
	
	@Test
	public void eagerLogIsSame() {
		assertEquals(EagerLogSingleton.getInstance(), EagerLogSingleton.getInstance());
	}

}
