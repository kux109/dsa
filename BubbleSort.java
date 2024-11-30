public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {1,4,2,7,5,3,9,8,6};
        System.out.println("Unsorted Array - ");
        printArr(a);
        bubbleFunc(a);
        System.out.println("Bubble Sorted Array - ");
        printArr(a);
        
    }

    public static void swapFunc(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void bubbleFunc(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]> arr[j+1]){
                    swapFunc(arr, j, j+1);
                }
            }
        }
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Add a comma and space between elements, except after the last element
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
