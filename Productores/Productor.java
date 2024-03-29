package Productores;
import java.util.*;

import menus.Menus;
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
    private String dni; //identificador (opcional)
	public double hectareasN;//numero de hectareas del productor
	public boolean isFerederado = false; //por defecto es falso todos los productores que creamos 
	
	//sin parametros
	public Productor() {
	}
	
	/**
	 * constructor con parametros
	 * 
	 * @param nombreProductor
	 * @param dni
	 * @param hectareasN
	 * @param listaProductos
	 */
	public Productor(String nombreProductor, String dni, double hectareasN, ArrayList<Productos> listaProductos) {
		this.nombreProductor = nombreProductor;
		this.dni = dni;
		this.hectareasN = hectareasN;
		this.listaProductos = listaProductos; //lista de los productos que tenemos en la clase productos
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


	public double getHectareasN() {
		return hectareasN;
	}

	public void setHectareasN(double hectareasN) {
		this.hectareasN = hectareasN;
	}
	
	//get && set del arraylist de la clase productos
	
	public boolean isFerederado() {
		return isFerederado;
	}

	public void setFerederado(boolean isFerederado) {
		this.isFerederado = isFerederado;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	//metodo para crear productor
	public void crearProductor(ArrayList<Productor> productores){
        System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un productor");
		System.out.print("Nombre del productor: ");
		setNombreProductor(sc.nextLine());
		System.out.println(" ");
        System.out.println("Nota: 8 digitos y 1 letra mayuscula");
		System.out.print("DNI:");
		
		//validacion del dni
		boolean dniValido = false;
		while (!dniValido) {
		    setDni(sc.nextLine());
		
		    if (getDni().length() == 9 && getDni().substring(0, 8).matches("[0-9]+") &&
		            Character.isUpperCase(getDni().charAt(8))) {
		        dniValido = true;
		    } else {
		        System.out.println("DNI inv�lido. Ingrese el formato correcto (8 d�gitos y 1 letra may�scula).");
		    }
		}
		//proceso insertar productor
		
		Productos productos = new Productos();
		productos.insertarProducto(productores);		
		
		//objeto que insertamos en el arraylist
        Productor nuevoProductor = new Productor
        (getNombreProductor(),getDni(),getHectareasN(),listaProductos);
        
        
        System.out.println("llega hasta aqui");
        System.out.println(nuevoProductor.getNombreProductor());
        System.out.println("------------------------------");
        
        
        if (getHectareasN()>=5) {
        	granProductor.add(nuevoProductor); //GRAN PRODUCTOR
            productores.add(nuevoProductor);
        	System.out.println("asignado al grupo de grandes productores");
        	
        } else if(getHectareasN()<5) {
        	//Validamos si los cinco productos que hemos introducido son diferentes
        	boolean nombreRepetido = false;
        	System.out.println("comprobando que ningun producto este repetido...");
            
    
        	for (Productos productos : listaProductos) {   
        		System.out.println("aqui entra");
        	}
        		//if (productor.getNombreP().equals(nombreProductor)) {
//                    nombreRepetido = true;
//                    break;
//                }
            }

        	String entrada;
        	boolean entradaValida = false;
        	System.out.println("federado ? (s/n): ");
        	
        	while (!entradaValida) {
        	    entrada = sc.nextLine();

        	    if (entrada.toLowerCase().equals("n")) {
        	        setFerederado(false);
        	        System.out.println("------------------------------------------");
        	        System.out.println("asignado al grupo de pequenios productores");
        	        productores.add(nuevoProductor);
        	        pequenioProductor.add(nuevoProductor);
        	        entradaValida = true;
        	    } else if (entrada.toLowerCase().equals("s")) {
        	        setFerederado(true);
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
		//productor 1
		
		Productor productor1 = new Productor("nombre1", "12345678E", 4, listaProductos);
		productor1.getListaProductos();
	    productor1.getListaProductos();

	    // Agregamos los productores al ArrayList productores
	    productores.add(productor1);

		System.out.println("objetos creados de la clase productor");
		System.out.println(productores.toString());
	}

	//metodo para mostrar productor insertado
	public String toString() {		
	    String result = "Nombre del productor: " + nombreProductor + "\n";
	    result += "DNI: " + dni + "\n";
	    result += "Hectareas totales: " + hectareasN + "\n";
	    // result += "Federado: " + federado + "\n";
	    result += "Lista de productos: \n";

	    //bucle fr each
	    // for (Productor p : listaProductos) {
	        // result += "Nombre del producto: " + p.getNombreP() + "\n";
	        // result += "Ha ocupadas: " + p.getHectareasP() + "\n";
	    // }

	    result += "---------------------------" + "\n";
	    return result;

	}
}
