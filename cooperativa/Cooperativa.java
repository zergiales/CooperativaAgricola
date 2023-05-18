package cooperativa;
import java.util.Scanner; //importamos la clase scanner

import Productores.Productor;
import menus.Menus;
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
    
	public static void main(String [] args){    	
    	System.out.println("entra?");
		Scanner sc= new Scanner(System.in);            
    	Productor productor = new Productor();
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        coop.menuPrincipal();//metodo que gestiona
        
        
    }
    
    
      
}
