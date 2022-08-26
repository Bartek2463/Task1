import java.util.*;

public class Main {

    // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) {
        Arrays.sort(numbers);

        int min = numbers[1] - numbers[0];
        int indexOne = 0 , indexTwo = 1;

        for (int i = 1; i < numbers.length -1; i++) {
            if (min > (numbers[i+1] - numbers[i])) {
                min = numbers[i+1] - numbers[i] ;
                indexOne = i ;
                indexTwo = i+1 ;
            }}
            return min;
        }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 7, 90, 65,77,};
        int result = distClosestNumbers(testArray);
        System.out.println(result);
    }
}