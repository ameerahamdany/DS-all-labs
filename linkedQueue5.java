/**
 * Created by new on 3/16/2022.
 */
public class linkedQueue5 <E>implements Queue<E>{

        SinglyLinkedList5<E>l=new SinglyLinkedList5<>();
        @Override
        public boolean isEmpty() {
            return l.isEmpty();
        }
        @Override
        public int size() {
            return l.size();
        }
        @Override
        public void enqueue(E e) {
            l.addlast(e);
        }
        @Override
        public E dequeue() {
            return l.removefirst();
        }
        @Override
        public E first() {
            return l.first();
        }
    }


