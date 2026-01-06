public class Solution {
    public bool IsPalindrome(int x) {
         int rev=0;
         int num=x;

         while(num>0){
            int s=num% 10;
            rev=(rev*10)+s;
            num/=10;
         }
         if(rev.Equals(x)){
            return true;
         }
        else
            return false;
    }
}