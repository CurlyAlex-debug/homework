public class Color {
    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void main(String[] args) {
        printColor();
    }
}
