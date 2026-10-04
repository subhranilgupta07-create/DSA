import java.util.*;
public class FiboRec
{
    public static int Fibo(int n)
    {
        if (n == 0 || n == 1)
            return n;
        else
            return Fibo(n - 1) + Fibo(n - 2);
    }
    public static void main(String Args[])
    {
        System.out.println("Enter a number to find its Fibonacci: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + Fibo(n));
    }
}