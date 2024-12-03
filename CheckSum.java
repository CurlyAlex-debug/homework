public class CheckSum {
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;
       if (sum <= 0) {
           System.out.println("Сумма отрицательная");
       } else {
            System.out.println("Сумма положительная");
        }
    }
    public static void main(String[] args) {
        checkSumSign();
    }
}