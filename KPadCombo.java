import java.util.*;
public class KPadCombo
{
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombo(String str, int idx, String newStr)
    {
        if(idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        String map = keypad[currchar - '0'];
        for(int i = 0; i < map.length(); i++)
        {
            printCombo(str, idx + 1, newStr + map.charAt(i));
        }
    }
    public static void main (String Args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        printCombo(str, 0, "");
        in.close();
    }
}