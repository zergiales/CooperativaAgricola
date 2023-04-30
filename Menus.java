import java.util.Scanner;
import java.util.Scanner; //importamos la clase scanner
/**
 * Clase abstracta donde tendremos los menus que iran siendo
 * llamados desde la clase clase cooperativa.class
 * 
 * @author Sergio 
 * @version 1.0
 */
public abstract class Menus{
	        
	Scanner sc = new Scanner(System.in);

	public void menuProductores() {
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea eliminar un productor");
    }
    public void menuProductos() {
    	System.out.println("Pulse 1 si desea crear un producto");
        System.out.println("Pulse 2 si desea modificar un producto");
        System.out.println("Pulse 3 si desea eliminar un producto");
    }
    public void menuDistribuidores() {
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea eliminar un productor");
    }
    public void menuLogistica() {
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea eliminar un productor");
    }
    public void menuCompra() {
    	System.out.println("Pulse 1 si desea añadir un producto");
        System.out.println("Pulse 2 si desea modificar un producto");
        System.out.println("Pulse 3 si desea eliminar algo de la cesta");
        System.out.println("Pulse 4 si desea pagar");
    }
    public void gestorMenu() {
    	System.out.print("inserte numero: ");
    	int puntero = sc.nextInt();        
        System.out.println("--------------------------------");
        System.out.println("numero insertado: "+puntero);
        System.out.println("cargando menu...");
    	switch (puntero) {
		case 1:
			System.out.println("abriendo menu de Productores");
			menuProductores();
	        System.out.println("--------------------------------");
	        break;
		case 2:
			System.out.println("abriendo menu de Productos");
			menuProductos();
	        System.out.println("--------------------------------");
	        break;
		case 3:
			System.out.println("abriendo menu de Distribuidores");
			menuDistribuidores();
	        System.out.println("--------------------------------");
	        break;
		case 4:
			System.out.println("abriendo menu de Logística");
			menuLogistica();
	        System.out.println("--------------------------------");
	        break;
		case 5:
			System.out.println("abriendo menu de Compra");
			menuCompra();
	        System.out.println("--------------------------------");
	        break;
		default:
			break;
		}
    
}
}
