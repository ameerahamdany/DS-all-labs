/**
 * Created by new on 1/30/2022.
 */
import java.util.Arrays;
import java.util.Scanner;
public class inputArray {
        public static void main(String[] args) {

            int x[]= new int[5];
            Scanner in = new Scanner(System.in);
            System.out.println(" enter numbers");
            for (int i = 0; i <x.length ; i++) {
                x[i] = in.nextInt();
            }
            for (int i = 0; i <x.length ; i++) {
                System.out.println(x[i]);
            }
            System.out.println(Arrays.toString(x));
        }
    }
//input Array Elements DS lab1


