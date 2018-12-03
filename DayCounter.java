public class DayCounter
{
    public static void main(String[] args)
    {
        int year = 2018;
        int month = 12;

        if (args.length > 0)
        {
            month = Integer.parseInt(args[0]);
        }

        if (args.length > 1)
        {
            year = Integer.parseInt(args[1]);
        }

        for (int i = 1; i <= month; i++)
        {
            System.out.print(i + "/" + year + " ma " + countDays(i, year));
            int howManyDays = countDays(i, year);
            System.out.print(" i miesiac " + i + " ma takie daty: ");
            for (int j = 1; j <= howManyDays;j++)
            {
                System.out.print( j + "/" + i + "/" + year + " , ");
            }
            System.out.println(" ");
        }

    }
    static int countDays(int month, int year)
    {
        int count = -1;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
            case 2:
                if (year % 4 == 0)
                {
                    count = 29;
                } else {
                    count = 28;
                }
                if ( (year % 100 == 0) && (year % 400 != 0)) {
                    count = 28;
                }
        }

        return count;
    }
}
