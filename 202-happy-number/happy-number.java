class Solution {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
        Set<Integer> seen = new HashSet<>();
       
        if(n==1){
            return true;
        }
           while(n!=1){
               if(seen.contains(n)){
                return false;
            }
            seen.add(n);
             int sum=0;
             int temp=n;
            while(temp>0){
                int digit=temp%10;
                sum+=(digit*digit);
                temp/=10;
            }
            n=sum;
         
            
            
           }
          
    return true;
}
}