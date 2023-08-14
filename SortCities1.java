import java.util.Arrays;

public class SortCities1 {
    public static void main(String[] args) {
        // Get the cities from command line arguments
        String[] cities = args;

        // Sort the cities in alphabetical order using the compareTo() method
        Arrays.sort(cities);
        

        // Print the sorted cities
        System.out.println("Sorted Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
