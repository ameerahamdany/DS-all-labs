/**
 * Created by new on 3/16/2022.
 */
public class linkedStack6<E>implements stack<E> {

        SinglyLinkedList5<E>list= new SinglyLinkedList5<>();
        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public void push(E element) {
            list.addfirst(element);
        }

        @Override
        public E pop() {
            return list.removefirst();
        }

        @Override
        public E top() {
            return list.first();
        }
    }


