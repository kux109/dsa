import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> unsortedArray = new ArrayList<>(Arrays.asList(4, 2, 7, 5, 3, 8, 9, 6, 1));
        System.out.println("Unsorted Array - "+unsortedArray);
        System.out.println("Merge Sorted Array - "+ mergeSortFunc(unsortedArray));
    }

    public static List<Integer> mergeSortFunc(List<Integer> a){
        if(a.size() <= 1){
            return a;
        }
        Integer mid = a.size()/2;
        List<Integer> left = mergeSortFunc(createSubarray(a,0,mid-1));
        List<Integer> right = mergeSortFunc(createSubarray(a,mid,a.size()-1));
        return mergeFunc(left, right);
        
    }

    private static List<Integer> createSubarray(List<Integer> a, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for(int i=start; i<=end; i++){
            result.add(a.get(i));
        }
        return result;
    }

    public static List<Integer> mergeFunc(List<Integer> left, List<Integer> right){
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i <= left.size()-1 && j <= right.size()-1){
            if(left.get(i) < right.get(j)){
                result.add(left.get(i));
                i++;
            }
            else{
                result.add(right.get(j));
                j++;
            }
        }
        while(i<= left.size()-1){
            result.add(left.get(i));
            i++;
        }

        while (j <= right.size()-1) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
