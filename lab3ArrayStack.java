/**
 * Created by new on 1/30/2022.
 */
public class lab3ArrayStack<E> implements stack<E> {
        E data[];
        int top=-1;

        static final  int CAPACITY=100;


    public lab3ArrayStack(int c) {
            data = (E[]) new Object[c];
            //السي هي  طول المصفوفة
        }


        public lab3ArrayStack() {this(CAPACITY);}

        @Override
        public boolean isEmpty() {
            return top==-1;
        }

        @Override
        public int size() {
            return top+1;
        }

        @Override
        public void push(E element) {
            if (size()==data.length)
                throw new IllegalStateException("Stack is fall");
            data[++top]=element;

        }

        @Override
        public E pop() {
            if (isEmpty())
                return null;
            E x=data[top];
            data[top]=null;
            top--;
            return x;
        }

        @Override
        public E top() {
            if (isEmpty())
                return null;
            return data[top];
        }
    }


