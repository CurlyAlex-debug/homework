public class CheckSumNumbers {
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <=20;
    }
    public static void main(String[] args) {
        System.out.println(checkSumInRange(9, 6));
        System.out.println(checkSumInRange(2, -5));
    }
}