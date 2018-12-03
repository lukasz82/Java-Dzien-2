public class WszystkieElZTabl
{
    public static void main(String[] args) {
        int[][][] array = {{{1},{1,2,3}},{{1,2},{2},{5}}};

        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0; j < array[i].length;j++)
            {
                for ( int x = 0; x < array[i][j].length;x++)
                {
                    System.out.print( "[" + i + "]" + "[" + j + "]" + "[" + x + "] ");
                    System.out.print(array[i][j][x]);
                    System.out.println(" ");
                }
            }
        }
    }
}
