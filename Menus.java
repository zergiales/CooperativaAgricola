
/**
 * Clase abstracta donde tendremos los menus que iran siendo
 * llamados desde la clase clase cooperativa.class
 * 
 * @author Sergio 
 * @version 1.0
 */
public abstract class Menus{
    
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
    
}
