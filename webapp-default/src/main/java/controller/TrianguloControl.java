package controller;

import business.TrianguloBusiness;
import model.Triangulo;

public class TrianguloControl {

	private Triangulo triangulo;
	private TrianguloBusiness businessTriangulo;
	private int ladoA = 0;
	private int ladoB = 0;
	private int ladoC = 0;

	public TrianguloControl() {
		super();
		triangulo = new Triangulo();
		businessTriangulo = new TrianguloBusiness();
	}

	public void contruirTriangulo() {
		try {
			triangulo = new Triangulo(ladoA, ladoB, ladoC);
			businessTriangulo.verificarTipoTriangulo(triangulo);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Triangulo getTriangulo() {
		return triangulo;
	}

	public void setTriangulo(Triangulo triangulo) {
		this.triangulo = triangulo;
	}

	public TrianguloBusiness getBusinessTriangulo() {
		return businessTriangulo;
	}

	public void setBusinessTriangulo(TrianguloBusiness businessTriangulo) {
		this.businessTriangulo = businessTriangulo;
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
}
