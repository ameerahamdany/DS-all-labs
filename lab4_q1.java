/**
 * Created by new on 3/24/2022.
 */
public class lab4_q1 {

        public static void main(String[] args) {
            String[] g1 = {"a", "b", "c", "d", "e", "f"};
            linkedQueue5<String> cq = new linkedQueue5<>();
            circularylinkedlist8<String> c=new circularylinkedlist8<>();
            for (int i = 0; i < g1.length; i++) {
                cq.enqueue(g1[i]);
            }
            while (cq.size() > 1) {
                for (int i = 0; i < 2; i++) {
                    c.rotate();
                    System.out.println(cq.dequeue() + "is out");
                }
                System.out.println("is winner" + cq.dequeue());
            }
        }
    }


