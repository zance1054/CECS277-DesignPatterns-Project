/**
 * Created by alexanderfielding on 12/6/17.
 */
public class HotelRoom extends Amenities
{
    public HotelRoom()
    {

    }

    public HotelRoom(int size)
    {
        occupants = size;
    }

    public String getDescription()
    {
        return "A Hotel Room";
    }

    public double cost()
    {
        return cost;
    }

    private static final double cost = 50.00;
    private int occupants;
}
