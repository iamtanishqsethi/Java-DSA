import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.insertLast(1);
//        list.insert(100,3);
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.delete(2);
//        list.display();
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertLast(99);
        list.insert(8,56);
        list.display();
    }
}