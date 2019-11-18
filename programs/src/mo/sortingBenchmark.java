package mo;


import java.util.ArrayList;

public class sortingBenchmark {

    public static ArrayList<Integer> getRandomList(int length){
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<length;i++) {
            list.add((int) (Math.random()*length));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =getRandomList(200);
        long startTime=0;
        long duration=0;

        startTime=System.currentTimeMillis();
        Sort.bubbleSort(list);
        duration=System.currentTimeMillis()-startTime;
        System.out.println("bubbleSort takes "+duration+"ms");

        startTime=System.currentTimeMillis();
        Sort.selectionSort(list);
        duration=System.currentTimeMillis()-startTime;
        System.out.println("selectionSort takes "+duration+"ms");

        startTime=System.currentTimeMillis();
        Sort.shotgunSort(list);
        duration=System.currentTimeMillis()-startTime;
        System.out.println("shotgunSort takes "+duration+"ms");
    }
}
