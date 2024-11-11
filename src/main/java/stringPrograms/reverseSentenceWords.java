package stringPrograms;

public class reverseSentenceWords {
    public static void main(String[] args) {
        String str1 = "Hi how is your day going";
        String[] strArray = str1.split(" ");
        StringBuilder revArray = new StringBuilder("");
        for (int i=strArray.length-1; i>=0; i--)
        {
            revArray.append(strArray[i]);
            revArray.append(" ");
        }
        System.out.println(revArray);
    }
}
