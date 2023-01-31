
//Fig 2.1: Comparison.java
// Comparison integers using if statements, relational operators
// and equality operators. 
import java.util.Scanner; // program uses class Scanner

public class Comparison {
    // main method begins execution of java application
    public static void main(String[] args) {
        // create a scanner to obtain input from the command line.
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        if ( number1 == number2)
            System.out.printf( "%d == %d\n", number1, number2);

        if ( number1 != number2)
            System.out.printf( "%d != %d\n", number1, number2);

        if ( number1 <= number2)
            System.out.printf( "%d <= %d\n", number1, number2);
    
        // else
        //     System.out.printf( "%d >= %d\n", number1, number2);
    } // end method main
} //end class Comparison