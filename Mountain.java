
/**
 * 09.02 Class Hierachies
 * 4-12-2021
 * Ryan Wagner
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int mountains;

    /**
     * Constructor for objects of class Mountain
     */
    public Mountain(int l, int w, int mountains)
    {
        // initialise instance variables
        super(l, w);
        
        this.mountains = mountains;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getMountains()
    {
        // put your code here
        return mountains;
    }
}
