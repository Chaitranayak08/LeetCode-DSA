class Solution {
    public int romanToInt(String s) {
       
       HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number=0;
        for(int i=0;i<s.length()-1;i++){
            int first=map.get(s.charAt(i));
            int second=map.get(s.charAt(i+1));

            if(first<second){
                number-=first;
            }else{
                number+=first;
            }
        }
        return number+(map.get(s.charAt(s.length()-1)));
    }
}
