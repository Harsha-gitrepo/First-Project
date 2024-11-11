package stringPrograms;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {

        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";

        String strNoSpace1= str1.replaceAll("\\s+", "");
        String strLower1 = strNoSpace1.toLowerCase();
        System.out.println(strLower1);

        String strNoSpace2 = str2.replaceAll("\\s+", "");
        String strLower2 = strNoSpace2.toLowerCase();
        System.out.println(strLower2);

        boolean status = true;
        if (strLower1.length() != strLower2.length())
        {
            status = false;
        }

        else
        {
            char[] strArray1 = strLower1.toCharArray();
            char[] strArray2 = strLower2.toCharArray();

            Arrays.sort(strArray1);
            Arrays.sort(strArray2);

            status = Arrays.equals(strArray1, strArray2);
        }

        if (status)
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Given two strings are not anagrams");
        }
    }
}
