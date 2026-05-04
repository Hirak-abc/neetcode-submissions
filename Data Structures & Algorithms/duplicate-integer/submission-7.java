class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> lst_set = new HashSet<>();
        for(int i : nums){
            if(lst_set.contains(i))return true;
            lst_set.add(i);
        }
        return false;
    }
}