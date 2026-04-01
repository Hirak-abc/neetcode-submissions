class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr_s = s.toCharArray();
        Arrays.sort(arr_s);
        String sorted1 = new String(arr_s);

        char[] arr_t = t.toCharArray();
        Arrays.sort(arr_t);
        String sorted2 = new String(arr_t);

        return sorted1.equals(sorted2);
    }
}
