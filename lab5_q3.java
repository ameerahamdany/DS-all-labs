/**
 * Created by new on 3/24/2022.
 */
public class lab5_q3 {
      static class LinkedList {
            Node head;
            /* Linked list Node*/
            class Node {
                int data;
                Node next;
                Node(int n)
                {
                    data = n;
                    next = null;
                }
            }

            void rotate(int m) {
                if (m == 0)
                    return;


                Node current = head;


                int count = 1;
                while (count < m && current != null) {
                    current = current.next;
                    count++;
                }

                if (current == null)
                    return;


            }}}


