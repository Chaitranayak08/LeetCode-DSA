class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        double sum=0;
       for(int i=0;i<k;i++)
       {
         sum += nums[i];
        maxsum=sum;
       }
        for(int j=k;j<nums.length;j++){
            sum = sum - nums[j-k]+nums[j];
            maxsum=Math.max(maxsum,sum);
        
       }
       return (maxsum/k);
    }
}