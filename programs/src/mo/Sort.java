package mo;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int a = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, a);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> shotgunSort(ArrayList<Integer> list) {
        int z = 0;
        while (!(list.size() - z - 1 == 0)) {
            int[] a = new int[list.size()];
            //reandom neu anordnen
            for (int i = 0; i < a.length; i++) {
                int j = (int) (Math.random() * a.length);
                int x = list.get(j);
                list.set(j, list.get(i));
                list.set(i, x);
            }
            //überprüfen
            z = 0;
            for (int i = 1; i < list.size(); i++) {
                if ((list.get(i - 1) <= list.get(i))) {
                    z++;
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int k1 = 0;
            for (int j = i; j < list.size(); j++) {
                if (i == 0) {
                    k1 = list.get(j);
                } else if (list.get(j) < k1) {
                    k1 = list.get(j);
                }
            }
            list.set(i, k1);
        }
        return list;
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(i)) {
                    int x = list.get(i);
                    list.remove(i);
                    list.add(j, x);
                    j = i;
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int idxPivot = list.size() / 2;
        ArrayList<Integer> kl = new ArrayList<>();
        ArrayList<Integer> gr = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i != idxPivot) {
                int j = list.get(i);
                if (j <= list.get(idxPivot)) {
                    kl.add(j);
                } else if (j > list.get(idxPivot)) {
                    gr.add(j);
                }
            }
        }
        int pivot = list.get(idxPivot);
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(quickSort(kl));
        a.add(pivot);
        a.addAll(quickSort(gr));
        return a;
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        if(list.size()==1){
            return list;
        }
        List<Integer> left=list.subList(0,list.size()/2);
        List<Integer> right=list.subList(list.size()/2,list.size());
        return sort(mergeSort(left),mergeSort(right));
    }
    private static List<Integer> sort(List<Integer> left,List<Integer> right){
        ArrayList<Integer> ret=new ArrayList<Integer>();
        int i=0;
        int j=0;

        while   (i+j<=left.size()+right.size()){
            if(left.size()==i) {
                ret.addAll(right.subList(j, right.size()));
                return ret;
            }
            if(right.size()==j){
                ret.addAll(left.subList(i,left.size()));
                return ret;
            }
            if(left.get(i)<=right.get(j)){
                ret.add(left.get(i));
                i++;
            }else{
                ret.add(right.get(j));
                j++;
            }
        }
        return ret;
    }
}