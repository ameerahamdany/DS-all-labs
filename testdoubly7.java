import java.util.Scanner;

/**
 * Created by new on 2/27/2022.
 */
public class testdoubly7 {
    public static void main(String[] args) {
        doublylinkedlist7<String>list=new doublylinkedlist7<>();
        Scanner in =new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t2 add last\t3 remove first\t4 remove last\t0 exit");
        while(choice!=0)
        {
            System.out.println("your choice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("input a name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input a name");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("removed is:"+list.removeFirst());
                    break;
                case 4:
                    System.out.println("removed is:"+list.removeLast());
                    break;

                //System.out.println("first= " + list.first()+" \t last="+list.last()+"size = "+list.size());

            }
        }
    }
}
