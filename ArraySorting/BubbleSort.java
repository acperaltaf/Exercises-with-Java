package ArraySorting;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Inputs validation
        if (array == null || array.length <= 1) {
            return;
        }
        
        // Bubble sort algorithm
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            // If there is no swap in this iteration, the array is already sorted
            if(!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        // Example array
        int[] numbers = {8,2,6,3,1,5};

        // Sort the array
        bubbleSort(numbers);
    
        // Show the result
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
