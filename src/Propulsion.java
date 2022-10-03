
public abstract class Propulsion implements Pieza{


	@Override
	public abstract double precio();

	@Override
	public double ataque() {
		return 0;
	}
	
	@Override
	public double defensa() {
		return 0;
	}

	@Override
	public abstract double velocidad();

	@Override
	public double peso() {
		return 0;
	}
	

}
