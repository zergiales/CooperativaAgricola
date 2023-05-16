package logistica;
/**
 * calculamos el coste que supone llevar a cabo la gran logistica
 * para tramos de multiplos de 50km
 * 
 * @version 1.0
 * @author Sergio 
 */
public class GranLogistica extends Logistica
{
	protected double costeProducto = 0;
	protected int numTrayectos;
	protected double km; //precio el km fijo
	protected double kg; //kg contratados (max 1000kg)
	private double cuota1 = 0.5; //cuota por tayecto realizado
	protected double coste = numTrayectos * (cuota1 * costeProducto * kg);
	
}
