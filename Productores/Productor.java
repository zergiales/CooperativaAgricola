package Productores;
import java.util.*;

import menus.Menus;
import productos.Productos;

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
    
    private String nombreProductor;
    private String dni;//primary key
	private double hectareasN;// numero de hectareas 
	private boolean federado;

	//productos en posesion del productor
	private String nombreP;
	private double hectareasP;
	//lista de productos
	protected ArrayList<Productor> listaProductos= new ArrayList<Productor>();
	//constructor predefinido
    public Productor() {}
   
    //constructor con parametros
    /**
     * @param nombreProductor
     * @param dni
     * @param hectareasN
     * @param federado
     * @param listaProductos
     */
    public Productor(String nombreProductor, String dni, double hectareasN, boolean federado,
    		ArrayList<Productor> listaProductos) {
    	this.nombreProductor = nombreProductor;
    	this.dni = dni;
    	this.hectareasN = hectareasN;
    	this.federado = federado;
    	this.listaProductos = listaProductos;
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

	protected ArrayList<Productor> getListaProductos() {
		return listaProductos;
	}

	protected void setListaProductos(Productor productor) {
		listaProductos = null;
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
		boolean dniValido = false;
		while (!dniValido) {
		    setDni(sc.nextLine());
		
		    if (getDni().length() == 9 && getDni().substring(0, 8).matches("[0-9]+") &&
		            Character.isUpperCase(getDni().charAt(8))) {
		        dniValido = true;
		    } else {
		        System.out.println("DNI inválido. Ingrese el formato correcto (8 dígitos y 1 letra mayúscula).");
		    }
		}
		
		
		System.out.println(" ");
        
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
          
          
          // Verificar si el nombre del producto ya existe en la listaProductos
          boolean nombreRepetido = false;
          for (Productor productor : listaProductos) {
              if (productor.getNombreP().equals(nombreP)) {
                  nombreRepetido = true;
                  break;
              }
          }

          // Si el nombre está repetido, solicitar nuevamente el ingreso
          if (nombreRepetido) {
              System.out.println("El nombre del producto ya existe. Por favor, ingrese otro nombre.");
              i--;  // Retroceder una iteración para ingresar nuevamente los datos
              continue;  // Saltar a la siguiente iteración del bucle
          }
          
          
          hectareasN+=hectareasP;
          // Crear un objeto Productor con los datos ingresados y agregarlo a la lista
          Productor listado = new Productor(nombreP, hectareasP);
          listaProductos.add(listado);
        }
        
        /**
         * si la suma total de las hectareas que posee es <5 es pequeño productor,
         * en cambio si son mas de cinco se le asigna al gran productor.
         * 
         * - metemos a los productores en dos arraylist distintos para tener una clasificacion de los datos en
         * funcion a la condición del numero de hectareas
         */
        //arraylist donde metemos a todos los productores
        Productor nuevoProductor = new Productor(getNombreProductor(),getDni(),getHectareasN(),isFederado(),listaProductos);
        if (getHectareasN()>=5) {
        	granProductor.add(nuevoProductor);
            productores.add(nuevoProductor);
        	System.out.println("asignado al grupo de grandes productores");
        	
        } else if(getHectareasN()<5) {
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
	
	//metodo para cargar objetos de tipo productor con productos
	public void cargarProductores() {
		Productor productor1 = new Productor("productor1", "12345678A", 4, false,getListaProductos());
	    Productor productor2 = new Productor("productor2", "12345678A", 4, true, new ArrayList<>());
		Productor productor3 = new Productor("productor3", "12345678B", 5, false,getListaProductos());
		Productor productor4 = new Productor("productor4", "12345678C", 6, false,new ArrayList<>());
		//para insertar los productos en el productor 1 PEQUEÑO
		productor1.setListaProductos(new Productor("tomate", 3));
		productor1.setListaProductos(new Productor("alcachofa", 1));
		// Para insertar los productos en el productor 2 FEDERADO
	    productor2.getListaProductos().add(new Productor("cebolla", 2));
	    productor2.getListaProductos().add(new Productor("trigo", 2));
		//para insertar los productos en el productor 3 GRAN PRODUCTOR
		productor3.setListaProductos(new Productor("maiz", 2));
		productor3.setListaProductos(new Productor("alcachofa", 1));
		productor3.setListaProductos(new Productor("lentejas", 3));
		//para insertar los productos en el productor 4 GRAN PRODUCTOR
		productor1.setListaProductos(new Productor("ajo", 6));
		System.out.println("objetos creados de la clase productor");
		
	}

}
