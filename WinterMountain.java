
/**
 * 09.02 Class Hierachies
 * 4-12-2021
 * Ryan Wagner
 */
public class WinterMountain extends Mountain
{
    // instance variables - replace the example below with your own
    private int temp;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int mountains, int temp)
    {
        // initialise instance variables
        super(l, w, mountains);
        
        this.temp = temp;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getTemp()
    {
        // put your code here
        return temp;
    }
}
