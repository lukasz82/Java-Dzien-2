public class ObiektyPorownanie
{
    public static void main(String[] args)
    {
        {
            byte a = 7;
            short b;
            int c;

            c = a;
            b = (short) c;
        }

        {
            int a = 5;
            double b = 13.5;
            int c = (int)b/a;
            System.out.println(c);
        }

        {
            Float f1 = 12.5F;
            Float f2 = 2.2F;
            System.out.println(Math.min(f1,f2));
        }

        Employes emp = new Employes();
        VicePresident vp = new VicePresident();
        emp = vp; // vp ma więcej metod niż emp, dlatego nie mogę podstawic do emp takiej klasy
        vp = (VicePresident)emp; // tak nie powinno się robić

    }
}

class Employes{}
class VicePresident extends Employes{}


