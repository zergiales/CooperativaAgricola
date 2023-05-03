package Productores;
/**
 * Clase GranProductor, como su propio indica, es para aquellos productores
 * que son grandes y cumple por tanto hectareas>5
 * 
 * 
 * @author Sergio
 * @version (a version number or a date)
 */
public class GranProductor extends Productor
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GranProductor
     */
    public GranProductor()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
