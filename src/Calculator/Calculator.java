package Calculator;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println(result );
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("На ноль делить нельзя");
                }
            default:
                throw new IllegalStateException("Не понятное значение: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double result;

        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше 1%");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть больше 100%");
        } else result = purchaseAmount - purchaseAmount * discountAmount / 100;

        return result; // Метод должен возвращать сумму покупки со скидкой
    }

    public static char getOperator() {
        System.out.println("Введите действие: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int getOperand() {
        System.out.println("Введите число: ");
        int operand = scanner.nextInt();
        return operand;
    }
}