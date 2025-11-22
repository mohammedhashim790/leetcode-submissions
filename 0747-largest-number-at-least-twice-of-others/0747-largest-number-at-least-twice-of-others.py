class Solution:
    def dominantIndex(self, nums: List[int]) -> int:

        c = nums.copy()
        c.sort()

        l,r = c[-2],c[-1]

        if l*2 <= r:
            return nums.index(r)
        return -1
