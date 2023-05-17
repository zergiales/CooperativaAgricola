package cooperativa;
import java.util.Scanner; //importamos la clase scanner

import menus.Menus;
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
	final int limite = 0;
	final int anio = 0;
    public static void main(String [] args){    	
    	
//    	//ejemplos de listas de productos
//    	Productor listEj1 = new Productor("Producto 1", 10.5);
//    	Productor listEj2 = new Productor("Producto 2", 8.2);
//    	Productor listEj3 = new Productor("Producto 3", 12.7);
//    	//objetos productor
//    	Productor productor1 = new Productor("pepe","12345678E","22/06/2023",6,listEj1);
//
//    	listaProductos.add(listEj1);
//    	listaProductos.add(listEj2);
//    	listaProductos.add(listEj3);
//    	//objeto productos 
//    	Productos producto1 = new Productos("tomate", 4,1,false);
//    	Productos producto2 = new Productos("alcachofa", 5.99,0.1,true);
//    	Productos producto3 = new Productos("cebolla", 3.01,0.1, true);
//    	
    	
    	
    	Scanner sc= new Scanner(System.in);        
        
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
//        coop.general();//establecemos año fiscal y el limite de hectareas
        //metodo que gestiona los metodos de cada opcion del menu
        coop.menuPrincipal();
        
        
    }
    
    
      
}
