

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);

   
        for (int i = 0; i <= len2 - len1; i++) {
            String sub = s2.substring(i, i + len1);

            if (isAnagram(s1Arr, sub)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnagram(char[] sortedS1, String sub) {
        char[] subArr = sub.toCharArray();
        Arrays.sort(subArr);

        return Arrays.equals(sortedS1, subArr);
    }
}
