package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class identifyDuplicateCharacters {

    public static void main(String[] args) {

        String str = "Better Butter Bitter";
        String strNoSpace = str.replaceAll("\\s+", "");
        String strLower = strNoSpace.toLowerCase();
        System.out.println(strLower);

        Map<Character, Integer> countMap = new HashMap<Character, Integer>();


        for (int i=1; i<strLower.length(); i++)
        {
            int temp = 0;
            for(int j=0; j<strLower.length(); j++) {
                if (strLower.charAt(i) == strLower.charAt(j)) {
                    temp++;
                    countMap.put(strLower.charAt(i), temp);
                }
            }
        }

        System.out.println(countMap);
    }
}
