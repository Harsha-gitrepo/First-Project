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

    public void leftTriangleStarPattern(){
        int i,j, row=6;
        for ( i = 0; i < row; i++) {
            for ( j = (row-i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        basicPattern obj = new basicPattern();
        System.out.println("rightTriangleStarPattern");
        obj.rightTriangleStarPattern();
        System.out.println("leftTriangleStarPattern");
        obj.leftTriangleStarPattern();
    }
}
