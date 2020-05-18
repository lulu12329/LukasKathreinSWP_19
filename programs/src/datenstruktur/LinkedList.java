package datenstruktur;

public class LinkedList {
	private Node head;
	
	public void add(int value) {
		Node tmp = new Node(value);
		if (head == null) {
			head = tmp;
			return;
		}
		Node it;
		it = head;
		while (it.hasNext()) {
			it = it.next();
		}
		it.setNext(tmp);	
	}

	//returns false if operation failed
	public boolean delete(int pos) {
		//Liste leer
		if (head==null||pos>=this.size()){
			return false;
		}
		if(pos==0){
			if(head.hasNext()) {
				head = head.next();
			}else{
				head=null;
			}
			return true;
		}
		Node it=head;
		for(int i=0;i<pos-1;i++){
			it=it.next();
		}
		if(it.next().hasNext()){
			it.setNext(it.next().next());
		}else{
			it.setNext(null);
		}
		return true;
	}

	public int size(){
		if(head==null){
			return 0;
		}
		Node it=head;
		int i=1;
		while(it.hasNext()){
			it=it.next();
			i++;
		}
		return i;
	}

	@Override
	public String toString() {
		String ret = "";
		Node it = head;
		while (it.hasNext()) {
			ret += "" + it.getValue() + " ";
			it = it.next();
		}
		ret += "" + it.getValue() + " ";
		return ret;
	}
}
