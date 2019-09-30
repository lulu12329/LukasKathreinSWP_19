package mo;

import java.util.ArrayList;

public class bubbleSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<10;i++) {
			int a=(int) (Math.random()*20);
			list.add(a);
		}
		System.out.println(list);
		list=bubbleSort(list);
		System.out.println(list);
		
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for (int j=0;j<list.size()-1-i;j++) {
				if(list.get(j)>list.get(j+1)) {
					int a=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, a);
				}
			}
		}
		return list;
	}
}
