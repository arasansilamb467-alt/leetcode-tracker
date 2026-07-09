// Last updated: 7/9/2026, 10:14:44 AM
import java.util.*;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int idx=nums.length-1;
        while(k>0){
            int val=nums[idx--];
            if(mul>1){
                ans+=1L*val*mul;
            }
            else{
                ans+=val;
            }
            mul--;
            k--;
        }
        return ans;
    }
}