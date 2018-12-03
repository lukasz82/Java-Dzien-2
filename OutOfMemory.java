public class OutOfMemory
{
    public static void main(String[] args) {
        int i = 999;
        long [][][] arr = new long[i][i][i];
    }
}
