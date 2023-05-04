import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Clase producto donde vamos a porceder a crear el producto
 * @author Sergio
 * @version 1.0
 */
public class Productos extends Menus{
   private String nombre;
   private double rendimiento;
   private double precio;
   
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
       
		System.out.print("Ingrese : ");
       dni = sc.nextLine();
       System.out.println(" ");
       
       System.out.println("producto");
       
       System.out.print("Indique el numero de hectareas del producto: ");
       int hectareas = sc.nextInt();
//       asignarTipoProductor(hectareas);
       System.out.println(" ");
		
		System.out.println("inserte la fecha en el formato dd/MM/yyyy");
		String fechaString = sc.next(); //metemos en string la fecha
		//luego lo cambiamos el valor a date
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//control de expceciones
		try {
			fecha = formato.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
       
       
       Productor nuevoProductor = new Productor(nombreP, dni, hectareas,fecha);
       productores.add(nuevoProductor);
       System.out.println("--------------------------------");
       System.out.println("Productor creado");
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}
}
