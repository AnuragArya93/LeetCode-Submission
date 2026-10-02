class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j:nums){
            if(nums[i]!=j){
                i++;
                nums[i]=j;
            }
        }
        return i+1;
    }
}