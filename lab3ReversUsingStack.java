/**
 * Created by new on 1/30/2022.
 */ import java.util.Arrays;
public class lab3ReversUsingStack {
        public static void main(String[] args) {
            int [] a={11,12,13,14,15};
            System.out.println(Arrays.toString(a));
            lab3ArrayStack<Integer>s=new lab3ArrayStack<>(a.length);
            for (int i = 0; i < a.length; i++) {
                s.push(a[i]);

            }
            for (int i = 0; i < a.length; i++) {
                a[i]=s.pop();

            }
            System.out.println("after revers using stack");
            System.out.println(Arrays.toString(a));
        }
    }


