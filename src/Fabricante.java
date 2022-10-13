import java.util.Scanner;

public class Fabricante{
	

	/**
     * Metodo builder correspondiente a una nave individual de combate
     * Cuenta con un sistema de misiles de plasma, blindaje reforzado,
     * cabina para un piloto y propulsion intercontinental
     */
    public Nave crearNaveIndividual(){
       Nave nave = new Nave();
       nave.setArmas(new MisilesDePlasma());
       nave.setBlindaje(new BlindajeReforzado());
       nave.setCabina(new Piloto());
       nave.setPropulsion(new Intercontinental());

       return nave;

	}



	/**
     * Metodo builder correspondiente a una nave militar de transporte
     * Cuenta con un sistema de laser simple, blindaje simple,
     * cabina para una tripulacion pequena, y propulsion intergalactica
     */ 
    public Nave crearNaveTransporte(){
        Nave nave = new Nave();
        nave.setArmas(new LaserSimple());
        nave.setBlindaje(new BlindajeSimple());
        nave.setCabina(new TripulacionPequena());
        nave.setPropulsion(new Intergalactico());

       return nave;

	}

    


	/**
     * Metodo builder correspondiente a una base espacial de guerra
     * Cuenta con un sistema de laser destructor de planetas, blindaje de tipo fortaleza,
     * cabina para un ejercito y propulsion interplanetaria
     */ 
    public Nave crearBaseEspacial(){
        Nave nave = new Nave();
        nave.setArmas(new LaserDestructorPlanetas());
        nave.setBlindaje(new BlindajeFortaleza());
        nave.setCabina(new Ejercito());
        nave.setPropulsion(new Interplanetario());

       return nave;

	}



	/**
     * Metodo builder general
     * Puede crear cualquier combinación de nave permitida
     * Delega la creacion a los constructores
     */
    public Nave crearNave(){
        Nave nave = new Nave();
        nave.setArmas(crearArmas());
        nave.setBlindaje(crearBlindaje());
        nave.setCabina(crearCabina());
        nave.setPropulsion(crearPropulsion());

       return nave;

	}

    /**
     * Constructor de los distintos tipos de blindajes
     * @return Blindaje del tipo seleccionado
     */
	private Blindaje crearBlindaje(){
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("¿Que tipo de blindaje deseas en tu nave?"
                     + "\n1.- Simple"
                     + "\n2.- Reforzado"
                     + "\n3.- Fortaleza");

		while (true){
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if((opcion > 0) && (opcion < 4)){
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                    	+ "\n1.- Simple"
                        + "\n2.- Reforzado"
                        + "\n3.- Fortaleza");
                }
            }catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida"
                	+ "\n1.- Simple"
                    + "\n2.- Reforzado"
                    + "\n3.- Fortaleza");
            }
        }

        Blindaje blindaje;

        switch(opcion){
            case 1:
            	blindaje = new BlindajeSimple();
            	break;
            case 2:
            	blindaje = new BlindajeReforzado();
            	break;
            default:
            	blindaje = new BlindajeFortaleza();
            	break;

        }
        return blindaje;
	}

	


	/**
     * Constructor de los distintos tipos de propulsiones
     * @return Propulsion del tipo seleccionado
     */
    private Propulsion crearPropulsion(){
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("¿Que tipo de propulsion deseas en tu nave?"
                     + "\n1.- Intercontinental"
                     + "\n2.- Interplanetario"
                     + "\n3.- Intergalactico");

		while (true){
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if((opcion > 0) && (opcion < 4)){
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                    	+ "\n1.- Intercontinental"
                        + "\n2.- Interplanetario"
                        + "\n3.- Intergalactico");
                }
            }catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida"
                	+ "\n1.- Intercontinental"
                    + "\n2.- Interplanetario"
                    + "\n3.- Intergalactico");
            }
        }

        Propulsion propulsion;

        switch(opcion){
            case 1:
            	propulsion = new Intercontinental();
            	break;
            case 2:
            	propulsion = new Interplanetario();
            	break;
            default:
            	propulsion = new Intergalactico();
            	break;

        }
        return propulsion;
	}



	

	/**
     * Constructor de los distintos tipos de cabinas
     * @return Cabina del tipo seleccionado
     */
    private Cabina crearCabina(){
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("¿Que tipo de cabina deseas en tu nave?"
                     + "\n1.- Para un piloto"
                     + "\n2.- Para una tripulacion pequena"
                     + "\n3.- Para un ejercito");

		while (true){
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if((opcion > 0) && (opcion < 4)){
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                    	+ "\n1.- Para un piloto"
                        + "\n2.- Para una tripulacion pequena"
                        + "\n3.- Para un ejercito");
                }
            }catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida"
                	+ "\n1.- Para un piloto"
                    + "\n2.- Para una tripulacion pequena"
                    + "\n3.- Para un ejercito");
            }
        }

        Cabina cabina;

        switch(opcion){
            case 1:
            	cabina = new Piloto();
            	break;
            case 2:
            	cabina = new TripulacionPequena();
            	break;
            default:
            	cabina = new Ejercito();
            	break;

        }
        return cabina;
	}



	/**
     * Constructor de los distintos sistemas de armas
     * @return Armas del tipo seleccionado
     */
    private Armas crearArmas(){
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("¿Que tipo de arma deseas en tu nave?"
                     + "\n1.- Laser simple"
                     + "\n2.- Misiles de plasma"
                     + "\n3.- Laser destructor de planetas");

		while (true){
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                if((opcion > 0) && (opcion < 4)){
                    break;
                } else {
                    System.out.println("Ingresa una opcion valida"
                    	+ "\n1.- Laser simple"
                        + "\n2.- Misiles de plasma"
                        + "\n3.- Laser destructor de planetas");
                }
            }catch (NumberFormatException ex){
                System.out.println("Ingresa una opcion valida"
                	+ "\n1.- Laser simple"
                    + "\n2.- Misiles de plasma"
                    + "\n3.- Laser destructor de planetas");
            }
        }

        Armas arma;

        switch(opcion){
            case 1:
            	arma = new LaserSimple();
            	break;
            case 2:
            	arma = new MisilesDePlasma();
            	break;
            default:
            	arma = new LaserDestructorPlanetas();
            	break;

        }
        return arma;

	}

}