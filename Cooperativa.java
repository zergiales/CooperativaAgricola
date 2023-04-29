import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa{


	public static void menu() {
		System.out.println("caso 1");
		System.out.println("caso 2");
		System.out.println("caso 3");
		System.out.println("caso 4");
		System.out.println("caso 5");
	}


    public static void main(String [] args){
        //objetos de las clase que herada 
        Scanner sc= new Scanner(System.in);
        String nombre= sc.nextLine();
        
        
        
        System.out.println("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:"+nombre);
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);


    }
}
