//import java.util.Locale;
//import java.util.Scanner;
//
//
////import java.util.Random;
//
//// random class, and generate random
//
////import org.w3c.dom.ls.LSOutput;
//
////import java.util.Locale;
//
//
//
//// this is the third class
//// how to accept user input
//// scanner helps you to read input from various source
//// we typically accepts input, process it and gives out the results
////
////public class Main {
////
////  public static void main(String[] args){
////      // this is my fist Java program
////      /*
////      this
////      is
////      a
////      multi-line comment
////       */
////
////   System.out.println("I like pizza!");
////   System.out.println("it's really good");
////   System.out.println("Buy me pizza");
////
////
////
//// variable = reusable container for a value
////           a variable behaves as if it was the value it contains
////
//// Data types
//// primitive = simple value stored directly in memory(stack)
//// Reference = memory address (stack) that points to the (heap)
////
//// primitive vs Reference = stores memory address pointing to the actual data
////
//// steps in creating a variable
////      // 1. declaration
////      // 2. assignment
////
////      int age = 23;
////      int year = 2025;
////      int quantity = 1;
////
////      double price = 19.99;
////      double gpa = 3.5;
////      double temperature = -12.5;
////
////      // char is written with a single quotation
////
////     char grade = 'A';
////     char symbol = '!';
////     char currency = '$';
////
////     // boolean
////      boolean isStudent = false;
////      boolean forSale = true;
////      boolean isOnline = true;
////
////      if(isStudent){
////          System.out.println("You are a student");
////      }
////      else {
////          System.out.println("You are not a student");
////      }
////
////      // string are written  with double quote, while char single quote
////
////      String name = "Joan Faith";
////      String food = "Pizza";
////      String color = "Black";
////      System.out.println("Hello my name is " + name + " " + " i like " + food);
////  }
////
////
////}
//
//
////public class Main {
////
////    public static void main(String[] args){
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter your name: ");
////
////        String name = scanner.nextLine();
////
////        System.out.print("Enter your age: ");
////
////        int age = scanner.nextInt();
////
////        System.out.print("what is your gpa: ");
////        double gpa = scanner.nextDouble();
////
////        System.out.print("Are you a student? (true/false): ");
////        boolean isStudent = scanner.nextBoolean();
////
////        System.out.println("hello, my name is " + name );
////        System.out.println("i'm " + age + " years old");
////        System.out.println("my gpa is " + gpa);
////
////        if(isStudent){
////            System.out.println("Your are enrolled as Students");
////        }
////        else{
////            System.out.println("you are not enrolled");
////        }
//
//
//        // calculate area of rectangle
//
////        double width = 0;
////        double height = 0;
////        double area = 0;
////
////
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.print("Enter the width: ");
////        width = scanner.nextDouble();
////
////        System.out.print("Enter the height: ");
////        height = scanner.nextDouble();
////
////
////        area = width * height;
////
////        System.out.println("This is the area " + area + "cm^2");
////
////
////
////        scanner.close();
//
//
//        // MAD LIBS GAME
//
////        Scanner scanner = new Scanner(System.in);
////
////        String adjective1;   // description
////        String noun1;     // animal, place or thing
////        String adjective2;
////        String verb1;   // action
////        String adjective3;
////
////        System.out.print("Enter an adjective(Description): ");
////        adjective1 = scanner.nextLine();
////
////        System.out.print("Enter a noun(Animal or Person): ");
////        noun1 = scanner.nextLine();
////
////        System.out.print("Enter an adjective(Description): ");
////        adjective2 = scanner.nextLine();
////
////        System.out.print("Enter a verb end with -ing(action)");
////        verb1 = scanner.nextLine();
////
////        System.out.print("Enter an adjective(Description): ");
////        adjective3 = scanner.nextLine();
////
////        System.out.println("\nToday i went to a " + adjective1 + " Zoo.");
////        System.out.println("In an exhibit, i saw a " + noun1 + ".");
////        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
////        System.out.println("I was " + adjective3 + "!");
////
////        scanner.close();
//
//
////      Arithmetic operators
//
////        int x = 10;
////        int y = 3;
////        int z;
//
//       // z = x + y;
//        //z = x * y;
//        // z = x % y;
//
//        // we have the module % which store the remainder
//       // System.out.println(z);
//
////       Augmented assignment operator
//
////        int x = 10;
////        int y = 3;
//
//
////          x += y;
////          x -= y;
////        x *= y;
////        x /= y;
////        x %= y;
////
////        System.out.println(x);
//
//
////     increment and decrement operators
////        int x = 1;
//
//        // increment operator
////        x++;
////        x++;
//
//        // decrement operator
////        x--;
////
////        System.out.println(x);
//
//
//
//
//        // ORDER OF OPERATIONS [P-E-M-D-A-S] which means
//        // PARENTHESIS, EXPONENTS, MULTIPLICATION, DIVISION, ADDITION AND SUBSTRACTION
//
////        double results = 3 + 4 * (7 - 5)/ 2.0;
////
////        System.out.println(results);
//
//
////        String item;
////        double price;
////        int quantity;
////        char currency = '$';
////        double total;
////
////
////
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.print("What item would you like to buy?");
////        item = scanner.next();
////
////        System.out.print("What is the price for each? ");
////        price = scanner.nextDouble();
////
////        System.out.print("How many will you like? ");
////        quantity = scanner.nextInt();
////
////        total = price * quantity;
////
////        System.out.println("You have bought " + quantity + " " + item + "/s");
////        System.out.println("your total is " + currency + total );
//
//
//
//        // if statement = performs a block of code if its condition is true
//
////        Scanner scanner = new Scanner(System.in);
////
////
////        int age;
////        String name;
////        boolean isStudent;
////
////
////        System.out.print("Enter your name: ");
////        name = scanner.nextLine();
////
////        System.out.print("Enter your age: ");
////        age = scanner.nextInt();
////
////        System.out.print("Are you are a student(true/false): ");
////        isStudent = scanner.nextBoolean();
////
////  Group 1
////        if(name.isEmpty()){
////            System.out.println("you didn't enter your name!");
////        }
////        else {
////            System.out.println("hello " + name);
////        }
////
////
////
////  Group 2
////        if (age >= 65) {
////            System.out.println("You are a senior");
////        }
////        else if(age >= 18){
////            System.out.println("You are an adult!");
////        } else if (age < 0) {
////            System.out.println("you haven't been born yet");
////        } else if (age == 0) {
////            System.out.println("You are a baby");
////        } else{
////            System.out.println("You are a child!");
////        }
////        // Group 3
////        if(isStudent){
////            System.out.print("You are a student!");
////        }else{
////            System.out.print("You are not a Student");
////        }
////
////        scanner.close();
////     }
////}
//
////public  class Main {
////
////    public static void main(String[] args) {
//
////        Random random =new Random();
//
////        int number1;
////        int number2;
////        int number3;
////
////        number1 = random.nextInt(1,101);
////        number2 = random.nextInt(1,101);
////        number3 = random.nextInt(1,101);
////
////        System.out.println(number1);
////        System.out.println(number2);
////        System.out.println(number3);
//
//
////        double number;
////
////        number = random.nextDouble();
////
////        System.out.println(number);
//
////        boolean isHeads;
////
////        isHeads = random.nextBoolean();
////
////        System.out.println(isHeads);
////     if(isHeads){
////         System.out.println("Heads");
////     }else{
////         System.out.println("tails");
////     }
//
//
////        Scanner scanner = new Scanner(System.in);
//
////        double a;
////        double b;
////        double c;
////
////
////        System.out.print("Enter result for side A:");
////        a = scanner.nextDouble();
////
////        System.out.print("Enter result for side B:");
////        b = scanner.nextDouble();
////
////
////        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
////
////
////        System.out.println("The hypertenus (side c) is :" + c + "cm");
//
////        double radius;
////        double circumference;
////        double area;
////        double volume;
////
////        System.out.print("Enter the radius: ");
////        radius = scanner.nextDouble();
////
////        circumference = 2 * Math.PI * radius;
////        area = Math.PI * Math.pow(radius, 2);
////        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
////
////        System.out.printf("This is is circumference: %fcm\n", circumference);
////        System.out.printf("This is is area: %fcm^2\n ",  area );
////        System.out.printf("This is is volume: %fcm^3 \n", volume  );
////
////
////
////        scanner.close();
//
//
//        //NESTED IF STATEMENT
//
////        boolean isStudent = false;
////        boolean isSenior = false;
////        double price = 99.9;
////
////        if(isStudent){
////            if(isSenior){
////                System.out.println("you have a student discout price of 10%");
////                System.out.println("You have a senior discout of 20%");
////                price *= 0.7;
////            }else{
////                System.out.println("you only have a student discount of 10% ");
////                price *= 0.9;
////            }
////        }
////        else{
////            if(isSenior){
////                System.out.println("You have a discout price of 20%");
////                price *= 0.8;
////            }else{
////                price *=1;
////            }
////        }
////
////        System.out.printf("The price of a ticket is: $%.2f", price);
//
//
//        //  STRING METHOD
//
//
////        String name = "Faith Samuel";
////
////        int length = name.length(); // calculate the lenght
////        char letters = name.charAt(8);  // at 8, what char is number 8
////        int index = name.indexOf("h");   // a is at index what?
////        int lastIndex = name.lastIndexOf("u");
////
////        name = name.toUpperCase();
////
////        System.out.println(name);
//
//
//        // substring method
//
////        String email = "faith@12gmail.com";
////        String username = email.substring(0, email.indexOf("@"));
////        String Domain = email.substring(email.indexOf("@") + 1);
////        System.out.println(Domain);
//
//
//        // weight converter
//
//        // declare our variables
//        // welcome message
//        // prompt for user input
//        // covert lbs to kgs
//        // convert kgs to lbs
//        // else print not a valid choice
//
//
////        Scanner scanner = new Scanner(System.in);
//
////        double weight;
////        double newWeight;
////        int choice;
////
////
////        System.out.println("Welcome to conversion program");
////        System.out.println("option 1: covert lbs to kgs");
////        System.out.println("option 2: covert kgs to lbs");
////
////        System.out.print("Choose an option:");
////        choice = scanner.nextInt();
////
////
////        if(choice ==1){
////            System.out.print("Enter the weight in lbs:");
////            weight = scanner.nextDouble();
////            newWeight = weight * 0.453592;
////            System.out.printf("The new weight is: %f.2", newWeight);
////        } else if (choice == 2) {
////            System.out.print("Enter the weight in kgs:");
////            weight = scanner.nextDouble();
////            newWeight = weight * 2.20462;
////            System.out.printf("The new weight is: %f.2", newWeight);
////        }else{
////            System.out.println("Invalid option");
////        }
//
//
//        // ternary operator = (condition)? ifTrue: ifFalse
//
//
////        int score = 40;
////
////        String passFail = (score >= 65)? "PASS" : "FAIL";
////
////        System.out.println(passFail);
//
////        int number = 4;
////        String checkNumber = (number % 2 == 0)? "EVEN" : "ODD";
////
////        System.out.println(checkNumber);
//
//
//        // TEMPERATURE CONVERTER
//
////        Scanner scanner = new Scanner(System.in);
////
////       double temp;
////       double newTemp;
////       String unit;
////
////        System.out.print("Enter the temperature:");
////        temp = scanner.nextDouble();
////
////        System.out.print("Enter the units (C or F):");
////        unit = scanner.next().toUpperCase();
////
////
////       newTemp = (unit.equals("C"))? (temp -32) * 5/9 : (temp * 5/9) + 32;
////
////        System.out.printf("%.2f%s",newTemp, unit);
////
////
////
////        scanner.close();
//
//
//        // enhanced Switch = A replacement of any if else statement(java 14 features)
//
////        String day = "pizza";
////
////        switch(day){
////            case "Monday" -> System.out.println("its a WeekDay");
////            case "Tuesday" -> System.out.println("its a WeekDay");
////            case "Wednesday" -> System.out.println("its a WeekDay");
////            case "Thursday" -> System.out.println("its a WeekDay");
////            case "Friday" -> System.out.println("its a WeekDay");
////            case "Saturday" -> System.out.println("its a Weekend");
////            case "Sunday" -> System.out.println("its a Weekend");
////            default -> System.out.println(day + " is not a day");
////        }
//
//
////        Scanner scanner = new Scanner(System.in);
////
////        double firstNumber;
////        double secondNumber;
////        char operator;
////        double result = 0;
////
////
////        System.out.print("Enter the first Number:");
////        firstNumber = scanner.nextDouble();
////
////        System.out.print("Enter an operator(+, -, /, *, ^): ");
////        operator = scanner.next().charAt(0);
////
////
////        System.out.print("Enter the second Number:");
////        secondNumber = scanner.nextDouble();
////
////        switch (operator){
////            case '+' -> result = firstNumber + secondNumber;
////            case '-' -> result = firstNumber - secondNumber;
////            case '*' -> result = firstNumber * secondNumber;
////            case '/' -> {
////                if(secondNumber == 0){
////                    System.out.println("cannot be divide by zero!");
////                }else{
////                    result = firstNumber / secondNumber;
////                }
////            }
////            case '^' -> result = Math.pow(firstNumber, secondNumber);
////        }
////
////        System.out.println(result);
////
////
////
////        scanner.close();
////
//
//
//        // logical operator
//
//        // AND = &&
//        // OR = ||
//        // NOT = !
//
//
//        // WHILE LOOPS = Repeats some codes forever when some conditions remains true
//
//
//
//
//     public class Main {
//
//
//         public static void main(String[] args){
//
//
//             Scanner scanner = new Scanner(System.in);
//
////             String name = "";
////
////             while (name.isEmpty()) {
////                 System.out.print("Enter your name:");
////                 name = scanner.nextLine();
////             }
////             ;
////             System.out.print("Hello " + name);
//
//
//
////             String response = "";
////
////             while(!response.equals("Q")){
////                 System.out.println("You are playing a game!");
////                 System.out.print("Press Q to quit:");
////                 response = scanner.next().toUpperCase();
////             }
////
////             System.out.println("You have quit the game");
//
//
//
////             int age = 0;
////
////             do{
////                 System.out.println("Your age cant be negative");
////                 System.out.print("Enter your age:");
////                 age = scanner.nextInt();
////             }
////             while(age<0);
////
////             System.out.println(age + " years old");
//
////
////             int number = 0;
////
////             do{
////                 System.out.print("Enter your a number from 1 to 10:");
////                 number = scanner.nextInt();
////             }while (number < 1 || number > 10);
////
////             System.out.println("you picked " + number);
//
//
//
//
//             // FOR LOOP = execute a code a certain amount of times
//
//             // a for loop has three parameters the parameter, create a counter, condition or initiziation
//
////             for(int i = 0; i < 10; i++){
////                 System.out.println(i);
////             }
//
//
//
//             // nested loop = a loop inside a loop
//
//
//
////             for(int i = 1; i <=3; i++){
////                 for(int j = 1; j <=9; j++){
////                     System.out.print(j + " ");
////                 }
////             }
//
//
//             int rows;
//             int colums;
//             char symbol;
//
//
//             System.out.print("Enter the # of rows: ");
//             rows = scanner.nextInt();
//
//             System.out.print("Enter the # of colums: ");
//             colums = scanner.nextInt();
//
//             System.out.print("Enter the symbol to use: ");
//             symbol = scanner.next().charAt(0);
//
//             for(int i =0; i< rows; i++){
//                 for(int j = 0; j< colums; j++){
//                     System.out.print(symbol + " ");
//                 }
//
//                 System.out.println();
//             }
//
//
//
//
//
//             scanner.close();
//
//
//
//
//         }
//
//
//
//     }