
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
public class Productor{
    Scanner sc = new Scanner (System.in);
    // atributos que vamos a instanciar en el contructor
    private String nombreP ;
    private String dni;//para identificarlos (id)
    private int hectareas;// numero de hectareas 
    boolean federado = false; //por defecto asumimos que es no es
    boolean pequenio = true; //por defecto todos son pequenioos productores
    private ArrayList<Productor> productores = new ArrayList<Productor>();
           
    //constructor predefinido
    public Productor() {
    	
    }
    // Constructor
	public Productor(String nombreP, String dni, int hectareas, boolean federado, boolean pequenio) {
		this.nombreP = nombreP;
		this.dni = dni;
		this.hectareas = hectareas;
		this.federado = federado;
		this.pequenio = pequenio;
	}
	//metodo para crear productores y listarlos
	public void crearProductor() {
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		String nombre = sc.nextLine();
		System.out.println(" ");
        
		System.out.print("Ingrese el DNI del productor: ");
        String dni = sc.nextLine();
        System.out.println(" ");
        
        System.out.print("Ingrese el n�mero de hect�reas del productor: ");
        int hectareas = sc.nextInt();
        System.out.println(" ");
        
        System.out.print("�Es el productor federado? (s/n): ");
        char federadoChar = sc.nextLine().charAt(0);
        System.out.println(" ");
        
        boolean federado = (federadoChar == 's' || federadoChar == 'S');
        System.out.println(" ");
        
        System.out.print("�Es el productor peque�o? (s/n): ");
        char pequenioChar = sc.nextLine().charAt(0);
        boolean pequenio = (pequenioChar == 's' || pequenioChar == 'S');
        	
        Productor nuevoProductor = new Productor(nombre, dni, hectareas, federado, pequenio);
        productores.add(nuevoProductor);
        System.out.println("--------------------------------");
        System.out.println("Productor creado");
        
        System.out.println("--------------------------------");

	}
	
	//para mostrarlo bien
	private static String conversionF(boolean federado) {
		if (federado ) {
			return "no";
		} else {
			return "si";
		}
	}
	private static String conversionP(boolean pequenio) {
		if (pequenio ) {
			return "no";
		} else {
			return "si";
		}
	}
	//metodo para mostrar los productores
	public String toString() {
		return "nombre del productor: "+nombreP+" | "+
				"Dni: "+dni+" "+
				"numero de hectareas: "+hectareas+" | "+
				"esta federado?: "+conversionF(federado)+" | "+
				"pequenio productor?: "+conversionP(pequenio)+" | ";
		
	}
	
	

}
