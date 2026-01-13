class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder rev = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
             char ch= s.charAt(i);
             rev.append(ch);
        }
        return rev.toString().equals(s);
    }
}