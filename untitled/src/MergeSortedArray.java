import java.util.Arrays;

public class MergeSortedArray {
    public void mergeMergeAndSort(int[] nums1, int m, int[] nums2, int n){
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public void mergeFromBegin(int[] nums1, int m, int[] nums2, int n){

        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        // two pointers for nums1_copy and nums2
        int p1 = 0;
        int p2 = 0;

        // set pointer for nums1
        int p = 0;

        // compare elements from nums1_copy and nums2 and add the smallest one into nums1
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 -p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 -p2);
    }

    public void mergeFromEnd(int[] nums1, int m, int[] nums2, int n){
        // two pointers from nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;

        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
