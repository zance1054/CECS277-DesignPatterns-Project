/**
 * Created by alexanderfielding on 12/6/17.
 */
public class RoachMotel
{
    public RoachMotel()
    {

    }

    public RoachMotel(int size)
    {
        capacity = size;
    }

    public String Vacancy()
    {
        if(currentsize == capacity)
        {
            return "No Vacancy";
        }
        else
        {
            return "Vacancy";
        }
    }

    public static int capacity;
    public int currentsize;
}
