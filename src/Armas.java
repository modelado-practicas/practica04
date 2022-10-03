
public abstract class Armas implements Pieza{

	@Override
	public abstract double precio();

	@Override
	public abstract double ataque();

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
