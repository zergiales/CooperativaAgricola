import java.text.*;
import java.util.ArrayList;

/**
 * Clase producto donde vamos a porceder a crear el producto
 * @author Sergio
 * @version 1.0
 */
public class Productos extends Menus{
   private String nombre;
   private double precio;
   private double rendimiento;
   private boolean pedecedero = false;

   public Productos() {}
   
   public Productos(String nombre, double precio, double rendimiento, boolean pedecedero) {
	   this.nombre = nombre;
	   this.precio = precio;//x kg
	   this.rendimiento = rendimiento;// x hectarea
	   this.pedecedero = pedecedero; //para la clase logistica
   }
   
   
   

   
   public void insertarProducto() {
       System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un producto");
		
		System.out.print("Nombre del producto: ");
		setNombre(sc.nextLine());
		System.out.println(" ");
       
		System.out.print("indique el precio del kilogramo: ");
		precio = sc.nextDouble();
		
       System.out.print("inserte el rendimiento por hectarea del producto: ");
       rendimiento = sc.nextDouble();

       System.out.print("pedecedero?: ");
       pedecedero = sc.nextBoolean();
       //lo insertamos en un arraylist 
       Productos nuevoProducto = new Productos(nombre, precio,rendimiento, pedecedero);
       productos.add(nuevoProducto);

       System.out.println("--------------------------------");
       System.out.println("****Producto insertado****");
       System.out.println(productos);
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}
    
   public void mostrarProductos() {
	  for (int i = 0; i < productos.size(); i++) {
		  Productos e = productos.get(i);
		System.out.println(e);
	}
   }
 //metodo para mostrar los productores
 	public String toString() {
 		return "nombre del producto: "+nombre+"  |\n "+
 				"precio el kilogramo: "+precio+"€ |\n "+
 				"rendimiento por hectarea: "+rendimiento+" |\n "+
 				"pedecedero: "+pedecedero;
 		
 	}
 	public String toStringProductos() {
 		String txt="";
 		for (Productos productos : productos) {
			
		}
 		return
 	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 	
}
