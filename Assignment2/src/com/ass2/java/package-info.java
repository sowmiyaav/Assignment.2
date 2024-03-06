 // MathUtils class with static methods for basic arithmetic operations  
	public class MathUtils {  
	    // Static method for addition  
	    public static int add(int a, int b) {  
	        return a + b;  
	    }  
	    // Static method for subtraction  
	    public static int subtract(int a, int b) {  
	        return a - b;  
	    }  
	    // Static method for multiplication  
	    public static int multiply(int a, int b) {  
	        return a * b;  
	    }  
	    // Static method for division  
	    public static double divide(int a, int b) {  
	        if (b == 0) {  
	            throw new IllegalArgumentException("Cannot divide by zero.");  
	        }  
	        return (double) a / b;  
	    }  
	}  
	// Main class to demonstrate the usage of static methods from MathUtils class  
	public class StaticMethodExample {  
	    public static void main(String[] args) {  
	        // Input numbers  
	        int num1 = 10;  
	        int num2 = 5;  
	        // Using static methods from MathUtils class to perform arithmetic operations  
	        int sum = MathUtils.add(num1, num2);  
	        int difference = MathUtils.subtract(num1, num2);  
	        int product = MathUtils.multiply(num1, num2);  
	        double quotient = MathUtils.divide(num1, num2);  
	        // Displaying the results  
	        System.out.println("Sum: " + sum);  
	        System.out.println("Difference: " + difference);  
	        System.out.println("Product: " + product);  
	        System.out.println("Quotient: " + quotient);  
	    }  
	}  