
/**
 * Clase productores
 * - En esta clase vamos dar forma a la figura de prodcutores.
 * - Un productor es cualquier actor que proporciona a la empresa un determinado 
 *   producto,
 * 
 * @author Sergio Sanchez  
 * @version 1.0
 */
public class Productores extends Cooperativa{
	
    // atributos que vamos a instanciar en el contructor
    private String nombreP ;
    //private int id;//cada productor debe tener un id asignado (automatico)
    private String dni;//para identificarlos
    private int hectareas;// numero de hectareas 
    boolean federado = false; //por defecto asumimos que es no es
    boolean peque�o = true; //por defecto todos son peque�os productores
    
    // Constructor
	public Productores(String nombreP, String dni, int hectareas, boolean federado, boolean peque�o) {
		this.nombreP = nombreP;
		this.dni = dni;
		this.hectareas = hectareas;
		this.federado = federado;
		this.peque�o = peque�o;
	}
	
	

}
