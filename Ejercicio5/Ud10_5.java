import javax.swing.JOptionPane;

import objetos.Password;

public class Ud10_5 {

	public static void main(String[] args) {
		
		Password contraseņas[] = generarArray();
		Boolean sonFuertes[] = sonFuertes(contraseņas);
		mostrar(contraseņas, sonFuertes);
		
	}
	
	// Metodo que genera una array de contraseņas
	public static Password[] generarArray() {
		
		Password contraseņas[] = null;
		int longitud = 0;
		
		try {
			contraseņas = new Password[Integer.parseInt(JOptionPane.showInputDialog("Cuantas contraseņas desea almacenar"))];
			longitud = Integer.parseInt(JOptionPane.showInputDialog("Cual sera la longitud de las contraseņas"));
			
			for (int i = 0; i < contraseņas.length; i++) {
				
				Password aux = new Password(longitud);
				contraseņas[i] = aux;
				
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor incorrecto");;
			generarArray();
		}
		return contraseņas;
	}
	
	// Metodo que genera una array de booleanos haciendo referencia a contraseņas
	public static Boolean[] sonFuertes(Password[] contraseņas) {
		
		Boolean sonFuertes[] = new Boolean[contraseņas.length];
		
		for (int i = 0; i < contraseņas.length; i++) {
			if(contraseņas[i].esFuerte()) {
				sonFuertes[i] = true;
			} else {
				sonFuertes[i] = false;
			}
		}
		return sonFuertes;
	}
	
	// Metodo para mostrar por pantalla los dos arrays en conjunto
	public static void mostrar(Password[] contraseņas, Boolean[] sonFuertes) {
		
		for (int i = 0; i < contraseņas.length; i++) {
			System.out.println(contraseņas[i].toString() + " " + sonFuertes[i]);
		}
		
	}

}
