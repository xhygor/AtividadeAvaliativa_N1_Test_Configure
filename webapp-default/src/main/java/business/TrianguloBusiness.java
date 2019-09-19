package business;

import model.Triangulo;

public class TrianguloBusiness {

	public String verificarTipoTriangulo(Triangulo triangulo) throws Exception {
		if (isTrianguloValido(triangulo)) {
			if (isTrianguloEquilatero(triangulo)) {
				return "O triângulo é classificado como Equilatero";
			} else if (isTrianguloEscaleno(triangulo)) {
				return "O triângulo é classificado como Escaleno";
			} else if (isTrianguloIsosceles(triangulo)) {
				return "O triângulo é classificado como Isosceles";
			}
		}
		throw new Exception("Não é um triângulo válido!");
	}

	public boolean isTrianguloValido(Triangulo triangulo) throws Exception {
		if (triangulo.getLadoA() <= 0 || triangulo.getLadoB() <= 0 || triangulo.getLadoC() <= 0) {
			return false;
		}
		if ((Math.abs(triangulo.getLadoB() - triangulo.getLadoC()) < triangulo.getLadoA())
				&& (triangulo.getLadoA() < (triangulo.getLadoB() + triangulo.getLadoC()))) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloEquilatero(Triangulo triangulo) throws Exception {
		if (!this.isTrianguloValido(triangulo)) {
			throw new Exception("Não é um triangulo válido.");
		}
		if ((triangulo.getLadoA() == triangulo.getLadoB()) && (triangulo.getLadoB() == triangulo.getLadoC())) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloEscaleno(Triangulo triangulo) throws Exception {
		if (!this.isTrianguloValido(triangulo)) {
			throw new Exception("Não é um triangulo válido.");
		}
		if ((triangulo.getLadoA() != triangulo.getLadoB()) && (triangulo.getLadoB() != triangulo.getLadoC())
				&& (triangulo.getLadoA() != triangulo.getLadoC())) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloIsosceles(Triangulo triangulo) throws Exception {
		if (!this.isTrianguloValido(triangulo)) {
			throw new Exception("Não é um triangulo válido.");
		}
		if (!isTrianguloEquilatero(triangulo) && !isTrianguloEscaleno(triangulo)) {
			return true;
		}
		return false;
	}
}
