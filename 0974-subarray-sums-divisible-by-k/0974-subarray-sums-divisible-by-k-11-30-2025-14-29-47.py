class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        d = {0:1}
        s = c = 0

        for n in nums:
            s+=n

            if d.get(s % k) is not None:
                c+=d.get(s%k)
            d[s%k] = d.get(s%k, 0) + 1

        print(d)

        return c
