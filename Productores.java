
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
    private String nombreProductor;
	private int id;//cada productor debe tener un id asignado (automatico)
    private String dni;//para identificarlos
    private int numHectareas;// extension del terreno 
    
    // Constructor
	public Productores(String nombreProductor, int id, String dni, int numHectareas) {
		super(); //de la superclase
		this.nombreProductor = nombreProductor;
		this.id = id;
		this.dni = dni;
		this.numHectareas = numHectareas;
	}
	

}
