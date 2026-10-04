import java.util.*;
public class FLOccRec
{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurrences(String str, char ch, int idx)
    {
        if (idx == str.length())
        {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }
        if (str.charAt(idx) == ch)
        {
            if (first == -1)
            {
                first = idx;
            }
            last = idx;
        }
        findOccurrences(str, ch, idx + 1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.print("Enter a character to find occurrences: ");
        char ch = in.next().charAt(0);
        findOccurrences(str, ch, 0);
    }
}