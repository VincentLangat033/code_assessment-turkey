public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = (double) total / numbers.length;

        return average;
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 37};
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}
/*

The possible error in the code above is caused by  ( total / numbers.length) integer division
To fix this error, the division is done using floating point division
*/
