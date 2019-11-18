package mo;

import java.util.ArrayList;

public class Sort {
	
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

	public static ArrayList<Integer> shotgunSort(ArrayList<Integer> list){
		int z=0;
		while(!(list.size()-z-1==0)) {
			int[] a = new int[list.size()];
			//reandom neu anordnen
			for (int i = 0; i < a.length; i++) {
				int j = (int) (Math.random() * a.length);
				int x = list.get(j);
				list.set(j, list.get(i));
				list.set(i, x);
			}
			//überprüfen
			z=0;
			for(int i=1;i<list.size();i++){
				if((list.get(i-1)<=list.get(i))){
					z++;
				}
			}
		}
		return list;
	}

	public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++) {
			int k1=0;
			for(int j=i;j<list.size();j++){
				if(i==0){
					k1=list.get(j);
				}else if(list.get(j)<k1){
					k1=list.get(j);
				}
			}
			list.set(i,k1);
		}
		return list;
	}
}