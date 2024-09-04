public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int numsSize = nums.length;
        int[] arr = new int[numsSize];

        for (int num : nums) {
            if (num > 0 && num <= numsSize) {
                arr[num - 1] = num;
            }
        }

        for (int i = 0; i < numsSize; i++) {
            if (arr[i] == 0) {
                return i + 1;
            }
        }

        return numsSize + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositive finder = new FirstMissingPositive();

        int[] nums1 = {1, 2, 0};
        System.out.println("First missing positive: " + finder.firstMissingPositive(nums1)); // Output: 3

        int[] nums2 = {3, 4, -1, 1};
        System.out.println("First missing positive: " + finder.firstMissingPositive(nums2)); // Output: 2

        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println("First missing positive: " + finder.firstMissingPositive(nums3)); // Output: 1

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("First missing positive: " + finder.firstMissingPositive(nums4)); // Output: 6
    }
}
