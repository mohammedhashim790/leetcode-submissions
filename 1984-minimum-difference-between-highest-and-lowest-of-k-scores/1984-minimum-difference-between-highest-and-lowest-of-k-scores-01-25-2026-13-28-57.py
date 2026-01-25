class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        m = 100_000_000
        nums = sorted(nums)
        for i in range(0, len(nums)-k+1):            
            r = nums[i: i+k]
            m1 = min(r)
            m2 = max(r)
            m = min(m, abs(m1-m2))


        return m