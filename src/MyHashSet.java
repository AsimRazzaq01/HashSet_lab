import java.util.ArrayList;

public class MyHashSet {

    private ArrayList<Integer>[] buckets ;
    private int numElements ;

    public MyHashSet() {
        numElements = 0;
        buckets = new ArrayList[4];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>() ;
        }
    }

    public void add(int item) {
        //calculate hash value
        int index = item % buckets.length;
        //get list
        ArrayList<Integer> CurrentBucket = buckets[index];
        //add to list
        CurrentBucket.add(item);
        numElements++;
    }


    public void show(){
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("for index: "+i +" has the value: "+ buckets[i]);
        }
    }


}
