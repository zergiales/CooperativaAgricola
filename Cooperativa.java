import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa{





    public static void main(String [] args){
    	//objeto Productores
    	Productores p=new Productores("por defecto", 0, "12345678E", 4);
        //objetos de las clase que hereda 
    	Scanner sc= new Scanner(System.in);        
        
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        System.out.println("¿Que desea hacer?");
        System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea almacenar un productor");
        System.out.print("numero a insertar:");
        int puntero = sc.nextInt(); //parametro fundamental para acceder al menu princpial
        //un pequeño enunciado antes de cargar el switch
        wi

        
        //Metodo del menu
    	
    }
}
