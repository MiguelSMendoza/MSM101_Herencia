package com.mtw.arrakis.abstractas;

public abstract class Guerrero implements SerVivo {
	/*
	 * Variables del objeto, una cadena de caracteres dónde se almacenará la
	 * raza del guerrero, y un entero, que es el entero aleatorio con el que han
	 * de acertar para matar a este Guerrero así como su estado vital
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
	 * método generablanco
	 */
	public Guerrero(String raza) {
		blanco = generaBlanco();
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	/**
	 * Si el guerrero está vivo (la variable vivo la hereda de ser vivo vale
	 * true) el guerrero “dispara” mediante este método un número aleatorio
	 * entre 0 y 10, matando con él a todo objetivo con blanco igual al valor
	 * del disparo. Si está muerto dispara un 100, que nunca matará a nadie; de
	 * esa forma modelamos que un muerto nunca mata a nadie.
	 */
	public int dispara() {
		if (vivo) {
			int disparo = ((int) (Math.random() * 10));
			System.out.println(raza + " Dispara con nº " + disparo);
			return disparo;
		} else
			return 100;

	}

	public int getBlanco() {
		return blanco;
	}

	/**
	 * Método privado, que por lo tanto sólo será accesible por el propio
	 * objeto, que emplea para iniciar la variable blanco
	 */
	private int generaBlanco() {
		return ((int) (Math.random() * 10));
	}

}
