package Productores;
import java.text.*;
import java.util.ArrayList;

import menus.Menus;

/**
 * Clase producto donde vamos a proceder a crear el producto
 * @author Sergio
 * @version 1.0
 */
public class Productos extends Menus{
   private String nombreP;
   private double precio;
   private double rendimiento;
   private boolean pedecedero = false;

   public Productos() {}
   
   public Productos(String nombreP, double precio, double rendimiento, boolean pedecedero) {
	   this.nombreP = nombreP;
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

   public void insertarProducto() {
       System.out.println("--------------------------------");
		System.out.println("Ha elegido usted insertar un producto");
		System.out.println("para ingresar datos enteros, use la ,");
		
		System.out.print("Nombre del producto: ");
		setNombreP(sc.nextLine());
		System.out.println(" ");
		
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
        } else if(entrada.toLowerCase().equals("n") || entrada.toLowerCase().equals("s")) {
        	System.out.println("inserte un dato valido");
        	entrada= sc.nextLine();
        }
       //lo insertamos en un arraylist 
       Productos nuevoProducto = new Productos(getNombreP(),getPrecio(),getRendimiento(), isPedecedero());
       productos.add(nuevoProducto);

       System.out.println("--------------------------------");
       System.out.println("****Producto insertado****");
       System.out.println(productos);
       System.out.println("--------------------------------");
       System.out.println("volviendo al menu principal");
       menuPrincipal();
	}
    
	public void mostrarProductos() {
	  for (int i = 0; i < productos.size(); i++) {
		  Productos e = productos.get(i);
		System.out.println(e);
	  }
   }
	
 	public String toString() {
 		return "nombre del producto: "+getNombreP()+"  |\n "+
 				"precio el kilogramo: "+getPrecio()+" € |\n "+
 				"rendimiento por hectarea: "+getRendimiento()+" |\n "+
 				"pedecedero: "+isPedecedero();
 		
 	}
}
