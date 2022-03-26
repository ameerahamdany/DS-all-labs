/**
 * Created by new on 1/30/2022.
 */    import java.util.Arrays;
public class lab2RotateArray {
    //Shift & Right Array Elements
        public static void main(String[] args) {
            int a[]={11,12,13};
            System.out.println(Arrays.toString(a));
            System.out.println("After shift Left");
            System.out.println(Arrays.toString(shiftLeft(a)));


          /*  System.out.println(Arrays.toString(a));
            System.out.println("After shift Right");
            System.out.println(Arrays.toString(shiftRight(a)));
            */
        }
        public static  int[] shiftRight( int[]y){
            int t= y [y.length-1];
            for (int i = y.length-1; i >0 ; i--) {
                y[i]=y[i-1];
            }
            y[0]=t;
            return y;
        }
        public  static int[] shiftLeft(int []x)
        {
            int t=x[0];
            for (int i = 0; i <x.length-1 ; i++) {
                x[i]=x[i+1];

            }
            x[x.length-1]=t;
            return x;
        }

    }

