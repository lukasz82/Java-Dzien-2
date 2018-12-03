public class Petle {

    public static void main(String[] args) {

        int a = -7;

        if (a > 3) {
            System.out.println("a jest większe");
        } else if (a < 3)
        {
            System.out.println("a jest mniejsze");
        } else {
            System.out.println("nie wiem");
        }

        char ocena = 'O';

        switch (ocena) {
            case 'A' :
                System.out.println("Piatka");
                break;
            case 'B' :
                System.out.println("Czworka");
                break;
            case 'C' :
                System.out.println("Trojka");
                break;
            case 'D' :
                System.out.println("Dwoja");
                break;
            default :
                System.out.println("Brak obecnosci");
                break;
        }

    }
}
