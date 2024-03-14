public class DatatypesChanging {
    // Original method with int parameters
    int sum(int a, int b) {
        return a + b;
    }
    // Overloaded method with double parameters
    double sum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        DatatypesChanging main = new DatatypesChanging();
        System.out.println("Sum of 2 and 3: " + main.sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + main.sum(2.5, 3.5));
    }
}