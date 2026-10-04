import java.util.*;

public class CheckIncArrRec
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            A[i] = in.nextInt();
        }
        System.out.println(Inc(A, 0));
        in.close();
    }
    public static boolean Inc(int A[], int idx)
    {
        if (idx == A.length - 1)
        {
            return true;
        }

        if (A[idx] < A[idx + 1])
        {
            return Inc(A, idx + 1);
        }
        else
        {
            return false;
        }
    }
}