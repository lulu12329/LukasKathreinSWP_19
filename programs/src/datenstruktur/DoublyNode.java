package datenstruktur;

public class DoublyNode {
    private int value;
    private DoublyNode previous;
    private DoublyNode next;

    public DoublyNode(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public boolean hasNext(){
        if(next==null){
            return false;
        }else{
            return true;
        }
    }

    public boolean hasPrevious(){
        if(previous==null){
            return false;
        }else{
            return true;
        }
    }
}
