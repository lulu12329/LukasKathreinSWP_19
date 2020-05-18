package datenstruktur;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(4);
        ll.add(6);
        ll.add(8);
        ll.add(6);
        ll.add(8);
        System.out.println(ll);
        ll.delete(1);
        System.out.println(ll);
    }
}
