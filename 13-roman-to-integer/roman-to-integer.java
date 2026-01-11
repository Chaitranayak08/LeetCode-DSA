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
        char first = s.charAt(i);
        int firstval=map.get(first);

        char next=s.charAt(i+1);
        int nextval=map.get(next);

        if(firstval<nextval){
            number-=firstval;

        }else{
            number+=firstval;
        }

       
        
       }
         number+=map.get(s.charAt(s.length()-1));
        return number;
    }
}
