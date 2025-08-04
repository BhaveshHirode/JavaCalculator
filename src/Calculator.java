import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b){
        return  a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        if (b==0){
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a/b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char choice;

        do{
            System.out.println("\n-- Java Console Calculator");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator(+, -, *, /):");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;

            switch (operator){
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result= sub(num1, num2);
                    break;
                case '*':
                    result = mul(num1, num2);
                    break;
                case '/':
                    result = div(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    result = Double.NaN;
            }
            System.out.println("Result: " +result);

            System.out.print("Do yo want to perform another calculation? (yes/no): ");
                choice = sc.next().charAt(0);
        }

        while (choice == 'y' || choice == 'Y');
        sc.close();
        System.out.println("Calculator closed. ");
    }
}
