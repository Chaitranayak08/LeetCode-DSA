class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);   // sorted form

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);         // store original word
        }

        return new ArrayList<>(map.values());
    }
}