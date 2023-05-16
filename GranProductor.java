import java.util.ArrayList;
import java.util.Date;

/**
 * Clase GranProductor, como su propio indica, es para aquellos productores
 * que son grandes y cumple por tanto hectareas>5
 * 
 * 
 * @author Sergio
 * @version (a version number or a date)
 */
public class GranProductor extends Productor{
	private boolean grande = true;

	//constructor con parametro
	public GranProductor(String nombreProductor, String dni, Date fecha, double hectareasN,
			ArrayList<Productor> listaProductos,boolean grande) {
		super(nombreProductor, dni, fecha, hectareasN, listaProductos);
		this.grande = grande;
	}
}


