public class RBSDuplicate {//
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
    public boolean search(int[] nums, int target) {
        int pivot = findPivotDup(nums);

        // If no pivot, array is fully sorted
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // Check if target is the pivot value
        if (nums[pivot] == target) {
            return true;
        }

        // Decide which part of the array to search
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    private boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    private int findPivotDup(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot found
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            // Case 2: Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // Check if start or end is the pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && nums[end - 1] > nums[end]) {
                    return end - 1;
                }
                end--;
            }
            // Case 3: Pivot must be in the right half
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }
            // Case 4: Pivot must be in the left half
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
