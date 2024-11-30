import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumRecursion {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,5,2,7,4,2,77,43,65,23));
        
        System.out.println("Largest number is - "+largestNum(a));
            
    }

    private static Integer largestNum(List<Integer> a) {
        return recHelper(a, 1, a.get(0));
    }

    private static Integer recHelper(List<Integer> a , Integer index, Integer currentMax){
        if(index == a.size()){
            return currentMax;
        }
        Integer newMax =  Math.max(currentMax,a.get(index));
        return recHelper(a,index+1,newMax);
    }


}
