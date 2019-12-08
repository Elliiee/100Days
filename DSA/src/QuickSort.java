public class QuickSort {
    /*
    Divide and Conquer
    Recursive algorithm
    Pivot
    Eventually, every element has been the pivot, so every element will be in its correct sorted position.
    O(nlogn)
    Unstable algorithm
     */

    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void quickSort(int[] input, int start, int end){
        if (end - start < 2){
            return; // 1 element array, no need to do anything.
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // Use the first element as the first pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){

            // note: empty loop body
            while ( i < j && input[--j] >= pivot); // decrease j


            if (i < j){
                input[i] = input[j];
            }

            // note: empty loop body
            while (i < j && input[++i] <= pivot); // increase i
            if (i < j){
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
