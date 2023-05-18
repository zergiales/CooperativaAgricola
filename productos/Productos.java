package productos;
import java.text.*;
import java.util.*;

import Productores.Productor;
import menus.Menus;

/**
 * Clase producto donde vamos a proceder a crear el producto
 * @author Sergio
 * @version 1.0
 */
public class Productos extends Menus{
   private String nombreP;
   private double hectareasP;//hectareas que ocupa el producto
   private double precio;
   private double rendimiento;
   private boolean pedecedero = false;
   Scanner sc = new Scanner (System.in);

   public Productos() {}
   
   public Productos(String nombreP,double hectareasP, double precio, double rendimiento, boolean pedecedero) {
	   this.nombreP = nombreP;
	   this.hectareasP = hectareasP;
	   this.precio = precio;//x kg
	   this.rendimiento = rendimiento;// x hectarea
	   this.pedecedero = pedecedero; //para la clase logistica
   }
   //getters y setters
   
   private String getNombreP() {
	return nombreP;
   }

   private void setNombreP(String nombreP) {
	this.nombreP = nombreP;
   }

   protected double getHectareasP() {
	return hectareasP;
	}
	
	protected void setHectareasP(double hectareasP) {
		this.hectareasP = hectareasP;
	}

private double getPrecio() {
	return precio;
   }

   private void setPrecio(double precio) {
	this.precio = precio;
   }

   private double getRendimiento() {
	return rendimiento;
   }

   private void setRendimiento(double rendimiento) {
	this.rendimiento = rendimiento;
   }

   private boolean isPedecedero() {
	return pedecedero;
   }

   private void setPedecedero(boolean pedecedero) {
	this.pedecedero = pedecedero;
   }
   

   public void insertarProducto(ArrayList<Productor> productores) {
       System.out.println("--------------------------------");
       System.out.print("numero de productos que va a plantar: ");
       int numProducto = sc.nextInt();
       
       //bucle for
       for (int i = 0; i < numProducto; i++) {
         // Pedir el nombre del producto
         System.out.println("nombre del producto " + (i+1) + ":");
         String entradaN = sc.nextLine();
         setNombreP(entradaN);
     
         
         // Pedir el número de hectáreas que ocupa el producto
         System.out.println("Ingrese el numero de hectáreas " + (i+1) + ":");
         setHectareasP(sc.nextDouble());
         
         double total=0;
         total+= hectareasP;
         //constructor productor
         Productor productor = new Productor();
         productor.setHectareasN(total);
         System.out.print("Ingrese el precio por kilogramo: ");
         setPrecio(sc.nextDouble());
  
         System.out.print("inserte el rendimiento por hectarea del producto: ");
         setRendimiento(sc.nextDouble());

         System.out.print("pedecedero s o n?: ");
         String entrada = sc.nextLine();
         //transformamos el s o n en valor booleano  
         if(entrada.toLowerCase().equals("n")) {
        	setPedecedero(true);
         }else if(entrada.toLowerCase().equals("s")) {
        	 setPedecedero(false);
        }else if(entrada.toLowerCase().equals("n") || entrada.toLowerCase().equals("s")) {
        	System.out.println("inserte un dato valido");
        	entrada= sc.nextLine();
        }

       //lo insertamos en un arraylist 
       Productos nuevoProducto = new Productos(getNombreP(),getHectareasP(), getPrecio(),getRendimiento(),isPedecedero());
       productores.add(nuevoProducto);
     }
       System.out.println("añadimos los productos creados al productor");
       Productor.
       Productor nuevoProductor = new Productor(getNombreProductor(),getDni(),productores);
       productores.add(nuevoProductor);

   
       
       System.out.println("--------------------------------");
       System.out.println("**** Productos insertado****");
       System.out.println(toString());
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}

	
	//metodo para mostrar los productos añadido
		public String toString() {	
			
		    String result = "Lista de productos: \n ";
		    for (Productos  productos : listaProductos) {
		    	result += "Nombre del producto: " + productos.getNombreP() + "\n";
		    	result += "Ha ocupadas: " + productos.getHectareasP() + "\n";
		    }
		    result += "numero de hectareas: " + getHectareasP() + "\n";
		  


		    result += "---------------------------" + "\n";
		    return result;

		}
}
