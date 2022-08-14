class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
        int CurrentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        
        if(n==1){
            
            return nums[0];
        }
        for(int i=0;i<n;i++){
            CurrentSum+=nums[i];
            if(CurrentSum>MaxSum){
                MaxSum=CurrentSum;
            }
            if(CurrentSum<0){
                CurrentSum=0;
            }
        }
        
        return MaxSum;
    }
}
