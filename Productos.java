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
	   this.setNombre(nombre);
	   this.rendimiento = rendimiento;// x hectarea
	   this.precio = precio;//x kg
   }
   

   

   
   public void insertarProducto() {
       System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un producto");
		
		System.out.print("Nombre del producto: ");
		setNombre(sc.nextLine());
		System.out.println(" ");
       
		System.out.print("indique el precio del kilogramo: ");
		precio = sc.nextDouble();
		
       System.out.print("inserte el rendimiento por hectaerea del producto: ");
       rendimiento = sc.nextDouble();

       //lo insertamos en un arraylist 
       Productos nuevoProducto = new Productos(getNombre(), precio,rendimiento);
       listaProductos.add(nuevoProducto);

       System.out.println("--------------------------------");
       System.out.println("Producto insertado");
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}
    
   public void mostrarProductos() {
	  for (int i = 0; i < listaProductos.size(); i++) {
		  Productos e = listaProductos.get(i);
		System.out.println(e);
	}
   }
 //metodo para mostrar los productores
 	public String toString() {
 		return "nombre del producto: "+getNombre()+"  | "+
 				"precio el kilogramo: "+precio+"€ | "+
 				"rendimiento por hectarea: "+rendimiento+" | ";
 		
 	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 	
}
