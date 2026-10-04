import java.util.Scanner;
public class RemDupRec
{
    public static boolean map[] = new boolean[26];
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        removeDup(s, 0, "");
        in.close();
    }
    public static void removeDup(String str, int idx, String newStr)
    {
        if (idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true)
        {
            removeDup(str, idx + 1, newStr);
        }
        else
        {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newStr);
        }
    }
}