import java.util.*;
import java.io.*;
import java.text.*;

/**
 * Clase productores
 * - En esta clase vamos dar forma a la figura de prodcutores.
 * - Un productor es cualquier actor que proporciona a la empresa un determinado 
 *   producto,
 * 
 * @author Sergio Sanchez  
 * @version 1.0
 */
public class Productor extends Menus{
    Scanner sc = new Scanner (System.in);
    // atributos que vamos a instanciar en el contructor
    private String nombreProductor;
    private String dni;//primary key
	private Date fecha;// cada año fiscal se determina la extension	
	private double hectareasN;// numero de hectareas 
	//productos en posesion del productor
	private String nombreP;
	private double hectareasP;
	//lista de productos
	protected ArrayList<Productor> listaProductos= new ArrayList<Productor>();
    //constructor predefinido
    public Productor() {}
   
    //constructor con parametros
    public Productor(String nombreProductor, String dni, Date fecha, double hectareasN,
			ArrayList<Productor> listaProductos) {
		this.nombreProductor = nombreProductor;
		this.dni = dni;
		this.fecha = fecha;
		this.hectareasN = hectareasN;//es igual al numero de hectareas que vamos guardando en total
	}

    //constructor para listado de productos
    public Productor(String nombreP, double hectareasP) {
    	this.nombreP = nombreP;
    	this.hectareasP = hectareasP;
    };

	//metodo para crear productores
	public void crearProductor(ArrayList<Productor> productores){
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		nombreProductor = sc.nextLine();
		System.out.println(" ");
        
		System.out.print("DNI: ");
        dni = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("inserte la fecha en el formato dd/MM/yyyy");
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        formato.setLenient(false);

        while (true) {
            System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
            String fechaStr = sc.nextLine();

            try {
              fecha = formato.parse(fechaStr);
              break;
            } catch (Exception e) {
              System.out.println("Fecha inválida. Intente de nuevo.");
            }
          }
        
        System.out.println(" ");
        System.out.print("numero de productos que va a plantar: ");
        int numProducto = sc.nextInt();
        
        // Pedir al usuario que ingrese los datos de cada producto y agregarlos a la lista
        for (int i = 0; i < numProducto; i++) {
          // Pedir el nombre del producto
          System.out.println("Ingrese el nombre del producto " + (i+1) + ":");
          String nombreP = sc.next();

          // Pedir el número de hectáreas que ocupa el producto
          System.out.println("Ingrese el numero de hectáreas " + (i+1) + ":");
          double hectareasP = sc.nextDouble();

          // Crear un objeto Productor con los datos ingresados y agregarlo a la lista
          Productor listado = new Productor(nombreP, hectareasP);
          listaProductos.add(listado);
        }
        //arraylist
        Productor nuevoProductor = new Productor(nombreProductor,dni,fecha,hectareasN,listaProductos);
        productores.add(nuevoProductor);
        
        /**
         * si la suma total de las hectareas que posee es <5 es pequeño productor,
         * en cambio si son mas de cinco se le asigna al gran productor.
         */
        System.out.println("--------------------------------");
        System.out.println("****Productor creado***");
        // Imprimir la lista de productos
        System.out.println(nuevoProductor.toString());
        
        for (Productor p : listaProductos) {
          System.out.println(p.nombreP + " - " + p.hectareasP + " ha");
        }
        System.out.println("--------------------------------");
        System.out.println("volviendo al menu principal");
        menuPrincipal();
	}
		
		
	//metodo para mostrar prodcutor añadido
	public String toString() {		

		return "nombre del productor:"+nombreProductor+" |\n "+
				"Dni: "+dni+" |\n "+
				"fecha fiscal: "+fecha.getYear()+"|\n "+
				"listado de prodcutos y hectareas: ";
		
	}
	
	//metodo para modificar el productor
	public void modificarProductor() {}
	
	//metodo para eliminar el productor
	public void eliminarProductor() {}
	
	//antes de eliminar o modificar mostramos todos
	public void mostrarProductor() {
	       for (Productor productores : productores) {
	           System.out.println(productores.toString());
	         }
	}
	

}
