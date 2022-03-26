/**
 * Created by new on 2/19/2022.
 */
public class testSinglyLinkedList5 {
    public static void main(String[] args) {
        SinglyLinkedList5<String>list=new SinglyLinkedList5<>();
        System.out.println(list.size);
        list.addfirst("fatima");
        list.addlast("alazazi");
        System.out.println(list.size);

        while (!list.isEmpty())
            System.out.println(list.removefirst());
    }
}
