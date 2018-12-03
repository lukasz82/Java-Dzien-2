public class HalfDolars
{
    public static void main(String[] args)
    {
        int [] denver = {1_700_000, 4_600_000, 2_100_000};
        int [] philadelphia = new int [denver.length];
        int [] total = new int [denver.length];
        int average = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 1_800_000;

        for (int i = 0; i < philadelphia.length; i++)
        {
            total[i] = denver[i] + philadelphia[i];
            average += total[i];
        }

        average = average / 3;

        int year = 2012;
        for (int i = 0; i < total.length; i++)
        {
            System.out.print("ś".toUpperCase() + "rednia Produkcja w " + year + "r wynosiła: ");
            System.out.format("%,d%n", total[i]);
            year++;
        }

        System.out.print("ś".toUpperCase() + "rednia Produkcja wynosiła: ");
        System.out.format("%,d%n", average);

        int [][][] arr3d = new int [4][][];
        arr3d[0] = new int [10][];
        arr3d[0][0] = new int [5];

    }
}
