
public class Intergalactico extends Propulsion{

	@Override
	public String nombre() {
		return "Propulsion intergalactica";
	}

	@Override
	public String descripcion() {
		return "Con este sistema de propulsion podras hacer "
				+ "viajes entre galaxias "
				+ "tiempos mas razonables.";
	}

	@Override
	public double precio() {
		return 888.9;
	}

	@Override
	public double velocidad() {
		return 6952164.4;
	}

}
