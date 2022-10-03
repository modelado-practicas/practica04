
public class TripulacionPequena extends Cabina{

	@Override
	public String nombre() {
		return "Cabina para tripulacion pequena";
	}

	@Override
	public String descripcion() {
		return "Cabina con espacio suficiente para albergar "
				+ "entre 50 y 180 aeronautas.";
	}

	@Override
	public double precio() {
		return 63.4;
	}

	@Override
	public double peso() {
		return 333.4;
	}
}
