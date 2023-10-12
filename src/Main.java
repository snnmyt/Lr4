import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо два цілих числа з клавіатури
        System.out.print("Введіть перше ціле число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введіть друге ціле число: ");
        int num2 = scanner.nextInt();

        // Перевіряємо, чи менше з чисел менше від квадратного кореня з більшого числа
        boolean condition1 = (num1 < num2) ? (Math.sqrt(num2) > num1) : (Math.sqrt(num1) > num2);

        if (condition1) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }

        // Зчитуємо ціле число та рядок з клавіатури
        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        System.out.print("Введіть рядок: ");
        String str = scanner.next();

        // Перевіряємо, чи це число дорівнює довжині рядка
        boolean condition2 = (num == str.length());

        if (condition2) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}