import java.awt.*;

public class Tablice
{
    public static void main(String[] args)
    {
        int [] tab = new int [100];

        Point[] points = {new Point(1,1), new Point(1,2) ,new Point(1,4)};
        System.out.println(points[0].x);

        String [] titles = {"Jeden", "Dwa", "Trzy"};
        System.out.println(titles[2]);

        System.out.println(titles.length);

    }
}
