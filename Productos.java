import java.text.*;
import java.util.ArrayList;

/**
 * Clase producto donde vamos a porceder a crear el producto
 * @author Sergio
 * @version 1.0
 */
public class Productos extends Menus{
   private String nombre;
   private double rendimiento;
   private double precio;
   ArrayList<Productos> listaProductos = new ArrayList<>();


   public Productos() {}
   
   public Productos(String nombre, double rendimiento, double precio) {
	   this.nombre = nombre;
	   this.rendimiento = rendimiento;// x hectarea
	   this.precio = precio;//x kg
   }
   

   

   
   public void insertarProducto() {
       System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un producto");
		
		System.out.print("Nombre del producto: ");
		nombre = sc.nextLine();
		System.out.println(" ");
       
		System.out.print("indique el precio del kilogramo: ");
		precio = sc.nextDouble();
		
       System.out.print("inserte el rendimiento por hectaerea del producto: ");
       rendimiento = sc.nextDouble();

       //lo insertamos en un arraylist 
       Productos nuevoProducto = new Productos(nombre, precio,rendimiento);
       listaProductos.add(nuevoProducto);


       System.out.println("--------------------------------");
       System.out.println("Producto insertado");
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}
    
   public void mostrarProductos() {
	   for (Productos producto : listaProductos) {
		    listaProductos.toString();
		}
   }
 //metodo para mostrar los productores
 	public String toString() {
 		return "nombre del producto: "+nombre+"  | "+
 				"precio el kilogramo: "+precio+"€ | "+
 				"rendimiento por hectarea: "+rendimiento+" | ";
 		
 	}
 	
}
