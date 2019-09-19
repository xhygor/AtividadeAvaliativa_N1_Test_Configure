package business;

import org.junit.Test;
import junit.framework.TestCase;
import model.Triangulo;

public class TestTrianguloBusiness extends TestCase {

	@Test
	public void testIsEscaleno1() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertTrue("Erro ao testar com lados diferentes submetido ao Escaleno",
					trianguloBusiness.isTrianguloEscaleno(new Triangulo(5, 7, 8)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIsEscaleno2() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertFalse("Erro ao testar com lados iguais submetido ao Escaleno",
					trianguloBusiness.isTrianguloEscaleno(new Triangulo(10, 10, 10)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testIsEscaleno3() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			trianguloBusiness.isTrianguloEscaleno(new Triangulo(-10, 0, 10));
			fail("Não retornou exceção");
		} catch (Exception e) {
			assertEquals("Não é um triangulo válido.", e.getMessage());
		}
	}

	@Test
	public void testIsIsosceles1() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertTrue("Erro ao testar triangulo com dois lados iguais submetido ao Isosceles",
					trianguloBusiness.isTrianguloIsosceles(new Triangulo(20, 10, 20)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIsIsosceles2() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertFalse("Erro ao testar triangulo com dois lados diferentes submetido ao Isosceles",
					trianguloBusiness.isTrianguloIsosceles(new Triangulo(10, 8, 12)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testIsIsosceles3() {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			trianguloBusiness.isTrianguloIsosceles(new Triangulo(-20, 0, 10));
			fail("Não retornou exceção");
		} catch (Exception e) {
			assertEquals("Não é um triangulo válido.", e.getMessage());
		}
	}

	@Test
	public void testIsEquilatero1() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertTrue("Erro ao testar triangulo com tres lados iguais submetido ao Equilatero",
					trianguloBusiness.isTrianguloEquilatero(new Triangulo(10, 10, 10)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIsEquilatero2() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertFalse("Erro ao testar triangulo com dois lados iguais submetido ao Equilatero",
					trianguloBusiness.isTrianguloEquilatero(new Triangulo(10, 5, 10)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = Exception.class)
	public void testIsEquilatero3() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			trianguloBusiness.isTrianguloEquilatero(new Triangulo(-10, -10, -10));
			fail("Não retornou exceção");
		} catch (Exception e) {
			assertEquals("Não é um triangulo válido.", e.getMessage());
		}
	}

	@Test
	public void testIsTrianguloValido1() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertFalse("Erro ao testar se o triangulo é valido",
					trianguloBusiness.isTrianguloValido(new Triangulo(-20, 0, 10)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIsTrianguloValido2() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertTrue("Erro ao testar se o triangulo é valido",
					trianguloBusiness.isTrianguloValido(new Triangulo(2, 3, 4)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testIsTrianguloValido3() throws Exception {
		TrianguloBusiness trianguloBusiness = new TrianguloBusiness();
		try {
			assertTrue("Erro ao testar se o triangulo é valido",
					trianguloBusiness.isTrianguloValido(new Triangulo(15, 15, 15)));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
