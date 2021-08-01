package Ejericio3;

public class Error extends Exception {

	private static final long serialVersionUID = 1L;
	private int codigoExcepcion;

	// constructor
	public Error(int codigoError) {
		this.codigoExcepcion = codigoError;
	}

	// Metodo para mostrar el error
	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoExcepcion) {
		case 123:
			mensaje = "El numero NO es par :(";
			break;
		case 1234:
			mensaje = "El numero es par :)";
			break;
		default:
			mensaje = "El numero es par :)";
			break;
		}

		return mensaje;
	}

}
