import java.util.LinkedList;

public class Nave {
	private LinkedList<Pieza> piezas = 
			new LinkedList<Pieza>();
	
	public void agregaPieza(Pieza piece){
	      piezas.add(piece);
	   }
	
	public void desgloseNave() {
		for(Pieza pie : piezas) {
			System.out.println("Pieza: " + pie.nombre() + "  ||  "
					+ "Precio: " + pie.precio() + "\n"
							+ pie.descripcion());
		}
	}
	
	 public double hacerCuenta(){
	      double cost = 0;
	      
	      for (Pieza pie : piezas) {
	         cost += pie.precio();
	      }		
	      return cost;
	   }
	 
	 public double ataqueFinal(){
		 double attack = 0;
		 for (Pieza pie : piezas) {
	         attack += pie.ataque();
	      }
		 return attack;
	 }
	 
	 public double defensaFinal(){
		 double def = 0;
		 for (Pieza pie : piezas) {
	         def += pie.defensa();
	      }
		 return def;
	 }
	 
	 public double velocidadFinal(){
		 double vel = 0;
		 for (Pieza pie : piezas) {
	         vel += pie.velocidad();
	      }
		 return vel;
	 }
	 
	 public double pesoFinal(){
		 double peso = 0;
		 for (Pieza pie : piezas) {
	         peso += pie.peso();
	      }
		 return peso;
	 }
	 
	 

}
