public class EqualsTester
{
    public static void main(String[] args)
    {
        {
            String str1, str2, str3, str4;

            str1 = "raz dwa trzy";
            str2 = str1;
            str3 = new String("raz dwa trzy");
            str4 = "raz dwa trzy";

            System.out.println(str1 == str2); // porównuje czy są to te same obiekty (adres)
            System.out.println(str1 == str3); // porównuje czy są to te same obiekty (adres)
            System.out.println(str1 == str4); // porównuje czy są to te same obiekty (adres)
            System.out.println(str1.equals(str3)); // porównuje czy są to te same obiekty (obiekt faktycznie)
        }
        {
            String name = "Tomek";
            System.out.println(name.getClass().getName()); // pobieramy co to za klasa i jak się nazywa
            System.out.println(name.getClass());
            System.out.println(name.getClass().getSimpleName()); // pobieram typ
            System.out.println(name instanceof  String); // czy jest typem string?
            System.out.println(name instanceof  Object); // czy jest obiektem

            Object object = new String();
            object = "aaa";
            System.out.println(object instanceof  Integer);
        }
    }
}
