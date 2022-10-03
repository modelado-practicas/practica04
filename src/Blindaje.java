
public abstract class Blindaje implements Pieza{

	@Override
	public abstract double precio();

	@Override
	public double ataque() {
		return 0;
	}

	@Override
	public abstract double defensa();

	@Override
	public double velocidad() {
		return 0;
	}

	@Override
	public abstract double peso();

}
