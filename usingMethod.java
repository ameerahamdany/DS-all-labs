/**
 * Created by new on 1/30/2022.
 */ import java.util.Scanner;
public class usingMethod {
        public static void main(String[] args) {

            int arry[] = new int[5];
            System.out.println(" Enter numbers");
            inputArrayElement(arry);
            printArray(arry);

        }

        public static void printArray(int[] x) {
            for (int i = 0; i < x.length; i++) {
                System.out.println("a["+i+"]="+x[i] + "\t");
            }
        }

        public static void inputArrayElement(int[] y) {
            Scanner in= new Scanner(System.in);
            for (int i = 0; i < y.length; i++) {
                y[i]=in.nextInt();
            }
        }
    }


