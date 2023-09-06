import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci_Sequence_Generator {

    //The program main method, i.e the entry point to the program
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        int input;
        while (true) {
            //Try and catch block handles input error
            try {
                System.out.print("Enter the number of terms you want to print in the Fibonacci sequence " +
                        "make sure your input is positive: ");
                input = getInput.nextInt();
                if (input > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer, your input is invalid");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a positive integer, your input is invalid");
                //Takes care of invalid input
                getInput.nextLine();
            }
        }

        print_Fibonacci(input);

        getInput.close();
    }

    //The method that handles and generates the Fibonacci sequence
    public static void print_Fibonacci(int input) {
        long[] fob_sequence = new long[input];
        fob_sequence[0] = 0;
        if (input > 1) {
            fob_sequence[1] = 1;
        }

        for (int i = 2; i < input; i++) {
            fob_sequence[i] = fob_sequence[i - 1] + fob_sequence[i - 2];
        }

        System.out.print("The Fibonacci Sequence up to " + input + " terms include : ");
        for (int t = 0; t < input; t++) {
            System.out.print(fob_sequence[t] + " ");
        }
    }
}
