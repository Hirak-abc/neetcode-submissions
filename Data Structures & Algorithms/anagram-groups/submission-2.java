class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
      List<List<String>> result = new ArrayList<>();

        for (String s : strs) {
            result.add(new ArrayList<>(Arrays.asList(s)));
        }

       
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {

                if (isAnagram(result.get(i).get(0), result.get(j).get(0))) {
                    result.get(i).addAll(result.get(j)); 
                    result.remove(j);                    
                    j--; 
                }
            }
        }

        return result;
        }
        public boolean isAnagram(String s, String t) {
        
        char[] arr_s = s.toCharArray();
        Arrays.sort(arr_s);
        

        char[] arr_t = t.toCharArray();
        Arrays.sort(arr_t);
   

        return Arrays.equals(arr_s,arr_t);
        
        }
}
