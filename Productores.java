
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
    private String dni;//para identificarlos (id)
    private int hectareas;// numero de hectareas 
    boolean federado = false; //por defecto asumimos que es no es
    boolean pequenio = true; //por defecto todos son pequenioos productores
    
    // Constructor
	public Productores(String nombreP, String dni, int hectareas, boolean federado, boolean pequenio) {
		this.nombreP = nombreP;
		this.dni = dni;
		this.hectareas = hectareas;
		this.federado = federado;
		this.pequenio = pequenio;
	}
	
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
