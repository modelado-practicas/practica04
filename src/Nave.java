public class Nave {

	private Armas armas;

	private Blindaje blindaje;

	private Cabina cabina;

	private Propulsion propulsion;


	public void setArmas(Armas arma){
		armas = arma;
	}

	public void setBlindaje(Blindaje blindaje){
		this.blindaje = blindaje;
	}

	public void setCabina(Cabina cabina){
		this.cabina = cabina;
	}

	public void setPropulsion(Propulsion propulsion){
		this.propulsion = propulsion;
	}

	
		
	/**
	 * Imprime la informacion importante de cada componente
	 * de una nave
	 */
	public void desgloseNave() {
		System.out.println(desglosePieza(cabina) + desglosePieza(blindaje) 
			+ desglosePieza(propulsion) + desglosePieza(armas));
	}
	
	
	/**
	 * Retorna el precio total de la nave
	 * @return double con el precio final
	 */
	public double precioFinal(){
	 	return armas.precio() + blindaje.precio() 
	 	+ cabina.precio() + propulsion.precio();
	}
	   
	 
	/**
	 * Retorna el ataque total de la nave
	 * @return double con el ataque final
	 */
	public double ataqueFinal(){
		return armas.ataque() + blindaje.ataque() 
	 	+ cabina.ataque() + propulsion.ataque();
	}
	
	 
	/**
	 * Retorna la defensa total de la nave
	 * @return double con la defensa final
	 */
	public double defensaFinal(){
	 	return armas.defensa() + blindaje.defensa() 
	 	+ cabina.defensa() + propulsion.defensa();
	}

	 
	/**
	 * Retorna la velocidad total de la nave
	 * @return double con la velocidad final
	 */
	public double velocidadFinal(){
		return armas.velocidad() + blindaje.velocidad() 
	 	+ cabina.velocidad() + propulsion.velocidad();
	}
	 
	/**
	 * Retorna el peso total de la nave
	 * @return double con el peso final
	 */public double pesoFinal(){
		return armas.peso() + blindaje.peso() 
	 	+ cabina.peso() + propulsion.peso();
	}

	/**
	 * Retorna la informacion importante de una pieza particular
	 * @param piece la pieza a mostrar informacion
	 * @return String la informacion de la pieza
	 */
	private String desglosePieza(Pieza piece) {
		return "Pieza: "+ piece.nombre() + " || Precio: " + piece.precio() 
		+ "\n" + piece.descripcion() + "\n"; 

	}

}
