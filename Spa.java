/**
 * Created by alexanderfielding on 12/6/17.
 */
public class Spa extends RoomDecorater
{
    public static final double cost = 20.00;
    protected Amenities room;

    @Override
    public double cost() {
        return room.cost() + cost;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with a Spa";
    }

    public Spa(Amenities rm)
    {
        room = rm;
    }
}
