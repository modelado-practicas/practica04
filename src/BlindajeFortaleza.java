
public class BlindajeFortaleza extends Blindaje{

	@Override
	public String nombre() {
		return "Blindaje reforzado";
	}

	@Override
	public String descripcion() {
		return "Blindaje resistente a multiples ataques "
				+ "antes de necesitar reparacion alguna.";
	}

	@Override
	public double precio() {
		return 371.2;
	}

	@Override
	public double defensa() {
		return 84.6;
	}

	@Override
	public double peso() {
		return 32.1;
	}

}
