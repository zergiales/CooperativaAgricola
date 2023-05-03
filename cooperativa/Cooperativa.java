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
        //objetos de las clase que hereda 
        Scanner sc= new Scanner(System.in);        
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        Productor productor = new Productor("pepe", "1111111A", 4, false, true);
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        coop.menuPrincipal();
        System.out.println("puntero"+ coop.puntero);
        //metodo que gestiona los metodos de cada opcion del menu 
    }
    
    
      
}
