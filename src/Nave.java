public class Nave {

	private Armas armas;

	private Blindaje blindaje;

	private Cabina cabina;

	private Propulsion propulsion;

	
		
	public void desgloseNave() {
		System.out.println(desglosePieza(cabina) + desglosePieza(blindaje) 
			+ desglosePieza(propulsion) + desglosePieza(armas));
	}
	
	
	public double precioFinal(){
	 	return armas.precio() + blindaje.precio() 
	 	+ cabina.precio() + propulsion.precio();
	}
	   
	 
	public double ataqueFinal(){
		return armas.ataque() + blindaje.ataque() 
	 	+ cabina.ataque() + propulsion.ataque();
	}
	
	 
	public double defensaFinal(){
	 	return armas.defensa() + blindaje.defensa() 
	 	+ cabina.defensa() + propulsion.defensa();
	}

	 
	public double velocidadFinal(){
		return armas.velocidad() + blindaje.velocidad() 
	 	+ cabina.velocidad() + propulsion.velocidad();
	}
	 
	public double pesoFinal(){
		return armas.peso() + blindaje.peso() 
	 	+ cabina.peso() + propulsion.peso();
	}

	private String desglosePieza(Pieza piece) {
		return "Pieza: "+ piece.nombre() + " || Precio: " + piece.precio() 
		+ "\n" + piece.descripcion() + "\n"; 

	}

}
