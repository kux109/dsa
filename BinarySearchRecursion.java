import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer target = 4;
        System.out.println("The Number " + target + " is present in the array "+ a+ " at the position - "+ binarySearch(a, target, a.size()-1, 0));
    }

    public static Integer binarySearch(List<Integer> a,Integer target,Integer high, Integer low){
        if(low > high){
            return -1;
        }
        Integer mid = low + (high - low) / 2;
        if(a.get(mid) == target){
            return mid;
        }
        if(a.get(mid) > target){
            return binarySearch(a, target, mid-1, low);
        }
        return binarySearch(a, target, high, mid+1);
        
    }
}
