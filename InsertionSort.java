import java.util.*;
public class InsertionSort
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> unsorted = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            unsorted.add(new Random().nextInt(100));
        }
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            sorted.add(0);
        }
        for (Integer integer : unsorted) {
            System.out.println(integer);
        }
        sorted.set(0, unsorted.get(0));
        int lastSortedIndex = 0;
        for (int i = 1; i < unsorted.size(); i++) {
            int element = unsorted.get(i);
            int c = 0;
            for (int j = lastSortedIndex; j >= 0; j--) {
                if (sorted.get(j) > element)  {
                    sorted.set(j+1, sorted.get(j));
                    c++;
                }
                sorted.set(i-c, element);
                lastSortedIndex = i;
            }
        }
        System.out.println("-----------------");
        for (Integer integer : sorted) {
            System.out.println(integer);
        }
    }
}
      
