public class FactorialRecursion {
    public static void main(String[] args) {
        int a = 9;
        System.out.println("Fact Number of order - "+ a + " is - "+ fact(a) );

    }

    public static Long fact(int a){
        if(a == 1){
            return 1L;
        }
        return a* fact(a-1);
    }
}
