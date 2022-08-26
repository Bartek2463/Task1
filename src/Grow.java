import java.util.Arrays;
import java.util.stream.IntStream;

public class Grow {
    public static void main(String[] args) {
           grow( new int[]{5,3,4});
    }
    public static int grow(int[] x){
      int quotiet =  1;
        for (int i = 0; i < x.length ; i++) {
            quotiet*=x[i];
        }
        System.out.println(quotiet);
        return 0;
    }
}
