package MVC3.View;

import MVC3.Controller.CalculatorController;

import java.util.Scanner;

public class CalculatorView {

    Scanner scanner = new Scanner(System.in);
    String option;
    CalculatorController controller = new CalculatorController();

    public void start() {

        int a = 0;
        int b = 0;

        whileloop:
        while (true) {

            System.out.println("what do you want to do? add, subtract, multiply, divide");
            option = scanner.nextLine();

            switch (option) {
                case "add":
                    System.out.println("first number: ");
                    a = scanner.nextInt();
                    System.out.println("second number: ");
                    b = scanner.nextInt();
                    System.out.println( a + " + " + b+ " = " + controller.add(a,b));
                    break;
                case "subtract":
                    System.out.println("first number: ");
                    a = scanner.nextInt();
                    System.out.println("second number: ");
                    b = scanner.nextInt();
                    System.out.println( a + " - " + b + " = " + controller.subtract(a,b));
                    break;
                case "multiply":
                    System.out.println("first number: ");
                    a = scanner.nextInt();
                    System.out.println("second number: ");
                    b = scanner.nextInt();
                    try {
                        System.out.println( a + " * "+ b + " = "+controller.multiply(a,b));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "divide":
                    System.out.println("first number: ");
                    a = scanner.nextInt();
                    System.out.println("second number: ");
                    b = scanner.nextInt();
                    System.out.println(a + " / "+ b + " = " + controller.divide(a,b));
                    break;
                case "quit":
                    break whileloop;
                default:
                    break;
            }
            scanner.nextLine();
        }
    }
}
