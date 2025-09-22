class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=n-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index--;
            }
        }
        while(index>=0){
            nums[index]=0;
            index--;
        }
        
    }
}
