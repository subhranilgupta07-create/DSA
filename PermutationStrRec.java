import java.util.*;
public class PermutationStrRec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to find its permutations: ");    
        String str = in.nextLine();
        System.out.println("The permutations of the string are: ");
        permute(str, "");
        in.close();
    }
    public static void permute(String str, String permutation)
    {
        if (str.length() == 0)
        {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permute(newStr, permutation + currChar);
        }
    }
}