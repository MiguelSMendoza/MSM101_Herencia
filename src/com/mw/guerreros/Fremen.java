package com.mw.guerreros;

import com.mtw.arrakis.abstractas.Guerrero;

public class Fremen extends Guerrero {

	private static int total = 0;
	
	public Fremen() {
		super("Fremen");
		total++;
	}

	public void recibeDisparo(int i) {
		if (vivo && blanco == i) {
			vivo = false;
			total--;
			System.out.println(this.getRaza() + " Muerto por disparo nº " + i);
		}
	}

	public int getTotal() {
		return total;
	}

}
