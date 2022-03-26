/**
 * Created by new on 3/24/2022.
 */import java.util.Arrays;
public class lab2_q2 {

        public static void main(String[] args) {

            System.out.println( "CopyingArray ="+ Arrays.toString(copy()));
        }
        public static int[] copy() {
            int[] f = {1,2,3,4,5};
            int[] c = new int[f.length];
            c = f;
            return c;
        }
    }

