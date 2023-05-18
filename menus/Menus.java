package menus;

import java.text.SimpleDateFormat;
import java.util.*; //importamos la clase scanner

import Productores.PequenioProductor;
import Productores.Productor;
import consumidorFinal.ConsumidorFinal;
import distribuidores.Distribuidores;
import logistica.Logistica;
import productos.Productos;
/**
 * Clase abstracta donde tendremos los menus que iran siendo
 * llamados desde la clase clase cooperativa.class
 * 
 * @author Sergio 
 * @version 1.0
 */
public abstract class Menus {
	//arrayList productor general
	protected ArrayList<Productor> productores = new ArrayList<Productor>();
	//lista de productores que son grandes
	protected ArrayList<Productor> granProductor = new ArrayList<Productor>();
	//lista de productores que son pequeños
	protected ArrayList<Productor> pequenioProductor = new ArrayList<Productor>();
	//lista de productores que son federados
	protected ArrayList<Productor> federadoProductor = new ArrayList<Productor>();
	//arraylist productos
	protected ArrayList<Productos> listaProductos = new ArrayList<Productos>();
	//arraylist logistica
	protected ArrayList<Logistica> logisticas = new ArrayList<Logistica>();
	//objetos
	PequenioProductor pequenio = new PequenioProductor();
	Distribuidores distribuidores = new Distribuidores();
    ConsumidorFinal consumidor= new ConsumidorFinal();
	protected int puntero; //con el cual nos vamos moviendo
	
	protected Scanner sc = new Scanner(System.in);
	
	 
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
			 * 1º insertamos en una arraylist el todos los parametro del productor
			 * 2º insertamos los productos del prodcutor con sus datos en un arraylist que hemos creado pa los productos 
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
			 * 1º mostramos los productores que son pequeño
			 * 2º el usuario ha seleccionado será un productor pequeño
			 * 3º en cuanto ceda el producto, sera productor federado
			 */
			System.out.println("Cargando la opcion de ceder productos");
			pequenio.cederProductos(pequenioProductor);
	        System.out.println("--------------------------------");
	        break;
		case 4:
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
    	System.out.println("Pulse 1 si desea crear un producto");
        System.out.println("Pulse 2 si desea modificar un producto");
        System.out.println("Pulse 3 si desea eliminar un producto");
    	System.out.println("Pulse 4 si desea ver todos los productos");
        System.out.println("Pulse 5 si desea volver");
    	System.out.print("inserte numero: ");
     	puntero = sc.nextInt();
     	if(puntero==1) {
     		//funcion de crear producto
     		producto.insertarProducto();
     	}else if(puntero==2) {
     		//funcion modifica producto
     	}else if (puntero==3) {
     		//funcion eliminar producto 
     	}else if(puntero==4) {
     		//funcion para ver todos los productos
     		producto.toString();
     	}else if(puntero ==5) {
     		//volvemos al menu principal
     		menuPrincipal();
     		
     	}
    }
    public void menuDistribuidores() {
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
    	if(puntero==1) {
    		//funcion de crear
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
    public void menuCompra() {
    	System.out.println("Pulse 1 si desea añaadir un producto");
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
