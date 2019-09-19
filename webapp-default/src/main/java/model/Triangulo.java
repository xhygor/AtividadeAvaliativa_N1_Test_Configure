package model;

import java.io.Serializable;

public class Triangulo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ladoA;
	private int ladoB;
	private int ladoC;

	public Triangulo() {
		super();
	}

	public Triangulo(int ladoA, int ladoB, int ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
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
