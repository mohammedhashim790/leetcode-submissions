class Solution:
    def trap(self, h: List[int]) -> int:
        l = len(h)
        leftMax, rightMax = [0], [0] * (l)
        res = 0

        for i in range(1,l):
            leftMax.append(max(leftMax[i-1], h[i-1]))

        for i in range(l-2, -1, -1):
            rightMax[i] = max(rightMax[i+1], h[i+1])

        for i in range(l):
            m = min(leftMax[i], rightMax[i]) - h[i]

            if m>=0: 
                res+=m

    
        # print(leftMax)
        # print(rightMax)

        return res