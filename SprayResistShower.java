/**
 * Created by alexanderfielding on 12/6/17.
 */
public class SprayResistShower extends RoomDecorater
{
    public static final double cost = 25.00;
    public Amenities room;

    @Override
    public double cost() {
        return room.cost() + cost;
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with a Spray Resistant Shower";
    }

    public SprayResistShower(Amenities rm)
    {
        room = rm;
    }
}
