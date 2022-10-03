
public abstract class Cabina implements Pieza{

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
	public double velocidad() {
		return 0;
	}

	@Override
	public abstract double peso();

}
