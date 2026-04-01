class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxLength = 0;

        for(int i=0;i<n;i++){
            Set<Character> st = new HashSet<>();

            for(int j=i;j<n;j++){

                char temp = s.charAt(j);

                if(st.contains(temp)){
                    break;
                }
                st.add(temp);

                maxLength = Math.max(maxLength,j-i+1); 
            }
        }

        return maxLength;
    }
}
