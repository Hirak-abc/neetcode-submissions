class Solution {
    public boolean isPalindrome(String s) {

        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowercase = cleanString.toLowerCase();

        int len  = lowercase.length();
        int head = 0;
        int tail = len-1;

        while (head<tail){
            if (lowercase.charAt(head)!=lowercase.charAt(tail)){
               return false;
            }
            head++;
            tail--;
        }

        return true;

    }
}
