/**
 * Created by new on 1/30/2022.
 */  import java.util.Scanner;
public class lab3TestStack {
        public static void main(String[] args) {
            lab3ArrayStack<Integer>myStack= new lab3ArrayStack<>(5);
            Scanner in =new Scanner(System.in);
            System.out.println("is the stack empty?"+myStack.isEmpty());
            System.out.println("input elements");
            for (int i = 0; i < 5; i++) {
                myStack.push(in.nextInt());
                System.out.println("top element is"+myStack.top());
                System.out.println("size of stack is"+myStack.size());
                System.out.println("is the stack empty"+myStack.isEmpty());

            }
            for (int i = 0; i < 6; i++) {
                System.out.println("deleted elements is"+myStack.pop());
                System.out.println("top element is"+myStack.top());
                System.out.println("size of stack is"+myStack.size());
                System.out.println("is the stack empty"+myStack.isEmpty());

            }
        }
    }


