/**
 * Created by alexanderfielding on 12/6/17.
 */
public class foodbar extends RoomDecorater
{
    public static final double cost = 10.00;
    protected Amenities room;

    @Override
    public double cost() {
        return room.cost() + cost;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with a Food Bar";
    }

    public foodbar(Amenities rm)
    {
        room = rm;
    }
}
