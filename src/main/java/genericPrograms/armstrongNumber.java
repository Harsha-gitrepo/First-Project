package genericPrograms;

public class armstrongNumber {

    public static void main(String[] args) {

        int num = 153;

        int temp = num, rem = 0;
        int sum = 0;

        int noOfDigits = String.valueOf(num).length();
        System.out.println(noOfDigits);

        while (rem != 0)
        {
            rem = temp%10;

            int last = 1;
            for(int i=0; i< noOfDigits; i++)
            {
                sum = 1 * rem;
            }



        }



    }
}
