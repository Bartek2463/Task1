import java.util.Arrays;
import java.util.stream.IntStream;

public class Grow {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3,4}));
        System.out.println(grow1(new int[]{1, 2, 3,4}));
    }
    //my solution
    public static int grow(int[] x){
      int quotiet =  1;
        for (int i = 0; i < x.length ; i++) {
            quotiet*=x[i];
        }
        return quotiet;
    }
    public static int grow1(int[] y){
        return IntStream.of(y).reduce(1,(a,b)->a*b);
    }
}
