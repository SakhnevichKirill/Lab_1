import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите найти:");
        int n = scanner.nextInt();
        int N = 1;
        for (int i = 1; i <= n; i++)
        {
            N *= i;
        }
        System.out.println("Факториал числа " + n + " = " + N);
    }
}
