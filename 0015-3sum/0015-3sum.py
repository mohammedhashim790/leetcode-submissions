class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        l = len(nums) - 1
        i = 0
        nums = sorted(nums)
        res = []

        d = {}

        while i < l:
            target = nums[i] * -1
            j, k = i+1, l
            while j < k:
                t = nums[j] + nums[k]
                if t == target:
                    # this is the answer
                    m = str([nums[i], nums[j], nums[k]])
                    if m not in d.keys():
                        d[m] = 1
                        res.append([nums[i], nums[j], nums[k]])
                    j+=1
                    k-=1

                elif t<target:
                    j+=1
                elif t>target:
                    k-=1

            i+=1

        return res
        