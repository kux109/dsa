public class ReverseStringRecursion {
    public static void main(String[] args) {
        String a = "racecar";
        System.out.println("Current String - "+ a);
        System.out.println("Reversed String is "+ rev(a));
    }

    public static String rev(String a){
        String ans = "";
        if(a.length() == 1){
            return a;
        }
        ans = a.charAt(a.length()-1) + rev(a.substring(0, a.length()-1));
        return ans;
    }
}
