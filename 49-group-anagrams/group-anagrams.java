class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> result = new HashMap<>();

         for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);

            String key=new String(arr);

            result.putIfAbsent(key,new ArrayList<>());
            result.get(key).add(str);
         }

         return new ArrayList<>(result.values());

      
    }
}