
/**
 * 09.02 Class Hierarßchies
 * 4-12-2021
 * Ryan Wagnerß
 */
public class GameTerrainTester
{
    public static void main(String[] args){
    
        Terrain t = new Terrain(150, 240);
        Forest f = new Forest(400, 400, 180);
        Mountain m = new Mountain(600, 200, 12);
        WinterMountain w = new WinterMountain(500, 500, 30, 12);
        
        System.out.println(t.getTerrainSize());
        System.out.println("\nForest " + f.getTerrainSize() + " and has " + f.getTrees() + " trees");
        System.out.println("\nMountain " + m.getTerrainSize() + " and has " + m.getMountains() + " mountains");
        System.out.println("\nWinter Mountain " + w.getTerrainSize() + " and has " + w.getMountains() + " mountains and the temperature is " + w.getTemp() + " degrees");
    }
}
