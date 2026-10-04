import java.util.*;
public class UniqueSubsequenceRec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashSet<String> set = new HashSet<>();
        printSubsequences(str, 0, "");
        in.close();
    }
    public static void printSubsequences(String str, int idx, String newStr, HashSet<String> set)
    {
        if (idx == str.length())
        {
            if (set.contains(newStr))
            {
                return;
            }
            else
            {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        printSubsequences(str, idx + 1, newStr + str.charAt(idx));
        printSubsequences(str, idx + 1, newStr);
    }
}