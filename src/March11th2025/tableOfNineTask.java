package March11th2025;

public class tableOfNineTask {
    public static void main(String[] args) {
        int table = 9;
        System.out.printf("%d x 1 = %d\n", table, table * 1);
        System.out.printf("%d x 2 = %d\n", table, table * 2);
        System.out.printf("%d x 3 = %d\n", table, table * 3);
        System.out.printf("%d x 4 = %d\n", table, table * 4);
        System.out.printf("%d x 5 = %d\n", table, table * 5);
        System.out.printf("%d x 6 = %d\n", table, table * 6);
        System.out.printf("%d x 7 = %d\n", table, table * 7);
        System.out.printf("%d x 8 = %d\n", table, table * 8);
        System.out.printf("%d x 9 = %d\n", table, table * 9);
        System.out.printf("%d x 10 = %d\n", table, table * 10);

        System.out.println("Multiplication Table of 9");
        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " = " + (9 * i));
        }
    }
}

