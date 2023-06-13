
// Задание 2. 
// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, 
// после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите последовательность целых чисел, оканчивающуюся нулем:");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        int sum = 0;
        boolean positiveBeforeNegative = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = Integer.parseInt(numbers[i]);
            int nextNumber = Integer.parseInt(numbers[i + 1]);

            if (currentNumber > 0 && nextNumber < 0) {
                sum += currentNumber;
            }
        }

        System.out.println("Сумма положительных чисел, после которых следует отрицательное число: " + sum);
    }
}
