package datenstruktur;

public class doublyNode {
    private int value;
    private doublyNode previous;
    private doublyNode next;

    public doublyNode(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public doublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(doublyNode previous) {
        this.previous = previous;
    }

    public doublyNode getNext() {
        return next;
    }

    public void setNext(doublyNode next) {
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
