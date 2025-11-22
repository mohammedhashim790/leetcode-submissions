class Solution:
    def longestOnes(self, n: List[int], k: int) -> int:
        l , r, m, le = 0, 0, 0, len(n)

        zc = 0
        while r < le:
            if n[r] == 0:
                zc+=1
            while zc > k:
                if n[l]==0: 
                    zc-=1
                l+=1
            m = max(m, r - l +1)
            r+=1
        return m
        
        