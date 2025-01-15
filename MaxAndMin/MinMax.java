package MaxAndMin;

public class MinMax {
    // Min
    public static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    // Max
    public static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] numbers = {5,2,9,3,12,52,60,32};
        int minimum = min(numbers);
        int maximum = max(numbers);

        System.out.println("Minimum number: " + minimum);
        System.out.println("Maximum number: " + maximum);
    }
}

