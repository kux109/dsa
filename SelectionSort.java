import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        List<Integer> oldArr = new ArrayList<>(Arrays.asList(1, 5, 2, 7, 4, 9));
        System.out.println("Unsorted Array - " + oldArr);
        System.out.println("Selection Sorted Array - " + selectionSort(oldArr));     
    }

    public static int findSmallest(List<Integer> arr) {
        int smallestIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int smallestIndex = findSmallest(arr);
            newArr.add(arr.get(smallestIndex));
            arr.remove(smallestIndex);
        }
        return newArr;
    }
}
