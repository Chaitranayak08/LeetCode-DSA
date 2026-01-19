class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length()==1)
             return 1;

        int n=s.length();

        HashSet<Character> set=new HashSet<>();
        int first=0;
        int second=0;
        int maxLen = 0;
        while(second<n){
            if(!set.contains(s.charAt(second))){
                set.add(s.charAt(second));
                second++;
                maxLen=Math.max(maxLen,second-first);
            }else{
                set.remove(s.charAt(first));
                first++;
            }
        }
        

            
        return maxLen;

    }
}