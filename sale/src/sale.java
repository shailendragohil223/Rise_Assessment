import java.util.InputMismatchException;
import java.util.Scanner;

public class sale 
{

    
    protected enum Product {
        APPLE(1, "Apple", 2.98),
        BANANA(2, "Banana", 4.50),
        MANGO(3, "Mango", 9.98),
        PINEAPPLE(4, "Pineapple", 4.49),
        CHERRY(5, "Cherry", 6.87);

        protected double price;

        protected int productNumber;

        protected String productTitle;

        private Product(int productNumber, String productTitle, double price) {
            this.price = price;
            this.productNumber = productNumber;
            this.productTitle = productTitle;
        }

        public static Product getByNumber(int number) {
            for (Product product : values()) {
                if (product.productNumber == number) {
                    return product;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return productNumber + " - " + productTitle + " - " + String.format("%.2f", price);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double sum = 0.0;

            int input = -1;

            while (input != 0) {
                System.out.println("Please make your choice: ");
                for (Product product : Product.values()) {
                    System.out.println(product);
                }
                System.out.println("0 - Quit and show sum");

                input = readNumberInput(scanner);

                if (input == 0) {
                    break;
                }

                if (input != -1) {
                    Product product = Product.getByNumber(input);

                    if (product == null) {
                        System.out.println("The entered product number was not correct. Please try again.");
                    } else {
                        System.out.println("Enter quantity of product [" + product.productTitle + "]:");

                        input = readNumberInput(scanner);

                        if (input > 0) {
                            sum += product.price * input;
                        }
                    }
                }
            }

            System.out.println("Total sum of all the chosen products is: " + String.format("%.2f", sum));
        }
    }

    private static int readNumberInput(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            String inputString = scanner.next();
            System.out.println("Input [" + inputString + "] was not correct. Please choose a number.");
            return -1;
        }
    }
}