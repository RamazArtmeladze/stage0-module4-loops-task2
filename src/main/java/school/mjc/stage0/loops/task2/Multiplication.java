package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.println("");
            return;
        }

        int currentNumber = 0;

        while (currentNumber <= multiplyByAndToInclusive) {
            int multipliedResult = currentNumber * multiplyByAndToInclusive;
            System.out.println(multipliedResult);
            currentNumber++;
        }
    }
}

