public class problem {
    static float sum(float a, float b) {
        return (a + b);
    }

    static float sub(float a, float b) {
        return (a - b);
    }

    static float mul(float a, float b) {
        return (a * b);
    }

    static float div(float a, float b) {
        return (a / b);
    }

    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        // In static method object creation is not required...
        float summation = problem.sum(a, b);
        System.out.println("Sum=" + summation);
        float substraction = problem.sub(a, b);
        System.out.println("Subtraction=" + substraction);
        float Multiplication = problem.mul(a, b);
        System.out.println("Multiplication=" + Multiplication);
        float Division = problem.div(a, b);
        System.out.println("Division=" + Division);

    }
}
