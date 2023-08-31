package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = multiplyByAndToInclusive < 0 ? 0 : -multiplyByAndToInclusive;

        while (currentNumber <= multiplyByAndToInclusive) {
            int multipliedResult = currentNumber * multiplyByAndToInclusive;
            System.out.println(multipliedResult);
            currentNumber++;
        }
    }
}
