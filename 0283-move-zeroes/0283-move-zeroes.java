class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        // int temp;
        // for(int j=0; j<nums.length;j++){
        //     if(nums[j]!=0){
        //         //swap
        //         temp=nums[i];
        //        nums[i] =nums[j];
        //        nums[j]=temp;
        //        i++;
        //     }
        // }
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=0){
                 nums[i] =nums[j];
                 i++;
            }
        }
        for( ;i<nums.length;i++){
            nums[i]=0;
        }

    }
}