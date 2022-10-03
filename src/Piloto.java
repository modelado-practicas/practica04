
public class Piloto extends Cabina{

	@Override
	public String nombre() {
		return "Cabina para piloto";
	}

	@Override
	public String descripcion() {
		return "Cabina con espacio unicamente para el piloto";
	}

	@Override
	public double precio() {
		return 2.3;
	}

	@Override
	public double peso() {
		return 40.8;
	}

}
