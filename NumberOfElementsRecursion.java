import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfElementsRecursion {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println("Number of elements in the list "+ a + " is - " + num(a));
    }

    private static Integer num(List<Integer> a) {
        if(a.isEmpty()){
            return 0;
        }
        return 1 + num(a.subList(0, a.size()-1));
    }
}
