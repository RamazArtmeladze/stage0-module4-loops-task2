package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;

        while (currentNumber >= multiplyByAndToInclusive) {
            int multipliedResult = currentNumber * multiplyByAndToInclusive;
            System.out.println(multipliedResult);
            currentNumber--;
        }
    }
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        int multiplyByAndToInclusive = -5; // You can change this value as needed
        multiplication.printMultiplied(multiplyByAndToInclusive);
    }
}
