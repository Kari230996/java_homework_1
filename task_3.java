/*
 * Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
 */

import java.util.Scanner;

public class task_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double x, y, ans;
        char op;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        x = reader.nextDouble();
        y = reader.nextDouble();
      
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch (op) {
            case '+':
                ans = x + y;
                break;
            case '-':
                ans = x - y;
                break;
            case '*':
                ans = x * y;
                break;
            case '/':
                ans = x / y;
                break;
            default:
                System.out.print("Error! Enter correct operator");
                reader.close();
                return;
        }
        System.out.print("\nYour given result: ");
        System.out.printf(x +  " " + op + " " + y + "=" + " " + ans);
        reader.close();

    }

}
