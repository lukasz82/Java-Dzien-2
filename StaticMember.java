public class StaticMember
{
    public static void main(String[] args)
    {
        FamilyMember dad = new FamilyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamilyMember mom = new FamilyMember();
        mom.name = "Anna";
        mom.age = 31;

        FamilyMember kid = new FamilyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(dad);
        show(mom);
        show(kid);
    }

    static void show(FamilyMember f)
    {
        System.out.println("Imie: " + f.name + " Nazwisko: " + f.surname + " Wiek: " + f.age);
    }
}

class FamilyMember
{
    static String surname = "Nowak";
    String name;
    int age;
}
