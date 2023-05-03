package Productores;
/**
 * clase PequenioProductor que como su nombre indica, es una clase 
 * para moldear a aquellos productores que cumple el requisito de 
 * 5 hectareas menor o igual a 5.
 * 
 * @author Sergio Sanchez
 * @version 1.0
 */
public class PequenioProductor extends Productor{
    //pueden tener como maximo cinco productos diferentes
    String producto[]= new String[10];
    //declaramos, instanciamos y damos el tamanio
    
    //constructor
    public PequenioProductor(String nombreP, String dni, int hectareas, boolean federado, boolean pequenio, String Producto) {
        super();
        
    }
    public void setProductos() {
        for (int i = 0; i < producto.length; i++) {
            producto[i]=sc.nextLine();
        }
    }



    
    
}
