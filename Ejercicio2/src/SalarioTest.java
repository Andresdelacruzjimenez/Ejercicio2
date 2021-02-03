import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalarioTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCalculaSalarioBruto() {
		
		assertEquals(1360, Salario.calculaSalarioBruto("vendedor", 2000, 8));
		
		assertEquals(1260, Salario.calculaSalarioBruto("vendedor", 1500, 3));
		assertEquals(1100, Salario.calculaSalarioBruto("vendedor", 1499.99, 0));
		
		assertEquals(1760, Salario.calculaSalarioBruto("encargado", 1250, 8));
		assertEquals(1100, Salario.calculaSalarioBruto("encargado", 1000, 0));
		assertEquals(1560, Salario.calculaSalarioBruto("encargado", 999.99, 3));
		assertEquals(1500, Salario.calculaSalarioBruto("encargado", 500, 0));
		assertEquals(1660, Salario.calculaSalarioBruto("encargado", 0, 8));
	}

	

	@Test
	void testCalculaSalarioNeto() {
		assertEquals(1640, Salario.calculaSalarioNeto(2000));
		assertEquals(1230, Salario.calculaSalarioNeto(1500));
		assertEquals(1259.9916, Salario.calculaSalarioNeto(1499.99));
		assertEquals(1050, Salario.calculaSalarioNeto(1250));
		assertEquals(840, Salario.calculaSalarioNeto(1000));
		assertEquals(999.99, Salario.calculaSalarioNeto(999.99));
		assertEquals(500, Salario.calculaSalarioNeto(500));
		assertEquals(0, Salario.calculaSalarioNeto(0));
	}

}
