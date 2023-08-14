public class BubbleSortCities {
    public static void main(String[] args) {
        String[] cities = args;
        int n = cities.length;

        // Bubble sort algorithm to sort cities in alphabetical order
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (cities[j].compareToIgnoreCase(cities[j+1]) > 0) {
                    String temp = cities[j];
                    cities[j] = cities[j+1];
                    cities[j+1] = temp;
                }
            }
        }

        // Print the sorted cities
        System.out.println("Sorted Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
