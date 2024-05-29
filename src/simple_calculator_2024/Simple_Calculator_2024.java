
package simple_calculator_2024;

public class Simple_Calculator_2024 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Test the calculator methods
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        
        System.out.println("Division: " + calculator.divide(5, 3));
    }
    
}
