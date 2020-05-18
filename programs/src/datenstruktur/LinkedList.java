package datenstruktur;

public class LinkedList {
	private Node head;

	public void add(int value) {
		Node tmp = new Node(value);
		if (head == null) {
			head = tmp;
		}else {
			Node it=head;
			while (it.hasNext()) {
				it = it.next();
			}
			it.setNext(tmp);
		}
	}

	public void add(int value, int pos){
		try {
			//Liste leer oder zu hohe pos
			if (pos < 0 || pos >= this.size()+1) {
				throw new IllegalArgumentException(""+pos);
			}
			if(pos==0){
				Node tmp=head;
				head=new Node(value);
				head.setNext(tmp);
			}else{
				Node tmp=head;
				for(int i=0;tmp.hasNext()&&i<pos-1;i++){
					tmp=tmp.next();
				}
				Node it=tmp.next();
				tmp.setNext(new Node(value));
				tmp.next().setNext(it);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void delete(int pos) {
		try {
			//Liste leer oder zu hohe pos
			if (pos < 0 || pos >= this.size()) {
				throw new IllegalArgumentException(""+pos);
			}
			//erstes Element löschen
			if (pos == 0) {
				head=head.next();
			}else {
				Node it = head;
				for (int i = 0; i < pos - 1; i++) {
					it = it.next();
				}
				it.setNext(it.next().next());
			}
		}catch (IllegalArgumentException e){
			e.printStackTrace();
		}
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
		if(head!=null) {
			String ret = "";
			Node it = head;
			while (it.hasNext()) {
				ret += "" + it.getValue() + " ";
				it = it.next();
			}
			ret += "" + it.getValue() + " ";
			return ret;
		}
		return "List empty";
	}
}
