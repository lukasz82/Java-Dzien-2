import java.util.StringTokenizer;

public class Zadanie3_2
{
    public static void main(String[] args)
    {
        String dataUrodzin = "29/04/2016";

        StringTokenizer st1;

        st1 = new StringTokenizer(dataUrodzin, "/");
        System.out.println("Dzien : " + st1.nextToken());
        System.out.println("MIesiac : " + st1.nextToken());
        System.out.println("Rok : " + st1.nextToken());

        System.out.println(" ************* Points ***************");

        Points p = new Points(100,200,50, "p");
        p.showStatus();
        p.changePositions(200,100,40);
        p.showStatus();

        Points.showInstances();

        Points p2 = new Points(300,200,300, "p2");
        p2.showStatus();
        p2.changePositions(20,10,40);
        p2.showStatus();

        Points.showInstances();

        Points a[] = new Points[2];
        a[0] = p;
        a[1] = p2;

        a[0].showStatus();
        a[1].showStatus();

    }
}

class Points
{
    int height;
    int weight;
    int depth;
    static int counter = 0;
    String objName;

    Points (int h, int w, int d, String name)
    {
        this.height = h;
        this.weight = w;
        this.depth = d;
        this.objName = name;
        this.counter++;
    }

    void changePositions(int h, int w, int d)
    {
        this.height = h;
        this.weight = w;
        this.depth = d;
    }

    void showStatus()
    {
        System.out.println(objName + " : " + " : h/w/d/ " + this.height + ", "+ this.weight + ", "+ this.depth);
    }

    public static void showInstances ()
    {
        System.out.println("Instanji klasy jest: " + counter);
    }

}
