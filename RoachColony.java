/**
 * Alexander Fielding
 * CECS 277
 * Roach Class
 * Purpose: a roach object that will be staying in our Roach Motel
 * Input: N/A
 * Output: A roach Object
 */
public class RoachColony
{
    public RoachColony()
    {

    }

    public RoachColony(String n, int size, double rate)
    {
        name = n;
        initialpop = size;
        growthrate = rate;
    }

    public String toString()
    {
        return name + " ,roach colony with initial population of" +
                " " + initialpop + " and growth rate: " + growthrate;
    }

    private static String name;
    private static int initialpop;
    private double growthrate;
}