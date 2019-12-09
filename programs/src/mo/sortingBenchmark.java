package mo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class sortingBenchmark {

    public static ArrayList<Integer> getRandomList(int length){
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<length;i++) {
            list.add((int) (Math.random()*length));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =getRandomList(10);
        long time;
        time=sortBenchmark(list,j->Sort.insertionSort(list));
        System.out.println(time+"ms");
        int i=40;
        time=recursiveBenchmark(i,j->rekursion.recursiveFibonacci(i));
        System.out.println(time+"ms");
    }

    public static long sortBenchmark(ArrayList list, Consumer function){
        long startTime=System.currentTimeMillis();
        function.accept(list);
        long duration=System.currentTimeMillis()-startTime;
        return duration;
    }

    public static long recursiveBenchmark(int i,Consumer function){
        long startTime=System.currentTimeMillis();
        function.accept(i);
        long duration=System.currentTimeMillis()-startTime;
        return duration;
    }
}
