import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;


        System.out.print("Enter the first Number : ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator(+, -, *, /, ^) :");
        operator = scanner.next().charAt(0);


        System.out.print("Enter the second Number: ");
        num2 = scanner.nextDouble();



        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1, num2);
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot be divided by zero!");
                } else {
                    result = num1 / num2;
                }
            }
            default -> System.out.println(operator + "not an operator");

        }

        System.out.println(result);


        scanner.close();

    }

}

