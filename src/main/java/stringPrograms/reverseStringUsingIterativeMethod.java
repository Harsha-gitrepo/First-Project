package stringPrograms;

public class reverseStringUsingIterativeMethod {
    public static void main(String[] args) {

        String str = "levels";
        String strRev = "";
        char[] strArray = str.toCharArray();
        char[] revArray = new char[20];
        for (int i=strArray.length - 1; i >= 0; i--)
        {
            System.out.println(strArray[i]);
        }
    }
}
