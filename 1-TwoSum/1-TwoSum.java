// Last updated: 7/9/2026, 10:15:31 AM
class Solution{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> app=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(app.containsKey(complement)){
                return new int[]{app.get(complement),i};
            }
            app.put(nums[i],i);
        }
        return new int[]{};
    }
}