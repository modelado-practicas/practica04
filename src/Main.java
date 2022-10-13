import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Fabricante fabrica = new Fabricante();

        Scanner sc = new Scanner(System.in);
        Double presupuesto;
        int opcion;

        
            System.out.println("\n***BIENVENIDO A LA FABRICA DE NAVES***"
                        + "\nIngresa tu presupuesto:");

            while (true){
                try {
                    String opcionPres = sc.nextLine();
                    presupuesto = Double.parseDouble(opcionPres);
                    break;
                }catch (NumberFormatException ex){
                    System.out.println("Ingresa una opcion valida.");
                }
            }

        do{
            System.out.println("\n***BIENVENIDO A LA FABRICA DE NAVES***"
                        + "\n¿Puedo tomar tus especificaciones?"
                        + "\n1.- Nave individual de combate"
                        + "\n2.- Nave militar de transporte"
                        + "\n3.- Base espacial de guerra"
                        + "\n4.- Arma tu nave"
                        + "\n0.- Salir");

            while (true){
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                }catch (NumberFormatException ex){
                    System.out.println("Ingresa una opcion valida."
                        + "\n1.- Nave individual de combate"
                        + "\n2.- Nave militar de transporte"
                        + "\n3.- Base espacial de guerra"
                        + "\n4.- Arma tu nave"
                        + "\n0.- Salir");
                }
            }

            switch(opcion){
                case 1:
                    Nave nave1 = fabrica.crearNaveIndividual();
                    nave1.desgloseNave();
                    if(nave1.precioFinal()> presupuesto){
                        System.out.println("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas crear otra nave o ver nuestro catalogo?");
                    }else{
                        System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas, paga en la caja la cantidad de $"+nave1.precioFinal());
                        opcion = 0;
                    }
                    break;
                case 2:
                    Nave nave2 = fabrica.crearNaveTransporte();
                    nave2.desgloseNave();
                    if(nave2.precioFinal()> presupuesto){
                        System.out.println("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas crear otra nave o ver nuestro catalogo?");
                    }else{
                        System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas, paga en la caja la cantidad de $"+nave2.precioFinal());
                        opcion = 0;
                    }
                    break;
                case 3:
                    Nave nave3 = fabrica.crearBaseEspacial();
                    nave3.desgloseNave();
                    if(nave3.precioFinal()> presupuesto){
                        System.out.println("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas crear otra nave o ver nuestro catalogo?");
                    }else{
                        System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas, paga en la caja la cantidad de $"+nave3.precioFinal());
                        opcion = 0;
                    }
                    break;
                case 4: 
                    Nave nave4 = fabrica.crearNave();
                    nave4.desgloseNave();
                    if(nave4.precioFinal()> presupuesto){
                        System.out.println("El costo de tu nave sobrepasa tu presupuesto. ¿Deseas crear otra nave o ver nuestro catalogo?");
                    }else{
                        System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas, paga en la caja la cantidad de $"+nave4.precioFinal());
                        opcion = 0;
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingresa una opcion valida.");
                    break;
            }
        }while(opcion != 0);
    }
}