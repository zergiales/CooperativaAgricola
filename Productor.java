
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
	private Date fecha;// cada año fiscal se determina la extension	
	private double hectareas;// numero de hectareas 
    private ArrayList<Productor> productores = new ArrayList<Productor>();
           
    //constructor predefinido
    public Productor() {
    	
    }
    // Constructor
	public Productor(String nombreP, String dni, double hectareas,Date fecha) {
		this.nombreP = nombreP;
		this.dni = dni;
		this.hectareas = hectareas;
		this.fecha = fecha;
		Productos producto = new Productos(); //objetos generaods en la clase productos
	}
	//metodo para crear productores y listarlos
	public void crearProductor() {
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		nombreP = sc.nextLine();
		System.out.println(" ");
        
		System.out.print("Ingrese el DNI del productor: ");
        dni = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("producto");
        
        System.out.print("Indique el numero de hectareas del producto: ");
        hectareas = sc.nextInt();
        //asignarTipoProductor(hectareas);
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
	/*
	private void asignarTipoProductor(hectareas) {
	    	if (hectareas<=5) {
				System.out.println(nombreP+" es un pequeño productor");
				
			} else {
				System.out.println("gran productor");

			}
	    }
		*/
	
	//metodo para mostrar los productores
	public String toString() {
		return "nombre del productor: "+nombreP+" | "+
				"Dni: "+dni+" "+
				"numero de hectareas: "+hectareas+" | ";
		
	}
	
	//metodo para asignar si el productor es pequeño, grande o esta federado
		
	

}
