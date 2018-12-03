import java.util.Locale;

public class StringFormater
{
    public static void main(String[] args)
    {
        int accountBallance = 15_005;
        System.out.printf("Saldo = %,d zł %n", accountBallance );
        double pi = Math.PI;
        System.out.printf(new Locale("pl"),"PI = %.11f%n", pi);

    }
}
