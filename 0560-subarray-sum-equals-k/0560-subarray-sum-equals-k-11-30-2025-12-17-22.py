class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {0:1}
        s = 0
        c = 0
        for i in nums:
            s+=i
            if d.get(s-k) is not None:
                c+=d.get(s-k)
            d[s] = 1 + d.get(s, 0)
        print(d)

        return c