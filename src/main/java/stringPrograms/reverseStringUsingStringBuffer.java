package stringPrograms;

public class reverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String str = "level";
        StringBuffer sb = new StringBuffer(str);
        String rev = String.valueOf(sb.reverse());
        System.out.println(rev);
        if(str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
