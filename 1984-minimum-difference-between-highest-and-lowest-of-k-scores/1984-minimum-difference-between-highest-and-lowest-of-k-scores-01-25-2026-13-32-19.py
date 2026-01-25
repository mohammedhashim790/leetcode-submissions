class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        l = 0
        r = k
        m = 100_000_000
        for r in range(k-1, len(nums)):
            m1 = nums[l]
            m2 = nums[r]
            m = min(m, abs(m1-m2))
            l+=1
        return m