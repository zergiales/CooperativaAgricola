package logistica;
import java.util.ArrayList;

import Productores.Productor;
import menus.Menus;

/**
 * Clase logistica
 * - actor intermedio que conecta a los clientes con los distribuidores
 * de los productos generados por la cooperativa
 * @author Sergio Sanchez 
 * @version 1.0
 */
public class Logistica extends Menus{
    
    private String empresaLogistica;
    private double distancia;
    private boolean perecedero;

    //constructor sin parametros
    public Logistica(){}

    //constructor con parametros
	public Logistica(String empresaLogistica, int distancia, boolean perecedero) {
		super();
		this.empresaLogistica= empresaLogistica;
		this.distancia = distancia;
		this.perecedero = perecedero;
	}
    //crear empresa
	public void crearEmpresa(ArrayList<Logistica> logisticas){
		System.out.println("nombre de la empresa");
		empresaLogistica =  sc.nextLine();
		
	};        

	//asignar logistica
	public void gestionLogistica() {
		System.out.println("numero de kilometros a realizar");
		distancia = sc.nextInt();
	}
    
}
