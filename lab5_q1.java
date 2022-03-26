/**
 * Created by new on 3/24/2022.
 */
public class lab5_q1 {

        int data;
    lab5_q1 next;
    lab5_q1(int d)
        {
            this.data=d ;
            this.next=null;
        }

        static class LinkedList
        {
            lab5_q1 start;
            LinkedList()
            {
                start=null;
            }
            public void push(int data)
            {
                if (this.start==null)
                {
                    lab5_q1 temp = new lab5_q1(data);
                    this.start=temp;
                }
                else
                {
                    lab5_q1 temp =new lab5_q1(data);
                    temp.next=this.start;
                    this.start=temp;
                }
            }
            public int findSecandLaestNode(lab5_q1 ptr)
            {
                lab5_q1 temp = ptr;
                if (temp == null||temp.next == null)
                    return -1;
                while (temp.next.next !=null)
                {
                    temp=temp.next;
                }
                return temp.data;
            }

            public static void main(String[] args) {
                LinkedList b = new LinkedList();
                b.push(12);
                b.push(29);
                b.push(11);
                b.push(23);
                b.push(8);
                System.out.println(b.findSecandLaestNode(b.start));


            }
        }
    }



