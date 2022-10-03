
public class LaserSimple extends Armas{

	@Override
	public String nombre() {
		return "Laser simple";
	}

	@Override
	public String descripcion() {
		return "Laser con el suficiente poder para rostizar un pollo "
				+ "al instante (tambien puede cortar rocas pequenas).";
	}

	@Override
	public double precio() {
		return 13.2;
	}

	@Override
	public double ataque() {
		return 4.2;
	}

	@Override
	public double peso() {
		return 3;
	}

}
