package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int x = 0;

        if (multiplyByAndToInclusive > 0 ) {
            while (multiplyByAndToInclusive > x) {
                int result = x * multiplyByAndToInclusive;
                System.out.println(result);
                x ++;
            }
        }
        if (multiplyByAndToInclusive < 0 ) {
            while (multiplyByAndToInclusive <= x) {
                int result = x * multiplyByAndToInclusive * -1;
                System.out.println( result);
                x--;
            }
        }
        if (multiplyByAndToInclusive ==0 ) {
            System.out.println("");
            }
    }
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(0);
    }
}



