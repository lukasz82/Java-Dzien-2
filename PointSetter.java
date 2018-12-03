import java.awt.*;

public class PointSetter
{
    public static void main(String[] args)
    {
        Point location = new Point(4,13);
        show(location);
        changePoint(location,7,6,"Zmiana lokacji na 7,6 ");
        show(location, "Pozycja po zmianie ");
        PointSetter.changePoint(location, 10,10,"Zmiana pozycji na 10, 10 ");
    }

    static void show(Point location)
    {
        System.out.println("Pozycja " + location.x + " : " + location.y);
    }

    static void show(Point location, String opis)
    {
        System.out.println(opis + "Pozycja " + location.x + " : " + location.y);
    }

    static void changePoint(Point location, int x, int y, String opis)
    {
        location.x = x;
        location.y = y;
        System.out.println(opis + "Pozycja " + location.x + " : " + location.y);

    }
}
