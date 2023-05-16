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
	//constructor con parametro
	public GranProductor(String nombreProductor, String dni, Date fecha, double hectareasN,
			ArrayList<Productor> listaProductos,boolean grande) {
		super(nombreProductor, dni, fecha, hectareasN, listaProductos);
	}
}


