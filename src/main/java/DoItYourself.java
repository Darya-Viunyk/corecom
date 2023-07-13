import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DoItYourself {

    public static void main(String[] args) {

        //***************************************
        // Write some code to check through the list and if it's a number between 3 and 7, output it to sysout
        //***************************************
        List<Integer> numbers = Arrays.asList(4, 8, 12, 9, 2, 6, 8, 1, 5, 4, 7);

        for (int number : numbers) {
            if (number >= 3 && number <= 7) {
                System.out.println(number);
            }
        }


        //***************************************
        // Write some code to compare these two arrays and output true or false depending on if they are the same
        //***************************************
        public static void main(String[] args) {
            int[] a = {1, 2, 3};
            int[] b = {1, 2, 3};
    
            boolean areEqual = Arrays.equals(a, b);
            System.out.println(areEqual);
        }


        //***************************************
        //                                                                                                                                                           
    

}
 
int number = 7;
boolean result = true;
for (int i = 2; i < number; i++) {
    if (number % i == 0) {
        result = false;
        break; // Added to break out of the loop
    }
}
System.out.println(result);
}