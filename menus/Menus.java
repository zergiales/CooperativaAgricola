package menus;

import java.text.SimpleDateFormat;
import java.util.*; //importamos la clase scanner
//PRODUCTORES
import Productores.Productor;
import Productores.PequenioProductor;
import Productores.GranProductor;
import Productores.ProductorFederado;
//LOGISTICA
import logistica.Logistica;
//PRODUCTOS
import productos.Productos;
//CONSUMIDOR
import consumidorFinal.ConsumidorFinal;
//DISTRIBUIDORES
import distribuidores.Distribuidores;
/**
 * Clase abstracta donde tendremos los menus que iran siendo
 * llamados desde la clase clase cooperativa.class
 * 
 * @author Sergio 
 * @version 1.0
 */
public abstract class Menus {
	//ARRAYLIST
	//lista de productores en general
	protected ArrayList<Productor> productores = new ArrayList<Productor>();
	//lista de productores que son grandes
	protected ArrayList<Productor> granProductor = new ArrayList<Productor>();
	//lista de productores que son pequeños
	protected ArrayList<Productor> pequenioProductor = new ArrayList<Productor>();
	//lista de productores que son federados
	protected ArrayList<Productor> federadoProductor = new ArrayList<Productor>();
	//lista de empresas 
	protected ArrayList<Logistica> empresas = new ArrayList<Logistica>();
	//lista de productos
	protected ArrayList<Productos> listaProductos = new ArrayList<Productos>();


	protected int puntero; //con el cual nos vamos moviendo
	
	protected static Scanner sc = new Scanner(System.in);
	
	 
	//menu principal
	public void menuPrincipal() {
		System.out.println("Utilice las teclas numericas para desplazarse por los menus");
        System.out.println("1. Menu Productores");
        System.out.println("2. Menu Productos");
        System.out.println("3. Menu Distribuidores");
        System.out.println("4. Menu logistica");
        System.out.println("5. Menu compra");
    	System.out.print("inserte numero: ");
        puntero = sc.nextInt();
        if(puntero>=1) {
        	gestorMenu(puntero);
        }else {
        	System.out.println("numero incorrecto");
        }
	}
	//menu productores
	public void menuProductores() {
		Productor productor = new Productor();
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea ver todos los productores");
        System.out.println("Pulse 3 si desea ceder un producto");
        System.out.println("Pulse 4 si desea volver al menu");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
    	switch (puntero) {
		case 1:
			/**
			 * 1. insertamos en una arraylist el todos los parametro del productor
			 * 2. insertamos los productos del prodcutor con sus datos en un arraylist que hemos creado pa los productos 
			 */
			System.out.println("Creando productor");
			productor.crearProductor(productores);
	        System.out.println("--------------------------------");
	        break;
		case 2:
			System.out.println("Mostrando todos los productores");
	        System.out.println("--------------------------------");
	        break;
		case 3:
			/**
			 * 1. mostramos los productores que son peque�o
			 * 2. el usuario ha seleccionado ser� un productor peque�o
			 * 3. en cuanto ceda el producto, sera productor federado
			 */
			System.out.println("Cargando la opcion de ceder productos");
			
			PequenioProductor pequenio= new PequenioProductor();
			pequenio.cederProductos(pequenioProductor);
	        System.out.println("--------------------------------");
	        break;
		case 4:
			/**
			 * vuelves al menu principal
			 */
			System.out.println("volviendo al menu principal");
			menuPrincipal();
			break;
		default:
			break;
		}
    		
    }
	//menu de productos
    public void menuProductos() {
    	Productos producto = new Productos();
    	System.out.println("Pulse 1 si desea ver todos los productos");
        System.out.println("Pulse 2 si desea eliminar algun producto de un productor");
    	System.out.println("Pulse 3 si desea volver");
    	System.out.print("inserte numero: ");
     	puntero = sc.nextInt();
    	switch (puntero) {
		case 1:
			/**
			 * 1� mostramos todos los productos de los productores
			 * 2� mostramos la cantidad que hay de cada producto de todo lo que producen 
			 * 3� y vemos que si se han insertado bien , en la cooperativa a parecer� el numero totoal de productos
			 *  
			 */
			System.out.println("mostrando los productos");
	        System.out.println("--------------------------------");
	        break;
		case 2:
			/**
			 * 1. primero seleccionamos el productor
			 * 2. luego eleminamos el tipo de productos,que supone que las hectareas tb se eliminan
			 * 3. vemos que se ha heccho todo correcto y se muestra el productor midificado con el producto quitado
			 */
			System.out.println("ha decidio eliminar un prod");
	        System.out.println("--------------------------------");
	        break;
		case 3:
			/**
			 * pa el lobby 
			 */
			System.out.println("volviendo al menu principal");
			menuPrincipal();
	        break;
		default:
			break;
		}
    }
    public void menuDistribuidores() {
    	System.out.println("----------------------");
    	System.out.println("entrando en el menu de distribuidores");
    	System.out.println("Pulse 1 si desea crear un distribuidor");
        System.out.println("Pulse 2 si desea modificar un distribuidor");        
        System.out.println("Pulse 3 si desea ver los distribuidores");
        System.out.println("Pulse 4 si desea eliminar un eliminar un distribuidor");
        System.out.println("Pulse 5 si desea volver");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
    	if(puntero==1) {
    		//funcion de crear distribuidor
    	}else if(puntero==2) {
    		//funcion modifica distribuidor
    	}else if (puntero==3) {
    		//funcion eliminar distribuidor
    	}else if(puntero==4) {
    		//ver distribuidores
    	}else if(puntero==5) {
    		//volver al menu principal
    		menuPrincipal();
    	}
    	
    }
    public void menuLogistica() {
    	Logistica logistica = new Logistica();
    	System.out.println("Pulse 1 si desea crear una empresa");
        System.out.println("Pulse 2 si desea insertar oferta");
        System.out.println("Pulse 3 si desea ver ofertas ");
        System.out.println("Pulse 4 si desea surtir productos");
        System.out.println("Pulse 5 si desea volver");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
    	switch (puntero) {
		case 1:
			System.out.println();
			break;
		case 2:
			System.out.println();
			break;
			
		default:
			break;
		}
    }
    public void menuCompra() {
    	System.out.println("Pulse 1 si desea a�aadir un producto");
        System.out.println("Pulse 2 si desea modificar un producto");
        System.out.println("Pulse 3 si desea eliminar algo de la cesta");
        System.out.println("Pulse 4 si desea pagar");
        System.out.println("Pulse 5 si desea volver");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
        if(puntero==1) {
    		//funcion de crear distribuidor
    	}else if(puntero==2) {
    		//funcion modifica distribuidor
    	}else if (puntero==3) {
    		//funcion eliminar distribuidor
    	}else if(puntero==4) {
    		//ver distribuidores
    	}else if(puntero==5) {
    		//volver al menu principal
    		menuPrincipal();
    	}       
    }
    public void gestorMenu(int puntero) {        
        System.out.println("--------------------------------");
        //si el puntero esta en cero se carga el principal , sino se carga los otros y tira esto normal 
        System.out.println("numero insertado: "+puntero);
        System.out.println("cargando menu...");
    	switch (puntero) {
		case 1:
			System.out.println("abriendo menu de Productores");
			menuProductores();
	        System.out.println("--------------------------------");
	        break;
		case 2:
			System.out.println("abriendo menu de Productos");
			menuProductos();
	        System.out.println("--------------------------------");
	        break;
		case 3:
			System.out.println("abriendo menu de Distribuidores");
			menuDistribuidores();
	        System.out.println("--------------------------------");
	        break;
		case 4:
			System.out.println("abriendo menu de Logistica");
			menuLogistica();
	        System.out.println("--------------------------------");
	        break;
		case 5:
			System.out.println("abriendo menu de Compra");
			menuCompra();
	        System.out.println("--------------------------------");
	        break;
		case 6:
			System.out.println("volviendo al menu principal");
			menuPrincipal();
			break;
		default:
			break;
		}
    
}
}
