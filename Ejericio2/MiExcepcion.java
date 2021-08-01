package Ejericio2;

public class MiExcepcion extends Exception {
	private static final long serialVersionUID = 1L;
	private int codigoExcepcion;

	// constructor
	public MiExcepcion(int codigoError) {
		super();
		this.codigoExcepcion = codigoError;
	}

	// Metodo para mostrar el error
	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoExcepcion) {
		case 666:
			mensaje = "Excepcion 666: El numero NO es 4 :(";
			break;
		default:
			mensaje = "No hay excepcion";
			break;
		}

		return mensaje;
	}

	// gets y sets
	public int getCodigoExcepcion() {
		return codigoExcepcion;
	}

	public void setCodigoExcepcion(int codigoExcepcion) {
		this.codigoExcepcion = codigoExcepcion;
	}

}
