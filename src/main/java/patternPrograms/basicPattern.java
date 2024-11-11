package patternPrograms;

public class basicPattern {
    public void rightTriangleStarPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        basicPattern obj = new basicPattern();
        System.out.println("rightTriangleStarPattern");
        obj.rightTriangleStarPattern();

    }
}
