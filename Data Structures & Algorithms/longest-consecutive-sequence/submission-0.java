class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        int max_count = 0;

        for(int i : nums){
            if( !mySet.contains(i)){
                mySet.add(i);
            }
        }

         for (int i : mySet) {

            if (!mySet.contains(i - 1)) {

                int count = 1;
                int current = i;

                while (mySet.contains(current + 1)) {
                    current++;
                    count++;
                }

                max_count = Math.max(max_count, count);
            }
        }

        return max_count;
    }
}