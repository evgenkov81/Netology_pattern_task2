import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int size, maxValue, threshold;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Run the program");
        Scanner scanner = new Scanner(System.in);
        logger.log("Asking the user to enter input for the list.");
        System.out.println("Enter list size: ");
        size = scanner.nextInt();
        System.out.println("Enter an upper bounds to the values: ");
        maxValue = scanner.nextInt();
        logger.log("Create and populate a list.");
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        System.out.println("Here is a random list: " + list);
        logger.log("Asking the user to enter input for filtering. ");
        System.out.println("Enter the threshold to the filter");
        threshold = scanner.nextInt();
        logger.log("Start filtering.");
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Display result.");
        System.out.println("Filtered list: " + result);
        logger.log("Program completed");
    }
}

