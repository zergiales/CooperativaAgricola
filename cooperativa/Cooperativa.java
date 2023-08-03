package cooperativa;
import java.util.Scanner; //importamos la clase scanner
import menus.Menus; //importamos la clase abstracta menus
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
    
	public static void main(String [] args){    	
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta            
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        coop.menuPrincipal();//gestiona los menus de la aplicacion
        
    }
         
}