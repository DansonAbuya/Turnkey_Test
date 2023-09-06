public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        // The error was in the following lines double average = total / numbers.length and
        //return average
        //The intended average result is of type double, while the variables total and
        // numbers are of int type
        //There is a redundancy in the two lines as well
        //To fix the bugs, we can do the following
        //1. We need cast the result of total/numbers to double type or just return
        // an int average result of total/numbers
        //2.To reduce the local variable 'average' redundancy, we can simple return the cast result of total/numbers
        // or just the int result of total/numbers as shown below
        return (double) total / numbers.length;
    }
    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }


}
