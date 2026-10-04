import java.util.Scanner;
public class SubsequenceRec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        printSubsequences(str, 0, "");
        in.close();
    }
    public static void printSubsequences(String str, int idx, String newStr)
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        printSubsequences(str, idx + 1, newStr + str.charAt(idx));
        printSubsequences(str, idx + 1, newStr);
    }
}