package patternPrograms;

public class invertedHalfPyramid {

    public static void main(String[] args) {

        int i, j, row=6;

        for(i=0; i<row; i++)
        {
            for(j=row-i; j>0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=0; i<row; i++)
        {
            for(j=row-i; j>0; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
