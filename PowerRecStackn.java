import java.util.Scanner;
public class PowerRecStackn 
{
    public static int Power(int x, int n)
    {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        return x * Power(x, n - 1);
    }
    public static void main(String Args[])
    {
        System.out.println("Enter a number and its power: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(x + " raised to the power " + n + " is: " + Power(x, n));
    }
}
