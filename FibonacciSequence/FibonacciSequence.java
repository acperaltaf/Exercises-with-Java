package FibonacciSequence;
import java.util.ArrayList;

public class FibonacciSequence {
    public static void main(String[] args) {
        int limit = 6;
        ArrayList<Integer> sequence = fibonacciSequence(limit);
        System.out.printf("The fibonacci sequence up to %d is:\n",limit);
        System.out.println(sequence);
    }
    
    public static ArrayList<Integer> fibonacciSequence(int limit) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        for (int i = 2; i < limit; i++) {
            sequence.add(sequence.get(i-2) + sequence.get(i-1));
        }

        return sequence;
    }
}
