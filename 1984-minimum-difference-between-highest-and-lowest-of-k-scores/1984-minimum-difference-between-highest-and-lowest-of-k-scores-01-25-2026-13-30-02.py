class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        l = 0
        r = k
        m1 = nums[l]
        m2 = nums[r-1]
        m = abs(m1-m2)
        l+=1
        for r in range(k, len(nums)):
            m1 = nums[l]
            m2 = nums[r]
            m = min(m, abs(m1-m2))
            l+=1
        return m