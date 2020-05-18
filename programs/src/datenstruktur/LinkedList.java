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
	public void delete(int pos) {
		try {
			//Liste leer
			if (pos < 0 || pos >= this.size()) {
				throw new IllegalArgumentException();
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
			System.err.println("Please write a valid argument");
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
