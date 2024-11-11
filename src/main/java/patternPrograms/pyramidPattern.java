package patternPrograms;

public class pyramidPattern {

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
        pyramidPattern obj = new pyramidPattern();
        System.out.println("leftTriangleStarPattern");
        obj.leftTriangleStarPattern();
    }
}
