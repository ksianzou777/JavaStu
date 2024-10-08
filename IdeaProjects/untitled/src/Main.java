import java.util.Scanner;

public class Main {

    // Измененный метод с учетом рекурсии
    public static int calculatePower(int number, int power) {
        if (power == 0) {
            return 1;  // Любое число в степени 0 равно 1
        } else if (power < 0) {
            return 1 / calculatePower(number, -power);  // Для отрицательных степеней
        } else {
            return number * calculatePower(number, power - 1);  // Рекурсивное возведение в степень
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод данных пользователем
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.print("Введите степень: ");
        int power = input.nextInt();

        // Проверка корректности данных
        if (power < 0) {
            System.out.println("Программа работает только с неотрицательными показателями.");
        } else {
            // Вычисление с помощью рекурсивного метода
            int result = calculatePower(number, power);
            System.out.println(number + " в степени " + power + " = " + result);
        }

        input.close();
    }
}
