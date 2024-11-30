public class FibonacciRecursion {
    public static void main(String[] args) {
        int a = 32;
        System.out.println("Fibonacci Number of order - "+ a + " is - "+ fibonacciNumber(a) );
    }

    public static Integer fibonacciNumber(int a){
        if(a <= 1){
            return a;
        }
        return fibonacciNumber(a-1) + fibonacciNumber(a-2);
    }
}
