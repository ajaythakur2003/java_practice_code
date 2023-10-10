package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();

        list.insertRec(31,2);
        list.display();
//
//        list.insert(11,3);
//
//        list.insertLast(0);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);

//        list.display();
//        list.insertLast(18);
//        list.insert(20,16);
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(22);
//        list.insert(21);
//        list.insert(20);
//        list.display();
////        list.delete(21);
//
//        list.display();

     }
}
