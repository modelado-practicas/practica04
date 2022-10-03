
public class Intercontinental extends Propulsion{

	@Override
	public String nombre() {
		return "Propulsion intercontinental";
	}

	@Override
	public String descripcion() {
		return "Con este sistema de propulsion podras hacer "
				+ "viajes entre los continentes "
				+ "del planeta donde te encuentres con "
				+ "gran facilidad.";
	}

	@Override
	public double precio() {
		return 5;
	}

	@Override
	public double velocidad() {
		return 0.000000002;
	}

}
