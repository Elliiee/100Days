import java.util.PriorityQueue;

public class KthLargestElement {
    public int kthLargestHeap(int[] nums, int k){
        // initiate heap "the smallest first"
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        // what is that part in the ()?

        // keep k largest elements in the heap
        for (int n: nums){
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        return heap.poll();
    }
}
