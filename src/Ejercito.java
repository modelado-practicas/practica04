
public class Ejercito extends Cabina{

	@Override
	public String nombre() {
		return "Cabina para un ejercito.";
	}

	@Override
	public String descripcion() {
		return "Cabina con espacio suficiente para transportar un "
				+ "ejercito con todas las comodidades.";
	}

	@Override
	public double precio() {
		return 426.1;
	}

	@Override
	public double peso() {
		return 17094.1;
	}
}
