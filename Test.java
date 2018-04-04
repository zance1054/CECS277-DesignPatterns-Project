/**
 * Created by alexanderfielding on 12/6/17.
 */
public class Test
{
    public static void main(String[] args)
    {
        Amenities myroom = new HotelRoom();

        myroom = new foodbar(myroom);
        myroom = new Spa(myroom);
        myroom = new Autorefill(myroom);
        myroom = new SprayResistShower(myroom);

        System.out.println(myroom.getDescription());
        System.out.println(myroom.cost());
    }
}
