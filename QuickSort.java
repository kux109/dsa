import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(5,3,2,4,1,7,9,8,6));
        System.out.println("Unsorted Array - "+arr);
        quicksortFunct(arr, 0, arr.size()-1);
        System.out.println("Sorted Array - "+ arr);
        
    }

    public static void quicksortFunct(List<Integer> arr, Integer start, Integer end){
        if (start < end) { // Base case to stop recursion
            int pivotIndex = partition(arr, start, end);
            quicksortFunct(arr, start, pivotIndex - 1);
            quicksortFunct(arr, pivotIndex + 1, end);
        }  
    }

    private static Integer partition(List<Integer> arr, Integer start, Integer end) {
        Integer pivot = arr.get(end);
        Integer pIndex = start;
        for(int i=start; i<end; i++){
            if(arr.get(i) <= pivot){
                arraySwap(arr,i,pIndex);
                pIndex++;
            }
            
        }
        arraySwap(arr, pIndex, end);
        return pIndex;
    }

    public static void arraySwap(List<Integer> arr,Integer a,Integer b ){
        Integer temp = arr.get(b);
        arr.set(b, arr.get(a));
        arr.set(a,temp);
    }
}

