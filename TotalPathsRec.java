import java.util.*;
public class TotalPathsRec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = in.nextInt();
        System.out.println("The total paths from top left to bottom right are: " + totalPaths(0, 0, m, n));
        in.close();
    }
    public static int totalPaths(int i, int j, int m, int n)
    {
        if (i == m - 1 || j == n - 1)
        {
            return 1;
        }
        if (i == m || j == n)
        {
            return 0;
        }
        int downpaths = totalPaths(i + 1, j, m, n);
        int rightpaths = totalPaths(i, j + 1, m, n);
        return downpaths + rightpaths;
    }
}