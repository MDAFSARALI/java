public class InvalidControlArguments {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            try {
                // Attempt to convert the argument to an integer
                int value = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                // The argument was not a valid integer
                System.err.println("Invalid control line argument: " + arg);
                count++;
            }
        }
        System.out.println("Caught " + count + " invalid control line arguments.");
    }
}
