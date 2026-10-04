import java.util.Scanner;
public class MovexEndRec
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        Move(s, 0, 0, "");
        in.close();
    }
    public static void Move(String s, int idx, int count, String newString)
    {
        // Base case
        if (idx == s.length())
        {
            // Add all x's at the end
            for (int i = 0; i < count; i++)
            {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        // If current character is x
        if (s.charAt(idx) == 'x')
        {
            Move(s, idx + 1, count + 1, newString);
        }
        else
        {
            // Add non-x character to newString
            newString += s.charAt(idx);
            Move(s, idx + 1, count, newString);
        }
    }
}