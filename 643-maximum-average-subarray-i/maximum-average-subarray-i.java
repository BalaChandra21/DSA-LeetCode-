class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int wsum=0;
        for(int i=0;i<k;i++){
            wsum+=nums[i];
        }
        int maxsum=wsum;
        for(int i=k;i<nums.length;i++){
            wsum+=nums[i];
            wsum-=nums[i-k];
            maxsum=Math.max(maxsum, wsum);
        }
        return (double) maxsum/k;
    }
}