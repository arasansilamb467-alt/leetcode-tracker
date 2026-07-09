# Last updated: 7/9/2026, 10:14:48 AM
class Solution:
    def maxSubarraySum(self, nums: List[int], k: int) -> int:
        def Ke(A):
            c=m=-float('inf')
            for x in A:
                c=max(c+x,x)
                m=max(m,c)
            return m
        p=max(Ke(nums[:-1]),Ke(nums[1:])) if len(nums) > 1 else -float('inf')

        def G(is_nul):
            a=b=c=r=-float('inf')
            for x in nums:
                y=x * k if is_nul else int(x/k)
                c,b,a=max(b+x,c+x) ,max(a+y,b+y,y), max(a+x,x)
                r=max(r,b,c)
            return r
        return max(p,G(True),G(False))