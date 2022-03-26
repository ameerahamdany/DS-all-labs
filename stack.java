/**
 * Created by new on 1/30/2022.
 */import sun.invoke.empty.Empty;
public interface stack <E> {

        boolean isEmpty();
        int size();
        void push(E element);
        E pop () ;
        E top ();
}


