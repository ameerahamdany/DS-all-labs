/**
 * Created by new on 1/30/2022.
 */
public interface Queue <E> {
        boolean isEmpty();
        int size();
        void enqueue( E element);
        E dequeue();
        E first();
    }


