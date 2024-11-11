package arrayPrograms;

public class checkEqualityOfTwoArrays {

    public static void main(String[] args) {

        int[] arrayOne = {2, 3, 5, 8, 10};
        int[] arrayTwo = {2, 3, 5, 8, 10};

        boolean equalOrNot = true;

        if (arrayOne.length == arrayTwo.length)
        {
            for (int i=1; i<arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }

        else
        {
            equalOrNot = false;
        }

        if(equalOrNot)
        {
            System.out.println("Two arrays are equal");
        }

        else
        {
            System.out.println("Two arrays are not equal");
        }

    }
}
