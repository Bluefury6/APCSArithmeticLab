import java.util.Scanner;

public class Calc {
    Scanner in = new Scanner(System.in);

    public String add() {

        System.out.println("Addition is when two numbers are combined.");

        System.out.println("Please input a number:");
        double num1 = in.nextDouble();
        System.out.println("Please input a second number:");
        double num2 = in.nextDouble();

        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtract() {
        System.out.println("Subtraction finding the difference between two numbers.");

        System.out.println("Please input a number:");
        double num1 = in.nextDouble();
        System.out.println("Please input a second number:");
        double num2 = in.nextDouble();

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply() {
        System.out.println("Multiplication is when a number is added to itself a second number of times.");

        System.out.println("Please input a number:");
        double num1 = in.nextDouble();
        System.out.println("Please input a second number:");
        double num2 = in.nextDouble();

        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide() {
        System.out.println("Division is when a number is split into a second number's worth of groups.");

        System.out.println("Please input a number:");
        double num1 = in.nextDouble();
        System.out.println("Please input a second number:");
        double num2 = in.nextDouble();

        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

    public String modulus() {
        System.out.println("Modulus is the remaining number when a number is divided by a second number.");

        System.out.println("Please input a number:");
        double num1 = in.nextDouble();
        System.out.println("Please input a second number:");
        double num2 = in.nextDouble();

        return num1 + " % " + num2 + " = " + (num1 % num2);
    }
}

