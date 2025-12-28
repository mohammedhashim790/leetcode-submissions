class Solution {

    public int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = nums.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                index = mid;
                r = mid - 1;
            }
        }
        return index;
    }

    public int maximumCount(int[] nums) {

        int neg = this.binarySearch(nums, 0);
        int pos = nums.length - this.binarySearch(nums, 1);

        return Math.max(pos, neg);
    }
}