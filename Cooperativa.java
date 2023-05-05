import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner; //importamos la clase scanner
/**
 * Clase main desde la cual se gestiona la aplicacion de la cooperativa agricola
 * 
 * @author Sergio 
 * @version 1.0 
 */
public class Cooperativa extends Menus{
    
    
    public static void main(String [] args){
        ArrayList<Productos> listaProductos = new ArrayList<>(); 
        //objetos productor
        Productor productor1 = new Productor();
        Productor prodcutor2 = new Productor();
        Productor prodcutor3 = new Productor();
        //objeto productos 
        Productos producto1 = new Productos("tomate", 4,1);
        Productos producto2 = new Productos("alcachofa", 5.99,0.1);
        Productos producto3 = new Productos("cebolla", 3.01,0.1);
        
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        
        int puntero;
        Scanner sc= new Scanner(System.in);        
        Cooperativa coop = new Cooperativa(); //creamos instancia y llamamos al metodo de la clase abstracta
        Productor productor = new Productor();        
        Distribuidores distribuidores = new Distribuidores();
        Logistica logistica= new Logistica();
        ConsumidorFinal consumidor= new ConsumidorFinal(); 
        System.out.print("---------Menu de cooperativa agricola--------"+
        " \n Inserte nombre de usuario:");
        String nombre = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Bienvenido: "+nombre);
        //metodo que gestiona los metodos de cada opcion del menu
        coop.menuPrincipal();
        
    }
    
    
      
}
