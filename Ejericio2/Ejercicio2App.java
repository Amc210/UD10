package Ejericio2;

import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		//preguntamos un numero
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

		try {
			//comprovamos si es igual a 4 
			if(n != 4) {
				throw new MiExcepcion(666); //si no es llamamos a la excepcion qu ehemos creado
			}else {
				System.out.println("Bieeen es 4!!!");
			}
		}catch(MiExcepcion e) {
			System.out.println(e.getMessage());
		}
	}

}
