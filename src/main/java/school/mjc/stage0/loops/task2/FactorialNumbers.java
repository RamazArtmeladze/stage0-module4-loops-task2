package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;
        while (currentNumber <= printToInclusive) {
            System.out.println(factorial(currentNumber));
            currentNumber++;
        }
    }
}

