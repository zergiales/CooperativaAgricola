import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
	
    
	public static void main(String [] args){
        //objetos de las clase que hereda 
    	Scanner sc= new Scanner(System.in);        
    	Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        System.out.println("Utilice las teclas numericas para desplazarse por los menus");
        System.out.println("1. Menu Productores");
        System.out.println("2. Menu Productos");
        System.out.println("3. Menu Distribuidores");
        System.out.println("4. Menu logistica");
        System.out.println("5. Menu compra");
        coop.gestorMenu();
        
        }
}
