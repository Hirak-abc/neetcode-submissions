class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        int[] visited = new int[strs.length];   
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            if (visited[i] == 1) continue;  

            List<String> flag = new ArrayList<>();

            for (int j = i; j < strs.length; j++) {
                if (visited[j] == 0 && isAnagram(strs[i], strs[j])) {
                    flag.add(strs[j]);
                    visited[j] = 1;   
                }
            }

            ans.add(flag);
        }

        return ans;
    }
        
        public boolean isAnagram(String s, String t) {
        
        char[] arr_s = s.toCharArray();
        Arrays.sort(arr_s);
        

        char[] arr_t = t.toCharArray();
        Arrays.sort(arr_t);
   

        return Arrays.equals(arr_s,arr_t);

    }
}
