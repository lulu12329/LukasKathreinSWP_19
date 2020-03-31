package mo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Benchmark {

    public static ArrayList<Integer> getRandomList(int length){
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<length;i++) {
            int j=(int) (Math.random()*length*2);
            list.add(j);
        }
        return list;
    }

    public static void main(String[] args) {
        int length=10;
        int number=10;
        System.out.println("list length: "+length);
        boolean b=true;
        ArrayList<Integer> list = getRandomList(length);
        System.out.println(list);

//        double time;
//        int i=40;
//        time=recursiveBenchmark(i,j->rekursion.recursiveFibonacci(i));
//        System.out.println(time+"ms");

//        time=sortBenchmark(list,j->Sort.quickSort(list));
//        System.out.println("quickSort: "+time/1000+"ms");

//        time=sortBenchmark(list,j->Sort.mergeSort(list));
//        System.out.println("mergeSort: "+time/1000+"ms");
    }

    public static long sortBenchmark(ArrayList list, Consumer function){
        long startTime=System.nanoTime();
        function.accept(list);
        long duration=System.nanoTime()-startTime;
        return duration;
    }

    public static long recursiveBenchmark(int i,Consumer function){
        long startTime=System.nanoTime();
        function.accept(i);
        long duration=System.nanoTime()-startTime;
        return duration;
    }
}
