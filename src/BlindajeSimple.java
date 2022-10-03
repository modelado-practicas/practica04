
public class BlindajeSimple extends Blindaje{

	@Override
	public String nombre() {
		return "Blindaje simple";
	}

	@Override
	public String descripcion() {
		return "Blindaje basico para que tu nave no se "
				+ "destruya en mil pedazos si chocas "
				+ "con una roca a altas velocidades.";
	}

	@Override
	public double precio() {
		return 12.4;
	}

	@Override
	public double defensa() {
		return 1.5;
	}

	@Override
	public double peso() {
		return 5.5;
	}

}
