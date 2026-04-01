
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;

      
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxCount = 0;

            
            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'A';
                freq[idx]++;

          
                maxCount = Math.max(maxCount, freq[idx]);

                int windowLen = j - i + 1;
                int replacements = windowLen - maxCount;

                if (replacements <= k) {
                    maxLen = Math.max(maxLen, windowLen);
                } else {
                    
                    break;
                }
            }
        }
        return maxLen;
    }
}
