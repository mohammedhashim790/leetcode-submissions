class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums1.extend(nums2)
        nums1.sort()
        l = len(nums1)
        mid = l//2
        if l%2==0:
            print((nums1[mid] + nums1[mid-1])/2.0)
            return (nums1[mid] + nums1[mid-1])/2.0
        return nums1[mid]
        
        
        