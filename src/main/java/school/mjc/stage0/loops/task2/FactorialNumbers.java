package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
int i = printToInclusive, factor = 1;
                while (printToInclusive / i != printToInclusive) {
                    factor = factor * i;
                    i--;
                    System.out.println(factor);
                }
    }
}
