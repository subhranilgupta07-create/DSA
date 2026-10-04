import java.util.*;
public class RevStrRec
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        reverseString(str, str.length()-1);
    }

    public static void reverseString(String str, int idx)
    {
        if (idx == 0)
        {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);
    }
}