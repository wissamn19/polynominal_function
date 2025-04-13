package polynom;
import java.util.Scanner;
public class Polynominal {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int a = getCoefficient(scanner, "Enter coefficient a: ");
        int b = getCoefficient(scanner, "Enter coefficient b: ");
        int c = getCoefficient(scanner, "Enter coefficient c: ");

       
        String polynomial = formatPolynomial(a, b, c);
        System.out.println("Formatted Polynomial: " + polynomial);
    }

    
    private static int getCoefficient(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("That is not a number,Please enter a valid integer.");
                scanner.next(); 
            }
        }
    }

    public static String formatPolynomial(int a, int b, int c) {
        StringBuilder result = new StringBuilder();

       
        if (a != 0) {
            if (a == 1) {
                result.append("x^2");
            } else if (a == -1) {
                result.append("-x^2");
            } else {
                result.append(a).append("x^2");
            }
        }

        
        if (b != 0) {
            if (result.length() > 0) {
                result.append(b > 0 ? " + " : " - ");
            } else {
                result.append(b < 0 ? "-" : "");
            }
            if (Math.abs(b) == 1) {
                result.append("x");
            } else if (Math.abs(b) > 1) {
                result.append(Math.abs(b)).append("x");
            }
        }

    
        if (c != 0) {
            if (result.length() > 0) {
                result.append(c > 0 ? " + " : " - ");
            } else {
                result.append(c < 0 ? "-" : "");
            }
            result.append(Math.abs(c));
        }

     
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}
