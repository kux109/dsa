public class SumRecursion {
    public static void main(String[] args) {
        int a = 32;
        System.out.println("Natural Number sum form 1 to "+ a + " is - "+ sum(a));
    }

    public static Integer sum(int a){
        if(a <= 1){
            return 1;
        }
        return a + sum(a-1);
    }
}
