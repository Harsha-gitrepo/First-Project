package stringPrograms;

public class removeWhiteSpacesInString {
    public static void main(String[] args) {
        String str = "I am doing great today";
        System.out.println(str);
        String str1 = str.replaceAll("\\s+", "");
        System.out.println(str1);
    }
}
