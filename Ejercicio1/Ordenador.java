package Ejericio1;
import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Ordenador {
	private int nAleatorio;
	private int cont;
	private boolean salir;

	// constructor al que asignamos los valores
	public Ordenador() {
		this.nAleatorio = (int) (Math.random() * 500 + 1); // generamos numero
		this.cont = 0; // iniciamos a 0
		this.salir = false; // iniciamos a false
	}

	// metodo para comprovar el numero introducido es igual al aleatorio
	public void adivinarNumero() {
		while (salir == false) { // Si salir es false sigue el bucle
			try {
				String pregunta = JOptionPane.showInputDialog("introduce un numero entre 1 y 500");
				int n = Integer.parseInt(pregunta);// preguntamos numero

				if (n == nAleatorio) {// si es igual muestra el contador y el mensaje
					System.out.println("Has adivinado el numero!!!");
					System.out.println("Has fallado: " + cont + " veces");
					salir = true;// cambiamos salir a true y saldra del bucle
				} else if (n > nAleatorio) {
					System.out.println("El n aleatorio es mas pequeño");
					cont++;
				} else if (n < nAleatorio) {
					System.out.println("El n aleatorio es mas grande");
					cont++;
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor introducido no es un numero");
				cont++;
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es un numero");
				cont++;
			}
		}
	}

	// gest y sets
	public int getnAleatorio() {
		return nAleatorio;
	}

	public void setnAleatorio(int nAleatorio) {
		this.nAleatorio = nAleatorio;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public boolean isSalir() {
		return salir;
	}

	public void setSalir(boolean salir) {
		this.salir = salir;
	}

}
