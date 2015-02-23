package com.mtw.guerra;

public class Batalla {

	private Nave NaveFremen, NaveSardaukar;

	public Batalla() {
		NaveFremen = new Nave(Nave.NAVE_FREMEN);
		NaveSardaukar = new Nave(Nave.NAVE_SARDAUKAR);
		empiezaGuerra();
	}

	public void empiezaGuerra() {
		do {
			for (int i = 0; i < 10; i++) {
				NaveSardaukar.recibeDisparo(NaveFremen.generaDisparo(i));
				NaveFremen.recibeDisparo(NaveSardaukar.generaDisparo(i));
			}
		} while (NaveFremen.cuantosQuedan() > 0
				&& NaveSardaukar.cuantosQuedan() > 0);
		if (NaveFremen.cuantosQuedan() > 0) {
			System.out.println("¡¡¡¡¡GANARON LOS FREMEN!!!!!");
		} else if (NaveSardaukar.cuantosQuedan() > 0) {
			System.out.println("GANARON LOS SARDAUKAR");
		}
	}

	public static void main(String[] args) {
		new Batalla();
	}

}
