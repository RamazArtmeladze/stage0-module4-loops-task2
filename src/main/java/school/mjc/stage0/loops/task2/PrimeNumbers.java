package school.mjc.stage0.loops.task2;

import com.google.common.math.IntMath;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2;
        while (currentNumber <= printToInclusive) {
            if (IntMath.isPrime(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }
}



