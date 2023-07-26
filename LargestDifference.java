import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestDifference {

    public static void main(String[] args) {
        
        ArrayList<Integer> array_list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers that form your array, When done press Y to terminate:");
        while (true) {
            try {
                String user_input = scanner.next();
                if (user_input.equalsIgnoreCase("y")) {
                    break;
                }
                int number = Integer.parseInt(user_input);
                array_list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer or enter Y  to terminate.");
            }
        }

        if (array_list.isEmpty()) {
            System.out.println("Please enter some numbers so you can get a difference.");
        } else {
			int number_difference = findLargestDifference(array_list);
			System.out.println("The  difference is : " + number_difference);
        }
        scanner.close();
    }
    
// Finding the difference
  	public static int findLargestDifference(List<Integer> numbers) {
  		if (numbers == null || numbers.size() < 2) {
  			return 0;
  		}

  		int minimum = Collections.min(numbers);
  		int maximum = Collections.max(numbers);

  		return maximum - minimum;
  	}
}
