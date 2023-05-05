
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
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
    private String nombreP;
    private String dni;//para identificarlos (id)
	private Date fecha;// cada a�o fiscal se determina la extension	
	private double hectareas;// numero de hectareas 
    protected ArrayList<Productor> productores = new ArrayList<Productor>();
    Productos producto = new Productos(); //objetos generaods en la clase productos
    //constructor predefinido
    public Productor() {
    	
    }
    // Constructor
	public Productor(String nombreP, String dni, double hectareas,Date fecha, Productos producto) {
		this.nombreP = nombreP;
		this.dni = dni;
		this.hectareas = hectareas;
		this.fecha = fecha;
		this.producto = producto;
	}
	//metodo para crear productores y listarlos
	public void crearProductor(){
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		nombreP = sc.nextLine();
		System.out.println(" ");
        
		System.out.print("Ingrese el DNI del productor: ");
        dni = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("inserte la fecha en el formato dd/MM/yyyy");
        String fechaString = sc.next(); //metemos en string la fecha
        //luego lo cambiamos el valor a date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        try {
			fecha = formato.parse(fechaString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(" ");
        
        System.out.print("numero de productos que va a plantar: ");
        int numProducto = sc.nextInt();
        
        for (int i = 0; i < numProducto; i++) {
        	
        	System.out.print("producto "+ i+1 +" :");
        	String nombreProducto= sc.nextLine();
        	System.out.println(" ");
//        	System.out.print("numero de hectareas que ocupa el producto "+ i+1 +" : ");
//        	hectareas = sc.nextDouble();
        	i++;
		}
        //se comprueba si existe en el array de productos de la clase Producto
        /**
        if(nombreProducto!=producto.getNombre()) {
        	System.out.println("el producto no existe");
        }else {}
        */
        //asignarTipoProductor(hectareas);
       
		
        Productor nuevoProductor = new Productor(nombreP, dni, hectareas,fecha);
        productores.add(nuevoProductor);
        System.out.println("--------------------------------");
        System.out.println("Productor creado");
        System.out.println("--------------------------------");
        System.out.println("volviendo al menu principal");
        menuPrincipal();
	}
	
	//metodo para mostrar los productores de una manera mas mejor
	public String toString() {
		return "nombre del productor: "+nombreP+" | "+
				"Dni: "+dni+" "+
				"numero de hectareas: "+hectareas+" | ";
		
	}
	
		
	

}
