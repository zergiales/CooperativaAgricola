/**
 * Clase logistica
 *  - los actores principales para proporcionar
 *  a los clientes finales y distribuidores los productos
 *  disponibles en la cooperativa
 * @author Sergio Sanchez 
 * @version (1.0
 */
public class Logistica extends Menus{
    
    private String empresa;
    private int distancia;
    private boolean perecedero;

    //constructor sin parametros
    public Logistica(){}

    //constructor con parametros
	public Logistica(String empresa, int distancia, boolean perecedero) {
		super();
		this.empresa = empresa;
		this.distancia = distancia;
		this.perecedero = perecedero;
	}
    
	//asignar logistica
	public void gestion() {
		
	}
    
}
