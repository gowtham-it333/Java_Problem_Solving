import java.util.ArrayList;
import java.util.Collections;

public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i : nums1) {
            ls.add(i);
        }
        for (int i : nums2) {
            ls.add(i);
        }
        Collections.sort(ls);
        if (ls.size() % 2 == 1)
            return ls.get(ls.size() / 2);
        return (ls.get(ls.size() / 2) + ls.get((ls.size() / 2) - 1)) / 2.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        MedianofTwoSortedArrays medianFinder = new MedianofTwoSortedArrays();

        double median = medianFinder.findMedianSortedArrays(nums1, nums2);

        System.out.println("Median: " + median);

        int[] nums1Another = {1, 2};
        int[] nums2Another = {3, 4};

        double medianAnother = medianFinder.findMedianSortedArrays(nums1Another, nums2Another);

        System.out.println("Median: " + medianAnother);
    }
}
