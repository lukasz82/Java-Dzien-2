import java.awt.*;

public class RefTester
{
    public static void main(String[] args)
    {
        Point pt1, pt2;

        pt1 = new Point(100,100); // Przypisanie referencji do zmienej pt1
        pt2 = pt1; // przypisanie referencji pt1 do pt2

        pt1.x = 200;
        pt1.y = 200;

        System.out.println("Puntk 1: " + pt1.x + " : " + pt1.y);
        System.out.println("Puntk 2: " + pt2.x + " : " + pt2.y);
    }
}
