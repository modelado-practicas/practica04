
public class BlindajeReforzado extends Blindaje{

	@Override
	public String nombre() {
		return "Blindaje reforzado";
	}

	@Override
	public String descripcion() {
		return "Blindaje funcional para resister un par de "
				+ "impactos en un combate y poder escapar con "
				+ "vida.";
	}

	@Override
	public double precio() {
		return 43.1;
	}

	@Override
	public double defensa() {
		return 16.8;
	}

	@Override
	public double peso() {
		return 11.6;
	}

}
