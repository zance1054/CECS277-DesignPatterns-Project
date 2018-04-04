/**
 * Created by alexanderfielding on 12/6/17.
 */
public class Autorefill extends Amenities
{
    public static final double cost = 5.00;

    protected Amenities room;

    @Override
    public double cost() {
        return room.cost() + cost;
    }

    public String getDescription()
    {
        return room.getDescription() + " with Auto Refill";
    }

    public Autorefill(Amenities rm)
    {
        room = rm;
    }
}
