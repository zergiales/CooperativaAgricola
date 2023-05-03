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
    	///ESTO NO VALE REVISAR 
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        coop.menuPrincipal();
        Productores array []= {new Productores("Paco","4988539E",4,false,true),
        new Productores("Hector","1234567E",6,false,false),new Productores("Alejandro","4556737E",5,true,true)};
        
        for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
        }
}
