public class CountdownRecursion {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Countdown for "+a);
        countDown(a);
    }

    public static void countDown(int a){
        System.out.println(a);
        if(a <= 1){
            return;
        }
        else{
            countDown(a-1);
        }
    }
}
