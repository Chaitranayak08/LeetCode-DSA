class Solution {
    public void moveZeroes(int[] nums) {
    //    if(nums.length==1)
    //         return ;
        int first=0;
       for(int i=0;i<nums.length;i++){
      
        if(nums[i]!=0){
            nums[first]=nums[i];
            first++; 
        }
      
       }

       while(first<nums.length){
        nums[first]=0;
        first++;
       }
 
    }
}