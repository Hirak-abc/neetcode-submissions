class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();

        if (k > n) return false;

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

 
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

  
        for (int i = 0; i < k; i++) {
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);
        }

        if (window.equals(need)) return true;

   
        for (int i = k; i < n; i++) {
            char add = s2.charAt(i);
            char remove = s2.charAt(i - k);

            window.put(add, window.getOrDefault(add, 0) + 1);

            window.put(remove, window.get(remove) - 1);
            if (window.get(remove) == 0) {
                window.remove(remove);
            }

            if (window.equals(need)) {
                return true;
            }
        }

        return false;
    }
}
