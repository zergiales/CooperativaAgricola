import java.util.*;
import java.io.*;
import java.text.*;

/**
 * Clase productores
 * - En esta clase vamos dar forma a la figura de prodcutores.
 * - Un productor es cualquier actor que proporciona a la empresa un determinado 
 *   producto,
 * 
 * @author Sergio Sanchez  
 * @version 1.0
 */
public class Productor extends Menus{
    Scanner sc = new Scanner (System.in);
    // atributos que vamos a instanciar en el contructor
    private String nombreProductor;
    private String dni;//primary key
	private Date fecha;// cada año fiscal se determina la extension	
	private double hectareasN;// numero de hectareas 
	//productos en posesion del productor
	private String nombreP;
	private double hectareasP;
	//lista de productos
	protected ArrayList<Productor> listaProductos= new ArrayList<Productor>();
	//valor booleano para saber si esta federado o no
	private boolean federado=false;
	//constructor predefinido
    public Productor() {}
   
    //constructor con parametros
    public Productor(String nombreProductor, String dni, Date fecha, double hectareasN,
			ArrayList<Productor> listaProductos) {
		this.nombreProductor = nombreProductor;
		this.dni = dni;
		this.fecha = fecha;
		this.hectareasN = hectareasN;//es igual al numero de hectareas que vamos guardando en total
	}

    //constructor para listado de productos
    public Productor(String nombreP, double hectareasP) {
    	this.nombreP = nombreP;
    	this.hectareasP = hectareasP;
    };

	private String getNombreProductor() {
		return nombreProductor;
	}
	//getters y setter
	private void setNombreProductor(String nombreProductor) {
		this.nombreProductor = nombreProductor;
	}

	private String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private Date getFecha() {
		return fecha;
	}

	private void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	private double getHectareasN() {
		return hectareasN;
	}

	private void setHectareasN(double hectareasN) {
		this.hectareasN = hectareasN;
	}

	private String getNombreP() {
		return nombreP;
	}

	private void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	private double getHectareasP() {
		return hectareasP;
	}

	private void setHectareasP(double hectareasP) {
		this.hectareasP = hectareasP;
	}

	private boolean isFederado() {
		return federado;
	}

	private void setFederado(boolean federado) {
		this.federado = federado;
	}

	public void crearProductor(ArrayList<Productor> productores){
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		setNombreProductor(sc.nextLine());
		System.out.println(" ");
        System.out.println("Nota: 8 digitos y 1 letra mayuscula");
		System.out.print("DNI:");
		//validamos el dni
		String validaDni = sc.nextLine();
		if (validaDni.length()==9) {
			// Extraer los dígitos y la letra del DNI
	        String digitos = validaDni.substring(0, 8);
	        char letra = validaDni.toUpperCase().charAt(8);
	     // Verificar que los primeros 8 caracteres sean dígitos
	        if (!digitos.matches("[0-9]+")) {
	            System.out.println("error");
	            menuProductos(); //si te equivocas te manda de nuevo
	        }else {setDni(validaDni);}
	        
		}else{
			System.out.println("inserte el formato correcto:");
			validaDni = sc.nextLine();}
		System.out.println(" ");
        
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        formato.setLenient(false);

        while (true) {
            System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
            String fechaStr = sc.nextLine();

            try {
              setFecha(formato.parse(fechaStr));
              break;
            } catch (Exception e) {
              System.out.println("Fecha inválida. Intente de nuevo.");
            }
          }
        
        System.out.println(" ");
        System.out.print("numero de productos que va a plantar: ");
        int numProducto = sc.nextInt();
        
        // Pedir al usuario que ingrese los datos de cada producto y agregarlos a la lista
        for (int i = 0; i < numProducto; i++) {
          // Pedir el nombre del producto
          System.out.println("Ingrese el nombre del producto " + (i+1) + ":");
          setNombreP(sc.next());

          // Pedir el número de hectáreas que ocupa el producto
          System.out.println("Ingrese el numero de hectáreas " + (i+1) + ":");
          setHectareasP(sc.nextDouble());
          
          hectareasN+=hectareasP;
          // Crear un objeto Productor con los datos ingresados y agregarlo a la lista
          Productor listado = new Productor(nombreP, hectareasP);
          listaProductos.add(listado);
        }
        //arraylist donde metemos a todos los productores
        Productor nuevoProductor = new Productor(getNombreProductor(),getDni(),getFecha(),getHectareasN(),listaProductos);
//        productores.add(nuevoProductor);
        
        /**
         * si la suma total de las hectareas que posee es <5 es pequeño productor,
         * en cambio si son mas de cinco se le asigna al gran productor.
         * 
         * - metemos a los productores en dos arraylist distintos para tener una clasificacion de los datos en
         * funcion a la condición del numero de hectareas
         */
        if (getHectareasN()>=limite) {
        	granProductor.add(nuevoProductor);
            productores.add(nuevoProductor);
        	System.out.println("asignado al grupo de grandes productores");
        	
        } else if(getHectareasN()<limite) {
        	String entrada;
        	boolean entradaValida = false;
        	System.out.println("federado ? (s/n): ");
        	while (!entradaValida) {
        	    entrada = sc.nextLine();

        	    if (entrada.toLowerCase().equals("n")) {
        	        setFederado(false);
        	        System.out.println("------------------------------------------");
        	        System.out.println("asignado al grupo de pequenios productores");
        	        productores.add(nuevoProductor);
        	        pequenioProductor.add(nuevoProductor);
        	        entradaValida = true;
        	    } else if (entrada.toLowerCase().equals("s")) {
        	        setFederado(true);
        	        System.out.println("------------------------------------------");
        	        System.out.println("asignado al grupo de productores federados");
        	        productores.add(nuevoProductor);
        	        federadoProductor.add(nuevoProductor);
        	        entradaValida = true;
        	    }
        	}

        }
        System.out.println("--------------------------------");
        System.out.println("****Productor creado***");
        // Imprimir la lista de productos
        System.out.println(nuevoProductor.toString());        
        for (Productor p : listaProductos) {
          System.out.println(p.nombreP + " - " + p.hectareasP + " ha");
        }
        
        System.out.println("--------------------------------");
        System.out.println("volviendo al menu principal");
        System.out.println("--------------------------------");
        menuPrincipal();
	}
		
		

	//metodo para mostrar productor añadido
	public String toString() {		

		return "nombre del productor:"+getNombreProductor()+" |\n "+
				"Dni: "+getDni()+" |\n "+
				"fecha fiscal: "+getFecha().getDay()+"|\n "+
				"hectareas totales: "+getHectareasN()+"|\n "+				
				"listado de prodcutos y hectareas: ";
		
	}
	
	
	//metodo para modificar el productor
	public void modificarProductor() {
		//primero mostramos el productor que hay con sus datos
		int i = 0;  
		for (Productor productores : productores) {
	           System.out.println("En la posicion "+ i + ": ");
	           System.out.println(productores.toString());
	           i++;
	         }
	}
	
	//metodo para eliminar el productor
	public void eliminarProductor() {}
	
	//antes de eliminar o modificar mostramos todos
	public void mostrarProductor() {
		if (productores.isEmpty()) {
			System.out.println("vacio");
		}else {
	       for (Productor productores : productores) {
	           System.out.println(productores.toString());
	         }
		}
	}
	

}
