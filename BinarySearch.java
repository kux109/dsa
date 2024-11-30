public class BinarySearch {
    public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int ans = bsearch(a,2);
    System.out.println("Answer is");
    System.out.println(ans);

    }
    
    public static int bsearch(int[] mylist,Integer item){
        int low = 0;
        int high = mylist.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            int geuss = mylist[mid];
            if(geuss == item){
                return mid;
            }
            if(geuss > item){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}