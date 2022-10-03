
public class Interplanetario extends Propulsion{

	@Override
	public String nombre() {
		return "Propulsion interplanetaria";
	}

	@Override
	public String descripcion() {
		return "Con este sistema de propulsion podras hacer "
				+ "viajes entre los planetas "
				+ "de la galaxia donde te encuentres con "
				+ "gran facilidad.";
	}

	@Override
	public double precio() {
		return 23.7;
	}

	@Override
	public double velocidad() {
		return 1041.67;
	}

}
