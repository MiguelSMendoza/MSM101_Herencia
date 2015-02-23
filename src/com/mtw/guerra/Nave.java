package com.mtw.guerra;

import com.mtw.arrakis.abstractas.*;
import com.mw.guerreros.*;

public class Nave {

	private Guerrero[] tripulacion = new Guerrero[10];
	private int somos;
	public final static int NAVE_FREMEN = 0;
	public final static int NAVE_SARDAUKAR = 1;

	public Nave(int somos) {
		this.somos = somos;
		for (int i = 0; i < 10; i++) {
			switch (somos) {
			case NAVE_FREMEN:
				tripulacion[i] = new Fremen();
				break;
			case NAVE_SARDAUKAR:
				tripulacion[i] = new Sardaukar();
				break;
			}
		}
		String str = new String();
		str = (somos == NAVE_FREMEN) ? "Creada nave Fremen"
				: "Creada nave Sardaukar";
		System.out.println(str);
	}

	public void recibeDisparo(int i) {
		for (int j = 0; j < 10; j++) {
			if (somos == NAVE_FREMEN) {
				((Fremen) (tripulacion[j])).recibeDisparo(i);
			} else {
				((Sardaukar) (tripulacion[j])).recibeDisparo(i);
			}
		}
	}

	public int generaDisparo(int i) {
		return tripulacion[i].dispara();
	}

	public int cuantosQuedan() {
		if (somos == NAVE_FREMEN) {
			return ((Fremen) (tripulacion[1])).getTotal();
		} else {
			return ((Sardaukar) (tripulacion[1])).getTotal();
		}
	}

}