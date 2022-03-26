/**
 * Created by new on 3/24/2022.
 */    import java.util.Scanner;

public class lab5_q2 {
        public static void main(String[] args) {
            SinglyLinkedList5<Integer>list=new SinglyLinkedList5<>();
            Scanner input=new Scanner(System.in);
            System.out.println("1-add first \n 2-add last \n 3-remove first \n 0-exit");
            int choice=-1;
            while (choice!=0) {
                System.out.print("your choice :");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter  number");
                        list.addfirst(input.nextInt());
                        System.out.println("first number = " + list.first() + "\tlast number = " +
                                "" + list.last() + "\t size= " + list.size());
                        break;

                    case 2:
                        System.out.println("enter a number");
                        list.addlast(input.nextInt());
                        System.out.println("first= "+list.first()+"\tlast= " +
                                ""+list.last()+"\t size= "+list.size());
                        break;

                    case 3:
                        System.out.println("Remove first  " + list.removefirst());
                        System.out.println("first= " + list.first() + "\t last= " +
                                "" + list.last() + "\t size= " + list.size());
                        break;
                    case 0:
                        System.exit(0);
                        break;


                }

            }
        }
    }


