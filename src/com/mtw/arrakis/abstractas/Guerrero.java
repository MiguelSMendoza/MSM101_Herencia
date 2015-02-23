package com.mtw.arrakis.abstractas;

public abstract class Guerrero implements SerVivo {
	/*
	 * Variables del objeto, una cadena de caracteres d�nde se almacenar� la
	 * raza del guerrero, y un entero, que es el entero aleatorio con el que han
	 * de acertar para matar a este Guerrero as� como su estado vital
	 */
	protected boolean vivo = true;
	protected int blanco;
	private final String raza;

	/**
	 * Desde aqui determinamos la forma en la que el objeto informa de su estado
	 * vital
	 */
	public boolean estaVivo() {
		return vivo;
	}

	/**
	 * Constructor. Almacena la cadena de caracteres que se le pasa en la
	 * variable raza del objeto, e inicializa la variable blanco empleando el
	 * m�todo generablanco
	 */
	public Guerrero(String raza) {
		blanco = generaBlanco();
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	/**
	 * Si el guerrero est� vivo (la variable vivo la hereda de ser vivo vale
	 * true) el guerrero �dispara� mediante este m�todo un n�mero aleatorio
	 * entre 0 y 10, matando con �l a todo objetivo con blanco igual al valor
	 * del disparo. Si est� muerto dispara un 100, que nunca matar� a nadie; de
	 * esa forma modelamos que un muerto nunca mata a nadie.
	 */
	public int dispara() {
		if (vivo) {
			int disparo = ((int) (Math.random() * 10));
			System.out.println(raza + " Dispara con n� " + disparo);
			return disparo;
		} else
			return 100;

	}

	public int getBlanco() {
		return blanco;
	}

	/**
	 * M�todo privado, que por lo tanto s�lo ser� accesible por el propio
	 * objeto, que emplea para iniciar la variable blanco
	 */
	private int generaBlanco() {
		return ((int) (Math.random() * 10));
	}

}
