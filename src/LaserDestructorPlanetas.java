
public class LaserDestructorPlanetas extends Armas{

	@Override
	public String nombre() {
		return "Laser simple";
	}

	@Override
	public String descripcion() {
		return "Laser con el suficiente poder para rostizar todos los pollos "
				+ " de un  planeta al instante y destruir el planeta con los pollos.";
	}

	@Override
	public double precio() {
		return 479.9;
	}

	@Override
	public double ataque() {
		return 105.4;
	}

	@Override
	public double peso() {
		return 12.3;
	}

}
