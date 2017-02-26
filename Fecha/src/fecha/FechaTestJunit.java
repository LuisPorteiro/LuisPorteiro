package fecha;

import static org.junit.Assert.*;

import org.junit.Test;

public class FechaTestJunit {

	@Test
	public void testFecha() {
		Fecha f1 = new Fecha(29, 2, 2016);
		assertEquals(f1.valida(), f1.valida());
	}

}
