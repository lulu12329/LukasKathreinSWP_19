package datenstruktur;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public int size(){
        if(head==null){
            return 0;
        }
        DoublyNode it=head;
        int i;
        for(i=1;it.hasNext();i++){
            it=it.getNext();
        }
        return i;
    }

    public void add(int value){
        if(size()==0){
            DoublyNode tmp=new DoublyNode(value);
            head=tmp;
            tail=tmp;
        }else{
            DoublyNode tmp=tail;
            tmp.setNext(new DoublyNode(value));
            tmp.getNext().setPrevious(tmp);
            tail=tmp.getNext();
        }
    }

    public void delete(int pos){
        try {
            if (pos < 0 || pos >= size()) {
                throw new IllegalArgumentException(""+pos);
            }
            if(pos==0){
                head=head.getNext();
                head.setPrevious(null);
            }else{
                DoublyNode tmp=head;
                for(int i=0;i<pos-1;i++){
                    tmp=tmp.getNext();
                }
                if(tmp.hasNext()) {
                    tmp.setNext(tmp.getNext().getNext());
                    if (tmp.hasNext()) {
                        tmp.getNext().setPrevious(tmp);
                    }
                    while(tmp.hasNext()){
                        tmp=tmp.getNext();
                    }
                }else{
                    tmp.setNext(null);
                }
                tail=tmp;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        if(head!=null){
            String ret="";
            DoublyNode it=head;
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
