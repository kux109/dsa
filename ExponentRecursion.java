public class ExponentRecursion {
    public static void main(String[] args) {
        int base = 2;
        int power = 9;
        System.out.println("Value of "+ base + " power "+ power + " is "+ excponent(base, power));
    }

    public static Long excponent(int base, int power){
        if(power == 1){
            return Long.valueOf(base);
        }
        return base * excponent(base, power-1);
    }
}
