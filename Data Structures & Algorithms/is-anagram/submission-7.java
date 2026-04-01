class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] arr_s = s.toCharArray();
        // Arrays.sort(arr_s);
        

        // char[] arr_t = t.toCharArray();
        // Arrays.sort(arr_t);
   

        // return Arrays.equals(arr_s,arr_t);

        Map<Character, Integer> map_s = new HashMap<>();
        for(char i:s.toCharArray()){
            map_s.put(i, map_s.getOrDefault(i, 0) + 1);
        }

        Map<Character, Integer> map_t = new HashMap<>();
        for(char j:t.toCharArray()){
            map_t.put(j, map_t.getOrDefault(j, 0) + 1);
        }

        return map_s.equals(map_t);
    }
}