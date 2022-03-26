/**
 * Created by new on 3/24/2022.
 */
public class lab7_q2 {

        public class Node <E>{
            private E element;
            private Node<E> next;
            public Node(E element, Node<E> next){
                this.element=element;
                this.next=next;
            }

            public E getElement() {
                return element;
            }
            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }

            public void setElement(E element) {
                this.element = element;
            }




        }
    }

/**
 give an implementation of the size () method for the circularylinked list class
 assuming that we did not maintain size as instance variable.
 follow circularyLinkedList*/
