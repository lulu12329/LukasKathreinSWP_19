package datenstruktur;

public class doublyLinkedList {
    private doublyNode head;

    public int size(){
        if(head==null){
            return 0;
        }
        doublyNode it=head;
        int i;
        for(i=1;it.hasNext();i++){
            it=it.getNext();
        }
        return i;
    }

    @Override
    public String toString(){
        if(head!=null){
            String ret="";
            doublyNode it=head;
            while(it.hasNext()){
                ret+=it.getValue()+"; ";
                it=it.getNext();
            }
            ret+=it.getValue()+"; ";
            return ret;
        }
        return "List empty";
    }
}
