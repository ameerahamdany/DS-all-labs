/**
 * Created by new on 2/6/2022.
 */
// اميرة الحلوة الامورة
public class SinglyLinkedList5<E> {
   private node<E> head=null;
    private node<E> tail=null;
    int size=0;

    private  static class  node<E>
    {
        E element;
        node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        // public void setElement(E element) {
        //   this.element = element;
        //}

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }
    public SinglyLinkedList5() {                //is empty()
    }                                           //size()
public  boolean isEmpty()                       //E first()
{                                               //E last()
    return size==0;                             //add first()
}                                               //add last()
public int size()                               //remove first() غيرت رايها
{
    return  size;
}
public  E first()
{
    if (isEmpty())return null;
    return  head.getElement();
}
    public  E last()
    {
        if (isEmpty())return null;
        return  tail.getElement();
    }
    public void  addfirst( E element)
    {
        head=new node<E>(element,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void  addlast( E element)
    {
        node<E> x=new node<E>(element,null);
        if (size==0)
            head=x;
        else
            tail.setNext(x);
        tail=x;
        size++;
    }
    public  E removefirst()
    {
        if (isEmpty()) return  null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return  del;
    }

}
//دالة ال set ليست ضروريه
//يمكن الاستغناء عنها