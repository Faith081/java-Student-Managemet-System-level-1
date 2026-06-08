import java.util.Scanner;

public class NewCalculator {

    private static final Scanner scanner = new Scanner(System.in);

    public void start(){

        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;


        System.out.print("Enter the first Number : ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, ^, /)");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second Number : ");
        secondNumber = scanner.nextDouble();

        switch (operator){
        case '+' -> result =  firstNumber + secondNumber;
        case '-' -> result =  firstNumber - secondNumber;
        case '*' -> result =  firstNumber * secondNumber;
        case '^' -> Math.pow(firstNumber, secondNumber);
        case '/' -> {
            if(secondNumber == 0){
                System.out.println("cannot be divided by 0");
            }else {
                result = firstNumber / secondNumber;
            }
        }
            default -> System.out.println(operator + "invalid operator");


        }

        System.out.println(result);
    }


    public void stop(){
        scanner.close();
        System.out.println("Calculator App has closed");
    }

    public boolean askUserToContinue(){
        System.out.println("Do you want to continue");
        String response = scanner.next();
        return response.equalsIgnoreCase("y");
    };
}
