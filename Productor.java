
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
    private String dni;//para identificarlos (id)
	private Date fecha;// cada año fiscal se determina la extension	
	private double hectareasN;// numero de hectareas 
	//productos
	private String nombreP;
	private double hectareasP;
	protected ArrayList<Productor> listaProductos= new ArrayList<Productor>();//asi tendremos una lista de productos en cada productor
    //constructor predefinido
    public Productor() {
    	
    }
   
    //constructor con parametros
    public Productor(String nombreProductor, String dni, Date fecha, double hectareasN,
			ArrayList<Productor> listaProductos) {
   	
		this.nombreProductor = nombreProductor;
		this.dni = dni;
		this.fecha = fecha;
		this.hectareasN = hectareasN;//es igual al numero de hectareas que vamos guardando en total
	}
	
	public Productor(String nombreP, double hectareasP) {
		this.nombreP = nombreP;
		this.hectareasP = hectareasP;
	};

	//metodo para crear productores y listarlos
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
        String fechaString = sc.next(); //metemos en string la fecha
        //luego lo cambiamos el valor a date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
			fecha = formato.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        System.out.println(" ");
        
        System.out.print("numero de productos que va a plantar: ");
        int numProducto = sc.nextInt();
        
        for (int i = 0; i < numProducto; i++) {
        	
        	System.out.print("inserte producto "+ (i+1) +" :");
        	nombreP= sc.nextLine();
        	
        	System.out.print("numero de hectareas que ocupa el producto "+ (i+1) +" : ");
        	hectareasP= sc.nextDouble();
        	
        	//añadimos el numero de hectareas en esta variable
        	hectareasN+=hectareasP;
        	//creamos un objeto producto que guarda los productos y su rendimiento por hectareas
        	Productor listado= new Productor(nombreP, hectareasP);
            listaProductos.add(listado);
		}
        
        Productor nuevoProductor = new Productor(nombreP,dni,fecha,hectareasN,listaProductos);
        productores.add(nuevoProductor);
        System.out.println("--------------------------------");
        System.out.println("****Productor creado***");
        System.out.println(productores.get(0));
        System.out.println("--------------------------------");
        System.out.println("volviendo al menu principal");
        menuPrincipal();
	}
	
	//metodo para mostrar los productores de una manera mas mejor
	public String toString() {
		String resultado="";
		//bucle for para recorrer el producto
		
		   for (int i = 0; i < listaProductos.size(); i++) {
	            resultado += listaProductos.get(i);
	        }

		return "nombre del productor:"+nombreP+" |\n "+
				"Dni: "+dni+" |\n "+
				"año fiscal: "+fecha+"|\n "+
				"productos: "+resultado+  "|\n "+
				listaProductos;
		
	}
	
	//metodo para modificar el productor
	public void modificarProductor() {}
	
	//metodo para eliminar el productor
	public void eliminarProductor() {}
	
	
		
	

}
