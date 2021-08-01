package Ejericio3;

import java.util.Random;

public class ParImpar {
	private int numeroRandom;

	public void comprovarPar() {
		// generamos el numero
		Random rand = new Random();
		numeroRandom = rand.nextInt(999) + 1;
		System.out.println("El numero aleatorio es: " + numeroRandom);// mostramos el numero

		try {
			// comprovamos si es par o impar
			if (numeroRandom % 2 != 0) {
				throw new Error(123);// llamamos al error
			} else {
				throw new Error(1234);
			}
		} catch (Error e) {
			System.out.println(e.getMessage());
		}

	}

}
