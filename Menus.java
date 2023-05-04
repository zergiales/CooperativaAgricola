
import java.util.Scanner; //importamos la clase scanner
/**
 * Clase abstracta donde tendremos los menus que iran siendo
 * llamados desde la clase clase cooperativa.class
 * 
 * @author Sergio 
 * @version 1.0
 */
public abstract class Menus {
	protected int puntero;        
	Scanner sc = new Scanner(System.in);
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

	public void menuProductores() {
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea eliminar un productor");
        System.out.println("Pulse 4 si desea volver");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
    	if(puntero==1) {
    		//funcion de crear productor
    	}else if(puntero==2) {
    		//funcion modifica productor
    	}else if (puntero==3) {
    		//funcion eliminar productor 
    	}else if(puntero==4) {
    		//volvemos al menu principal
    		menuPrincipal();
    	}
    		
    }
    public void menuProductos() {
    	System.out.println("Pulse 1 si desea crear un producto");
        System.out.println("Pulse 2 si desea modificar un producto");
        System.out.println("Pulse 3 si desea eliminar un producto");
        System.out.println("Pulse 4 si desea volver");
    	System.out.print("inserte numero: ");
     	puntero = sc.nextInt();
     	if(puntero==1) {
     		//funcion de crear producto
     	}else if(puntero==2) {
     		//funcion modifica producto
     	}else if (puntero==3) {
     		//funcion eliminar producto 
     	}else if(puntero==4) {
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
    	System.out.println("Pulse 1 si desea crear un productor");
        System.out.println("Pulse 2 si desea modificar un productor");
        System.out.println("Pulse 3 si desea eliminar un productor");
        System.out.println("Pulse 4 si desea ver todos los productos");
        System.out.println("Pulse 5 si desea volver");
        System.out.print("inserte numero: ");
    	puntero = sc.nextInt();
    	if(puntero==1) {
    		//funcion de crear d
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
    	System.out.println("Pulse 1 si desea a�adir un producto");
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
			System.out.println("abriendo menu de Log�stica");
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
