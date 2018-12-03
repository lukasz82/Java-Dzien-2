public class Zad_3_3
{
    public static void main(String[] args)
    {
        String in = args[0];
        System.out.println("Wpisales " + in + " a jest to: " + Convert(in));

        int tab[] = {1,2,3,4};

        try {
            System.out.println(tab[5]);
        } catch (Exception e)
        {
            System.out.println("Wyszedles poza rozmiar tablicy " + e);
        }

    }

        static long Convert(String var) {
            long x = 0;
            switch (var) {
                case "Jeden":
                    x = 1;
                    break;
                case "Dwa":
                    x = 2;
                    break;
                case "Trzy":
                    x = 3;
                    break;
                case "Cztery":
                    x = 4;
                    break;
                case "Pięć":
                    x = 5;
                    break;
                case "Sześć":
                    x = 6;
                    break;
                case "Siedem":
                    x = 7;
                    break;
                case "Osiem":
                    x = 8;
                    break;
                case "Dziewięć":
                    x = 9;
                    break;
                case "Dziesięć":
                    x = 10;
                    break;
                default:
                    System.out.println("nie rozpoznałem liczby");
                    break;
            }
            return x;
        }

}
