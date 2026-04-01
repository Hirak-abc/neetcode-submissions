class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        Map<Character, Integer> map1 = new HashMap<>();


        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

   
        for (int i = 0; i <= len2 - len1; i++) {
            Map<Character, Integer> map2 = new HashMap<>();

            for (int j = 0; j < len1; j++) {
                char c = s2.charAt(i + j);
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}
