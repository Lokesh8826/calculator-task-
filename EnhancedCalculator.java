import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Enhanced Console Calculator ---");
            System.out.println("1. Basic Arithmetic");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Unit Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: basicArithmetic(scanner); break;
                case 2: scientificCalculator(scanner); break;
                case 3: unitConversion(scanner); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    // 1. Basic arithmetic operations
    static void basicArithmetic(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Choose operation: + - * /");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default: System.out.println("Invalid operator!");
        }
    }

    // 2. Scientific operations
    static void scientificCalculator(Scanner scanner) {
        System.out.println("Choose function: 1. Square Root  2. Exponentiation");
        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                System.out.println("Square root: " + Math.sqrt(num));
                break;
            case 2:
                System.out.print("Enter base and exponent: ");
                double base = scanner.nextDouble();
                double exp = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exp));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    // 3. Unit conversion
    static void unitConversion(Scanner scanner) {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. INR to USD");
        System.out.print("Choose option: ");
        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter Celsius: ");
                double c = scanner.nextDouble();
                System.out.println("Fahrenheit: " + (c * 9/5 + 32));
                break;
            case 2:
                System.out.print("Enter Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.println("Celsius: " + ((f - 32) * 5/9));
                break;
            case 3:
                System.out.print("Enter INR: ");
                double inr = scanner.nextDouble();
                double usd = inr / 83.0; // Example rate
                System.out.println("USD: " + usd);
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
}