package datenstruktur;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.add(4);
//        ll.add(6);
//        ll.add(8);
//        ll.add(6);
//        ll.add(8);
//        System.out.println(ll);
//        ll.delete(-1);
//        System.out.println(ll);
//        ll.add(1,6);
//        System.out.println(ll.toString());

        DoublyLinkedList dll=new DoublyLinkedList();
        dll.add(4);
        dll.add(6);
        dll.add(8);
        dll.add(6);
        dll.add(8);
        System.out.println(dll.toString());
        dll.delete(3);
        System.out.println(dll.toString());
    }
}
