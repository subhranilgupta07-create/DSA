import java.util.*;

public class TowerOfHanoi
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int n = in.nextInt();
        TowerofHanoi(n, "S", "H", "D");
    }
    public static void TowerofHanoi(int n, String S, String H, String D)
    {
        if (n == 1)
        {
            System.out.println("Transfer disk " + n + " from " + S + " to " + D);
            return;
        }
        TowerofHanoi(n - 1, S, D, H);
        System.out.println("Transfer disk " + n + " from " + S + " to " + D);
        TowerofHanoi(n - 1, H, S, D);
    }
}