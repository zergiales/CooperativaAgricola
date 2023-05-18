package Productores;
import java.util.*;

import menus.Menus;
import productos.Productos;

import java.io.*;
import java.text.*;
 import productos.Productos;
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
	public double hectareasN;// numero de hectareas 
	//arraylist productos
	protected ArrayList<Productos> listaProductos = new ArrayList<Productos>();
		
	public Productor() {}
	
	/**
	 * @param nombreProductor
	 * @param dni
	 * @param hectareasN
	 * @param listaProductos
	 */
	public Productor(String nombreProductor, String dni, double hectareasN, ArrayList<Productos> listaProductos) {
		super();
		this.nombreProductor = nombreProductor;
		this.dni = dni;
		this.hectareasN = hectareasN;
		this.listaProductos = listaProductos;
	}
	// GETTERS Y SETTERS

	public String getNombreProductor() {
		return nombreProductor;
	}

	public void setNombreProductor(String nombreProductor) {
		this.nombreProductor = nombreProductor;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setHectareasN(double hectareasN) {
		this.hectareasN = hectareasN;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
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
		//metodo para insertarProducto 
		Productos productos = new Productos();
		productos.insertarProducto(productores);		
		
        
    

        
        
        /**
         * si la suma total de las hectareas que posee es <5 es pequeño productor,
         * en cambio si son mas de cinco se le asigna al gran productor.
         * 
         * - metemos a los productores en dos arraylist distintos para tener una clasificacion de los datos en
         * funcion a la condición del numero de hectareas
         */
//        //arraylist donde metemos a todos los productores
//        Productor nuevoProductor = new Productor(getNombreProductor(),getDni(),getHectareasN1(),isFederado(),listaProductos);
//        if (getHectareasN()>=5) {
//        	granProductor.add(nuevoProductor); //GRAN PRODUCTOR
//            productores.add(nuevoProductor);
//        	System.out.println("asignado al grupo de grandes productores");
//        	
//        } else if(getHectareasN1()<5) {
//        	//Validamos si los cinco productos que hemos introducido son diferentes
//        	boolean nombreRepetido = false;
//        	System.out.println("comprobando ningun producto este repetido...");
//            for (Productor productor : listaProductos) {
//                if (productor.getNombreP().equals(nombreP)) {
//                    nombreRepetido = true;
//                    break;
//                }
//            }
//        	String entrada;
//        	boolean entradaValida = false;
//        	System.out.println("federado ? (s/n): ");
//        	while (!entradaValida) {
//        	    entrada = sc.nextLine();
//
//        	    if (entrada.toLowerCase().equals("n")) {
//        	        setFederado(false);
//        	        System.out.println("------------------------------------------");
//        	        System.out.println("asignado al grupo de pequenios productores");
//        	        productores.add(nuevoProductor);
//        	        pequenioProductor.add(nuevoProductor);
//        	        entradaValida = true;
//        	    } else if (entrada.toLowerCase().equals("s")) {
//        	        setFederado(true);
//        	        System.out.println("------------------------------------------");
//        	        System.out.println("asignado al grupo de productores federados");
//        	        productores.add(nuevoProductor);
//        	        federadoProductor.add(nuevoProductor);
//        	        entradaValida = true;
//        	    }
//        	}
//
//        }

        System.out.println("--------------------------------");
        System.out.println("****Productor creado***");
        // Imprimir la lista de productos
        
        System.out.println(nuevoProductor.toString());        
        System.out.println("--------------------------------");
        System.out.println("volviendo al menu principal");
        System.out.println("--------------------------------");
        menuPrincipal();
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
	public void cargarProductores(ArrayList<Productor> productores) {
		//creacion del productor 1
		Productor productor1 = new Productor("productor1", "12345678A", 4, false,new ArrayList<>());
		productor1.getListaProductos().add(new Productor("tomate", 3));
	    productor1.getListaProductos().add(new Productor("alcachofa", 1));

	    // Creación del productor 2
	    Productor productor2 = new Productor("productor2", "12345678B", 5, true, new ArrayList<>());
	    productor2.getListaProductos().add(new Productor("cebolla", 2));
	    productor2.getListaProductos().add(new Productor("trigo", 2));

	    // Agregamos los productores al ArrayList productores
	    productores.add(productor1);
	    productores.add(productor2);

		System.out.println("objetos creados de la clase productor");
		System.out.println(productores.toString());
	}

	//metodo para mostrar productor añadido
	public String toString() {		
	    String result = "Nombre del productor: " + nombreProductor + "\n";
	    result += "DNI: " + dni + "\n";
	    result += "Hectareas totales: " + hectareasN + "\n";
	    result += "Federado: " + federado + "\n";
	    result += "Lista de productos: \n";

	    for (Productor p : listaProductos) {
	        result += "Nombre del producto: " + p.getNombreP() + "\n";
	        result += "Ha ocupadas: " + p.getHectareasP() + "\n";
	    }

	    result += "---------------------------" + "\n";
	    return result;

	}
}
