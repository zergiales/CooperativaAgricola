import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
	
	Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
    
	public static void main(String [] args){
        //objetos de las clase que hereda 
    	Scanner sc= new Scanner(System.in);        
    	
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
        System.out.print("inserte numero: ");
        int puntero = sc.nextInt();
        System.out.println("--------------------------------");
 
      //metodo para llamar a los menus
        public void gestorMenu() {
        	int punt= puntero;
			switch (punt) {
			case 1:
				System.out.println("abriendo menu de Productores");
				coop.menuProductores();
		        System.out.println("--------------------------------");
			case 2:
				System.out.println("abriendo menu de Productos");
				coop.menuProductos();
		        System.out.println("--------------------------------");
			case 3:
				System.out.println("abriendo menu de Distribuidores");
				coop.menuDistribuidores();
		        System.out.println("--------------------------------");
			case 4:
				System.out.println("abriendo menu de Logística");
				coop.menuLogistica();
		        System.out.println("--------------------------------");
			case 5:
				System.out.println("abriendo menu de Compra");
				coop.menuCompra();
		        System.out.println("--------------------------------");
        	}
        
        }
}
