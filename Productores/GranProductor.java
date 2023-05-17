package Productores;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase GranProductor, como su propio indica, es para aquellos productores
 * que son grandes y cumple por tanto hectareas>5
 * 
 * @author Sergio
 * @version 1.0
 */
public class GranProductor extends Productor{

	/**
	 * @param nombreProductor
	 * @param dni
	 * @param hectareasN
	 * @param federado
	 * @param listaProductos
	 */
	public GranProductor(String nombreProductor, String dni, double hectareasN, boolean federado,
			ArrayList<Productor> listaProductos) {
		super(nombreProductor, dni, hectareasN, federado, listaProductos);
		// TODO Auto-generated constructor stub
	}

}


