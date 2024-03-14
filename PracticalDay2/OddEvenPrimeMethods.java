class Child extends parent {
    @Override
    void even() {
        System.out.println("Even numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    @Override
    void odd() {
        System.out.println("Odd numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    @Override
    void prime() {
        System.out.println("Prime numbers from 1 to 30:");
        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
public class OddEvenPrimeMethods {
    public static void main(String[] args) {
        Child child = new Child();
        child.even();
        System.out.println();
        child.odd();
        System.out.println();
        child.prime();
    }
}