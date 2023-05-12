import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
    public static void main(String [] args){    	
    	//objetos productor
//    	Productor productor1 = new Productor();
//    	Productor prodcutor2 = new Productor();
//    	Productor prodcutor3 = new Productor();
//    	//objeto productos 
//    	Productos producto1 = new Productos("tomate", 4,1,false);
//    	Productos producto2 = new Productos("alcachofa", 5.99,0.1,true);
//    	Productos producto3 = new Productos("cebolla", 3.01,0.1, true);
    	
    	
    	Scanner sc= new Scanner(System.in);        
        
        
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        //metodo que gestiona los metodos de cada opcion del menu
        coop.menuProductores();
        coop.menuPrincipal();
        
        
    }
    
    
      
}
