import java.util.*;
public class TowerOfHanoi
{
    public static void main (String Args[])
    {
        TowerofHanoi(3, "S", "H", "D");
    }
    public static void TowerofHanoi (int n, String S, String H, String D)
    {
        TowerofHanoi(n-1, S, D, H);
        System.out.println("Transfer disk "+n+ " from "+S+ " to "+D);
        TowerofHanoi(n-1, H, S, D);
        if (n == 1)
        {
            System.out.println("Transfer disk "+n+ " from "+S+ " to "+D);
            return;
        }
    }
}