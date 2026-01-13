class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();

        char[] c=s.toCharArray();
        char[] d=t.toCharArray();

        if(s.length()!=t.length()){
            return false;
        }
        Arrays.sort(c);
        Arrays.sort(d);
    
        return Arrays.equals(c,d);
    }
}