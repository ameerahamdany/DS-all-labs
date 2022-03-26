/**
 * Created by new on 1/30/2022.
 */   import java.util.Scanner;
import java.util.Arrays;
public class lab2ArrayOpration2{
    //Add Elements To Array
        int x[];
        int numOfElements;

        public lab2ArrayOpration2(){
            x=new int[5];
            numOfElements=0;

        }
        public  int addElement(int e){
            if (numOfElements<x.length){
                x[numOfElements]=e;
                numOfElements++;
                return 0;
            }
            return -1;
        }
public  int addsortelement(int e)
{
    if (numOfElements<x.length)
    {
        int i=numOfElements;
        while (i>0 && e<x[i-1])
        {
            x[i]=x[i-1];
                    i--;
        }
        x[i]=e;
        numOfElements++;
        return 0;
    }
    else return -1;

}


        public static void main(String[] args) {
            lab2ArrayOpration2 test = new lab2ArrayOpration2();
            Scanner in=new Scanner(System.in);
            System.out.println(" Input Elements");
            for (int i = 0; i <9; i++) {
                if (test.addElement(in.nextInt())==0)
                    System.out.println("Added Successfully");
                else
                    System.out.println("Array Is Full ");
                System.out.println(Arrays.toString(test.x));
            }
        }
    }


