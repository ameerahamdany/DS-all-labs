import javax.xml.soap.Node;

/**
 * Created by new on 2/27/2022.
 */
public class doublylinkedlist7 <E> {

    private  node<E>header;
    private node<E>trailer;
    private int size=0;

    public doublylinkedlist7() {
        header=new node<>(null,null,null);
        trailer=new node<>(null,header,null);
        header.setNext(trailer);
    }
    public  boolean isempty()
    {
        return size==0;
    }
    public  int size()
    {
        return size;
    }
    public E first()
    {
        if(isempty())return null;
        return header.getNext().getElement();
    }
    public E last()
    {
        if(isempty())return null;
        return trailer.getPrev().getElement();
    }
private  void addbetween (E el,node<E>p,node<E>n)
{
    node<E> newest=new node<>(el,p,n);
    p.setNext(newest);
    n.setPrev(newest );
    size ++;
}
public void addFirst(E el)
{
    addbetween(el,header,header.getNext());
}
public void addLast(E el)
{
    addbetween(el,trailer.getPrev(),trailer);
}
private  E remove(node<E>x)
{
    node<E>p=x.getPrev();
    node<E>n=x.getNext();
    p.setNext(n);
    n.setPrev(p);
    size--;
    return x.getElement();
}
public E removeFirst()
{
    return remove(header.getNext());

}
    public E removeLast()
    {
        return remove(trailer.getPrev());

    }
    private static class node<E>
    {
        E element;
        node<E> prev;
        node<E> next;

        public node(E element, node<E> prev, node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

       // public void setElement(E element) {
         //   this.element = element;
        //}

        public node<E> getPrev() {
            return prev;
        }

        public void setPrev(node<E> prev) {
            this.prev = prev;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }
}
