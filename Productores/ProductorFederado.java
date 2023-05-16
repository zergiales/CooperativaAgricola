package Productores;

/**
 * Clase para los productores qe por extension no llegan a ser grandes prodcutoes
 * 
 *  en resumen un productor federado es un pequeo productor con un nombre de una
 *  federacion
 * 
 * @author     Sergio Sanchez Lopez 
 * @version 1.0
 */
public class ProductorFederado extends PequenioProductor{
    public ProductorFederado(String nombreP, String dni, int hectareas, boolean federado, boolean pequenio,
			String Producto) {
		super(nombreP, dni, hectareas, federado, pequenio, Producto);
		// TODO Auto-generated constructor stub
	}
	protected String nombreFeredacion;
    protected String conjuntoFederacion[]= new String[10]; //para tener almacenados  los prodcutores que estan federados
    

   
}
